package com.dasboot;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)//!!!!!
@RunWith(SpringRunner.class)
public class WebIntegrationTests {

    private static String TEST_URL_1="http://localhost:8080/api/v1/shipwrecks";

    @Test
    public void testGetAll() throws IOException{

        TestRestTemplate restTemplate = new TestRestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(TEST_URL_1,String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode reponseJson = objectMapper.readTree(response.getBody());

        assertThat(reponseJson.isMissingNode(), is(false));

        assertThat( reponseJson.toString(), equalTo("[]"));

    }

}
