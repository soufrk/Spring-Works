package com.datatest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;

import com.datatest.service.WorkerService;
import com.datatest.entity.Worker;

@RestController
@RequestMapping("worker")
public class WorkerController {
	
	@Autowired
	WorkerService wService;
	
	@GetMapping
	public String isAlive(){
		return "Hello Worker !!";
	}
	
	@GetMapping("/")
	public String isAlive2(){
		return "Hello World !!";
	}
	
	/*@GetMapping("{id}")
	//@GetMapping("/{id}")
	public Worker getWorker(@PathVariable("id") long id){
		Worker w = null;
		return wService.getWorker(id);
	}*/
	/* With this question arises how to deal with records not found ? */
	
	/* -------- Can this smethod be used alongwith previous defined method ? --------- */
	/*@GetMapping("{cid}")
	public String getWorkerString(@PathVariable("cid") String cid){
		return "Hello Worker-" + cid + "!!";
	}*/
	
	/**
	 * How to defend against null return ?
	 * Method 1
	 * Adding HttpServletResponseBody as parameter
	 */
	/*@GetMapping("{id}")
	public Worker getWorker(@PathVariable("id") long id, HttpServletResponse response){
		Worker w = wService.getWorker(id);
		if(w == null)
			response.setStatus(204);
		return w;
	}*/
	
	/**
	 * How to defend against null return ?
	 * Method 2
	 * Using ResponseEntity
	 */
	@GetMapping("{id}")
	public ResponseEntity<Worker> getWorker(@PathVariable("id") long id, HttpServletResponse response){
		Worker w = wService.getWorker(id);
		if(w == null)
			response.setStatus(204);
		return w;
	}
}