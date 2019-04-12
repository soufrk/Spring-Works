package com.datatest;

import org.junit.runner.RunWith;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Does not start the application server. Entire ApplicationContext is loaded for 
 * test, without actually runnning the server.
 */ 
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BootDataDemoMockMvc {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void test() throws Exception {
		mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
		    .andExpect(content().string("Hello World !!"));
	}
}