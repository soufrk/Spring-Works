package com.datatest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.datatest.controller.WorkerController;

@RunWith(SpringRunner.class)
public class WorkerControllerTest {
	
	@Autowired
	WorkerController controller;
	
	@Test
	public void getWorkerTest() {
		assertNotNull("Controller instance is not null", controller);
	}

}
