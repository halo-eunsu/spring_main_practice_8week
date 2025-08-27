package com.example.demo.controller;


import com.example.demo.dto.UserRequestDto;
import com.example.demo.dto.UserResponseDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {


    private  final UserService userService;

    @PostMapping("")
    public ResponseEntity<UserResponseDto> create(@RequestBody UserRequestDto request) {

        UserResponseDto userResponseDto = userService.createUser(request);

        return ResponseEntity.ok(userResponseDto);
    }


}
