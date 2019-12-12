package com.springwebfluxdemo.repository;

import com.springwebfluxdemo.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;


/**
 * Created by rama4 on 12/5/2019.
 */
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {

    Flux<Employee> findByName(final String name);

}