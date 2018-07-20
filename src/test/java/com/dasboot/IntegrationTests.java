package com.dasboot;

import com.dasboot.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IntegrationTests {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Test
    public void testGetAll(){
        assertThat(shipwreckRepository.findAll().size(), is(greaterThanOrEqualTo(0)));
    }

}
