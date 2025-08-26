package com.example.demo.repository.entity;

import com.example.demo.dto.Job;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private Integer id;
    private String username;
    private String password;
    private String name;
    private String job;
    private String specialty;
    private LocalDateTime createdAt;


}
