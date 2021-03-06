package com.develop.jina1.order;

import com.develop.jina1.security.WithCustomUserDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@PropertySource("/application.properties")
@ActiveProfiles("test")
@WithCustomUserDetails
class OrderTest {

    @Autowired
    MockMvc mockMvc;

//    @Test
//    void get_order_thenReturn_Ok() throws Exception {
//        mockMvc.perform(get("/api/orders/1"))
//                .andExpect(status().isOk());
//    }
}