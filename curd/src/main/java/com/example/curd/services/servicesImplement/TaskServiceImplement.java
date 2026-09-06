package com.example.curd.services.servicesImplement;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.curd.dto.Request;
import com.example.curd.dto.Response;
import com.example.curd.entity.TaskEntity;
import com.example.curd.repository.TaskRepository;
import com.example.curd.services.TaskService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskServiceImplement implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public Response createTask(Request request) {

        // In task entity we have to set values from request dto and save it to database
        TaskEntity task = new TaskEntity();

        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());

        taskRepository.save(task);

        // Now we have to create response dto and set value from task entity and return
        // it

        Response response = new Response();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreateAt(task.getCreatedAt());
        response.setMessage("Task created successfully");

        return response;
    }

    @Override
    public Response getTaskById(UUID id) {

        TaskEntity task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));

        Response response = new Response();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreateAt(task.getCreatedAt());
        response.setMessage("Task found successfully");

        return response;
    }

    @Override
    public Response updateTask(UUID id, Request request) {

        TaskEntity task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));

        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());

        taskRepository.save(task);

        Response response = new Response();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreateAt(task.getCreatedAt());
        response.setMessage("Task updated successfully");
        return response;
    }

    @Override
    public void deleteTask(UUID id) {
        TaskEntity task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
        taskRepository.delete(task);
        Response response = new Response();
        response.setMessage("Task deleted successfully");
    }

    @Override
    public List<Response> getAllTask() {

        List<TaskEntity> tasks = taskRepository.findAll();
        if (tasks.isEmpty()) {
            throw new RuntimeException("No task found");
        }

        return tasks.stream().map(task -> {
            Response response = new Response();
            response.setId(task.getId());
            response.setTitle(task.getTitle());
            response.setDescription(task.getDescription());
            response.setCreateAt(task.getCreatedAt());
            response.setMessage("Tasks found successfully");
            return response;
        }).collect(Collectors.toList());
    }
}
