package com.datatest.controller;

import java.sql.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import static org.mockito.Mockito.when;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.datatest.controller.WorkerController;
import com.datatest.service.WorkerService;
import com.datatest.entity.Worker;

/**
 * This is the lightest test using @WebMvcTest
 * 
 * App Server - not used
 * App Context - not used completely
 * Web Context - used completely
 * 
 * @author soufrk
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(WorkerController.class)
public class WorkerControllerWebLayerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	private WorkerService service;
	
	@Test
	public void testControllerIsAlive() throws Exception {
		mockMvc.perform(get("/worker")).andDo(print()).andExpect(status().isOk())
		        .andExpect(content().string("Hello Worker !!"));
	}
	
	@Test
	public void testControllerRoot() throws Exception {
		mockMvc.perform(get("/worker/")).andDo(print()).andExpect(status().isOk())
		        .andExpect(content().string("Hello World !!"));
	}
	
	/*@Test
	public void getWorkerStringTest() throws Exception {
		mockMvc.perform(get("/worker/" + id)).andDo(print()).andExpect(status().isOk())
		        .andExpect(content().string());
	}*/
	
	/** First implementation */
	/*@Test
	public void getWorkerTestPositive() throws Exception {
		Long id = 1234l;
		Worker w = new Worker();
		w.setId(id);
		w.setFirstName("AAA");
		w.setLastName("BBB");
		w.setSalary(4500.00);
		w.setDoj(new Date(System.currentTimeMillis()));
		w.setDepartment("ABCD");
		//ObjectMapper mapper = new ObjectMapper();
		
		when(service.getWorker(1234)).thenReturn(w);
		mockMvc.perform(get("/worker/" + id)).andDo(print()).andExpect(status().isOk())
		        .andExpect(content().string(
				"{\"id\":1234,\"firstName\":\"AAA\",\"lastName\":\"BBB\",\"salary\":4500.0,\"doj\":\"2019-04-16\",\"department\":\"ABCD\"}"));
	}*/
	
	/** Updated with JSON conversion */
	/*@Test
	public void getWorkerTestPositive() throws Exception {
		Long id = 1234l;
		Worker w = new Worker();
		w.setId(id);
		w.setFirstName("AAA");
		w.setLastName("BBB");
		w.setSalary(4500.00);
		w.setDoj(new Date(System.currentTimeMillis()));
		w.setDepartment("ABCD");
		ObjectMapper mapper = new ObjectMapper();
		when(service.getWorker(1234)).thenReturn(w);
		mockMvc.perform(get("/worker/" + id)).andDo(print()).andExpect(status().isOk())
		        .andExpect(content().string(mapper.writeValueAsString(w)
				//"{\"id\":1234,\"firstName\":\"AAA\",\"lastName\":\"BBB\",\"salary\":4500.0,\"doj\":\"2019-04-16\",\"department\":\"ABCD\"}"));
				));
	}*/
	
	/** Updated with using injected JSON mapper */
	/*@Test
	public void getWorkerTestPositive() throws Exception {
		Long id = 1234l;
		Worker w = new Worker();
		w.setId(id);
		w.setFirstName("AAA");
		w.setLastName("BBB");
		w.setSalary(4500.00);
		w.setDoj(new Date(System.currentTimeMillis()));
		w.setDepartment("ABCD");
		when(service.getWorker(1234)).thenReturn(w);
		mockMvc.perform(get("/worker/" + id)).andDo(print()).andExpect(status().isOk())
		        .andExpect(content().string(mapper.writeValueAsString(w)
				));
	}*/
	
	/** Mocking new optional method of service class. */
	@Test
	public void getWorkerTestPositive() throws Exception {
		Long id = 1234l;
		Worker w = new Worker();
		w.setId(id);
		w.setFirstName("AAA");
		w.setLastName("BBB");
		w.setSalary(4500.00);
		w.setDoj(new Date(System.currentTimeMillis()));
		w.setDepartment("ABCD");
		when(service.getWorkerOptional(1234)).thenReturn(Optional.of(w));
		mockMvc.perform(get("/worker/" + id)).andDo(print()).andExpect(status().isOk())
		        .andExpect(content().string(mapper.writeValueAsString(w)
				));
	}
	
	/** Old method implementation */
	/*@Test
	public void getWorkerTestNegative() throws Exception {
		when(service.getWorker(1234)).thenReturn(null);
		mockMvc.perform(get("/worker/1234")).andDo(print()).andExpect(status().isNoContent());
	}*/
	
	/** Updated behaviour - Expect HTTP 404 when no results found. */
	/*@Test
	public void getWorkerTestNegative() throws Exception {
		Worker w = null;
		when(service.getWorker(1234)).thenReturn(null);
		mockMvc.perform(get("/worker/1234")).andDo(print()).andExpect(status().isNotFound());
	}*/
	
	/** Updated with new optional method in Service class. */
	@Test
	public void getWorkerTestNegative() throws Exception {
		Worker w = null;
		when(service.getWorkerOptional(1234)).thenReturn(Optional.ofNullable(null));
		mockMvc.perform(get("/worker/1234")).andDo(print()).andExpect(status().isNotFound());
	}

}
