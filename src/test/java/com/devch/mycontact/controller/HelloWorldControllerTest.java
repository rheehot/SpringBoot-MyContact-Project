package com.devch.mycontact.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@SpringBootTest
class HelloWorldControllerTest {

  @Autowired
  private HelloWorldController helloWorldController;

  private MockMvc mockMvc;

  @Test
  void helloWorldControllerTest() {
    assertThat(helloWorldController.helloWorld()).isEqualTo("Hello World");
  }

  @Test
  void mockMvcTest() throws Exception {
    mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();

    mockMvc.perform(
        MockMvcRequestBuilders.get("/api/helloWorld")
    )
    .andDo(print())
    .andExpect(status().isOk())
    .andExpect(content().string("Hello World"));
  }
}