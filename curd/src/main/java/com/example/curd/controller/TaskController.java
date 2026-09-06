package com.example.curd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curd.dto.Request;
import com.example.curd.dto.Response;
import com.example.curd.services.TaskService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/v1/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/")
    public Response createTask(@RequestBody Request request) {
        return taskService.createTask(request);
    }

    @GetMapping("/{id}")
    public Response getTaskById(@PathVariable UUID id) {
        return taskService.getTaskById(id);

    }

    @PutMapping("/{id}")
    public Response updateTask(@PathVariable UUID id, @RequestBody Request request) {
        return taskService.updateTask(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable UUID id) {
        taskService.deleteTask(id);
    }

    @GetMapping("/")
    public List<Response> getAllTask() {
        return taskService.getAllTask();
    }

}
