package com.thoughtmechanix.simpleservice;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SimpleServiceClientIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() {
        String expectedString = "{\"message\":\"Hello Matt Durham\"}";
        String body = restTemplate.getForObject("/hello/Matt/Durham", String.class);
        assertThat(body).isEqualTo(expectedString);
    }
}