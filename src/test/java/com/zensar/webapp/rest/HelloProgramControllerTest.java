package com.zensar.webapp.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloProgramControllerTest {

	@Autowired//To enable autowiring for mockMvc test class must be annotated with  @AutoConfigureMockMvc
	private MockMvc mock;//MockMvc is a class given by spring mvc to perform testing of spring controller.
	@Test
	public void sayHelloTest() throws Exception {
	mock
		.perform(MockMvcRequestBuilders.get("/greet"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Welcome to hello"));	

	}
	@Test
	public void createMessage() throws Exception
	{
		mock
			.perform(MockMvcRequestBuilders.post("/greet").content("Welcome"))
			.andExpect(MockMvcResultMatchers.status().isCreated())
			.andExpect(MockMvcResultMatchers.content().string("Message created Welcome"));
	}
}
