package com.datatest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.datatest.service.WorkerService;
import com.datatest.entity.Worker;

@RestController("worker")
public class WorkerController {
	
	@Autowired
	WorkerService wService;
	
	@GetMapping
	public String getWorker(@PathVariable("id") long id){
		Worker w = null;
		return " ";
	}
}