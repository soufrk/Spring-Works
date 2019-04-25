package com.datatest.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.datatest.entity.Worker;

@Service
public interface WorkerService {
	
	Worker getWorker(long workerId);
	Optional<Worker> getWorkerOptional(long workerId);
	
}