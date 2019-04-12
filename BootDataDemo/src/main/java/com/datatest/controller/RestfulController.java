package com.datatest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class RestfulController {
	
	@GetMapping("/")
	public String testAlive() {
		return "Hello World !!";
	}
	
	@GetMapping("http")
	public String testSimpleUrl() {
		return "SimpleURL";
	}
	
	@GetMapping("HTTP GET")
	public String testSimpleUrl1() {
		return "GET URL";
	}
	
	@GetMapping("/double")
	public int sum(@RequestParam(defaultValue="0") int param1){
		return param1;
	}
	
	/*@GetMapping("/sum")
	public int sum(@RequestParam("param1")int param1, @RequestParam("param2")int param2){
		return param1 + param2;
	}*/
	
	/*@GetMapping("/sum")
	public int sum(@RequestParam("param1")int param1, @RequestParam("param2")String param2){
		return param1;
	}*/
	
	@GetMapping("/double/{num}")
	public int twice(@PathVariable(value="num")int number){
		return number * 2;
	}
	
}