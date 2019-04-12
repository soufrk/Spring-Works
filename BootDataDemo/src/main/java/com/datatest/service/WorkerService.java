package com.datatest.service;

import org.springframework.stereotype.Service;

import com.datatest.entity.Worker;

//@Service
public interface WorkerService {
	
	Worker getWorker(long workerId);
}