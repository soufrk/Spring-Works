package com.datatest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.datatest.repository.WorkerRepository;
import com.datatest.entity.Worker;

@Service
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	WorkerRepository repository;
	
	/*@Autowired
	public void setWorkerRepository(WorkerRepository repository){
		this.repository = repository;
	}*/
	
	@Override
	public Worker getWorker(long workerId){
		Optional<Worker> w = repository.findById(workerId);
		// fill with optional logic
		return null;
	}
	
}