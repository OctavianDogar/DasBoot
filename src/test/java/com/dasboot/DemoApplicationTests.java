package com.dasboot;

import com.dasboot.controller.ShipwreckController;
import com.dasboot.model.Shipwreck;
import com.dasboot.repository.ShipwreckRepository;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class DemoApplicationTests {

	@Mock
	private ShipwreckRepository shipwreckRepository;

	@InjectMocks
	private ShipwreckController shipwreckController;

	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		mockMethods();
	}

	@Test
	public void testGetShipwreck(){
		Shipwreck shipwreck = shipwreckController.get(1L);
		Assert.assertEquals(1L,shipwreck.getId().longValue());

		MatcherAssert.assertThat(shipwreck.getId(), is(1L));
	}

	private void mockMethods(){
		mockGet();
	}

	private void mockGet(){
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		Mockito.when(shipwreckRepository.findOne(1L)).thenReturn(sw);
	}

}
