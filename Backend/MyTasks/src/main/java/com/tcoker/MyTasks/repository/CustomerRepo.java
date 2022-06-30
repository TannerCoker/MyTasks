package com.tcoker.MyTasks.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcoker.MyTasks.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {

}
