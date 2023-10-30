package com.mf.sbhw;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
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
                    content().string("Hello, World.\n"));
    }
}
