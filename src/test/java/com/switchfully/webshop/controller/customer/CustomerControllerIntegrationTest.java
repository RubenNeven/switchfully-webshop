package com.switchfully.webshop.controller.customer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.switchfully.webshop.domain.customer.Address;
import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.customer.CustomerDto;
import com.switchfully.webshop.service.customer.CustomerService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class CustomerControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CustomerService customerService;

    @Nested
    class CreateCustomer {
        @Test
        @DisplayName("Return customer when creating with customer dto")
        void returnCustomerWhenCreatingCustomer() throws Exception {
            CustomerDto customerDto = new CustomerDto();
            Customer customer = new Customer(
                    "Ruben",
                    "Neven",
                    "rubenneven@gmail.com",
                    "0484/48.29.78");

            Mockito.when(customerService
                            .createCustomer(any(CustomerDto.class)))
                    .thenReturn(customer);

            mockMvc.perform(post("/customers")
                            .content(new ObjectMapper().writeValueAsString(customerDto))
                            .contentType(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andExpect(status().isCreated())
                    .andExpect(MockMvcResultMatchers.jsonPath("firstName").value("Ruben"))
                    .andExpect(MockMvcResultMatchers.jsonPath("lastName").value("Neven"))
                    .andExpect(MockMvcResultMatchers.jsonPath("emailAddress").value("rubenneven@gmail.com"))
                    .andExpect(MockMvcResultMatchers.jsonPath("phoneNumber").value("0484/48.29.78"));
        }
    }
}