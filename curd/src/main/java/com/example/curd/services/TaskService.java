package com.example.curd.services;

import java.util.List;
import java.util.UUID;

import com.example.curd.dto.Request;
import com.example.curd.dto.Response;

public interface TaskService {

    Response createTask(Request request);

    Response getTaskById(UUID id);

    Response updateTask(UUID id, Request request);

    List<Response>getAllTask();

    void deleteTask(UUID id);

}
