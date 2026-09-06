package com.example.curd.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.curd.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, UUID> {


}
