package com.tcoker.MyTasks.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcoker.MyTasks.entity.Task;

public interface TaskRepository extends CrudRepository<Task,Integer> {

}
