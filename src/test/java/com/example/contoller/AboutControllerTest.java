package com.example.contoller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser
class AboutControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Sql("/sql/About/testAbout.sql")
    void shouldGetSingleAbout() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/about"))
                .andDo(print())
                .andExpect(jsonPath("$[0].name").value("Dominik"))
                .andExpect(jsonPath("$.*", hasSize(1)));

    }

}
