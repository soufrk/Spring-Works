package com.datatest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.datatest.controller.RestfulController;

import static org.junit.Assert.*;

/**
 * Tests by starting the application and checking if controllers are available 
 * in the ApplicationContext.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDataDemoSmokeTest {
	
	@Autowired
	private RestfulController controller;

	@Test
	public void contextLoads() {
		assertTrue(controller != null);
	}

}