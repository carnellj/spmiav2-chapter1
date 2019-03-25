package com.thoughtmechanix.simpleservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SimpleServiceClientTest {

    @Autowired
    private MockMvc mockMvc;

    //This is a simple unit test
    @Test
    public void simpleServiceCallTest() throws Exception{
       String expectedString = "{\"message\":\"Hello Kyle Brueggeman\"}";
       this.mockMvc.perform(get("/hello/Kyle/Brueggeman"))
                .andExpect(status().isOk())
                .andExpect(content().string( expectedString));
    }

}
