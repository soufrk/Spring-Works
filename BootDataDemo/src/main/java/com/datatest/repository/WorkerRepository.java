package com.datatest.repository;

import com.datatest.entity.Worker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface WorkerRepository<Worker, Long> extends CrudRepository<Worker, Long> {
}