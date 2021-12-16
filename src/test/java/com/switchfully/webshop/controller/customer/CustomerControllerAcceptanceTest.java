package com.switchfully.webshop.controller.customer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.switchfully.webshop.domain.customer.Address;
import com.switchfully.webshop.domain.customer.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CustomerControllerAcceptanceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void createCustomer() throws Exception {
        CustomerDto customerDto = new CustomerDto()
                .setId("1")
                .setFirstName("Ruben")
                .setLastName("Neven")
                .setEmailAddress("rubenneven@gmail.com")
                .setAddress(new Address("Pelserweg", "5", "Diepenbeek","3590","Belgium"))
                .setPhoneNumber("0484/48.29.78");

        mockMvc.perform(post("/customers")
                        .content(new ObjectMapper().writeValueAsString(customerDto))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated());
    }
}