package com.datatest;

import org.junit.runner.RunWith;
import org.junit.Test;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class BootDataDemoWebLayerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void testRootAlive() throws Exception {
		mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
		    .andExpect(content().string("Hello World !!"));
	}
	
}