package com.tcoker.MyTasks.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcoker.MyTasks.entity.User;

public interface UserRepo extends CrudRepository<User,Integer> {

}
