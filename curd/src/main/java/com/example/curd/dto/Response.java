package com.example.curd.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class Response {

    private UUID id;
    private String title;
    private String description;
    private LocalDateTime createAt;
    private String message;
}
