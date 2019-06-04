package com.mf.sbhw;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void contextLoads() throws Exception {
    }
    
    @Test
    public void restHelloWorldTest() throws Exception {
        this.mockMvc
            .perform(
                    get("/hello").param("name", "World"))
            .andExpect(status().isOk())
            .andExpect(
                    content().string("Hello, World\n"));
    }
}
