package dev.masuareb.fullstackapp;

import dev.masuareb.fullstackapp.web.CarController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FullstackAppApplicationTests {
	@Autowired
	private CarController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
