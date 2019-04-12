package com.datatest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("book")
public class BookController {
	
	@GetMapping("/{id}")
	public String getBook(@PathVariable String id) {
		return "Book" + id;
	}
	
	@GetMapping("/double")
	public int sum(@RequestParam(defaultValue="0") int param1){
		return param1;
	}
	
}