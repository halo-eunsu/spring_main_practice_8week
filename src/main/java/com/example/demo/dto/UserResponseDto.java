package com.example.demo.dto;


import com.example.demo.repository.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class UserResponseDto {


    String name;
    String username;
    String password;
    String job;
    String specialty;

    public static UserResponseDto from(User entity) {

        return new UserResponseDto(
          entity.getName(),
          entity.getUsername(),
          entity.getPassword(),
          entity.getJob(),
          entity.getSpecialty()
        );
    }

}
