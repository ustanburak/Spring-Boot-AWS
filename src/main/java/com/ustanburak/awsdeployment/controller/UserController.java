package com.ustanburak.awsdeployment.controller;

import com.ustanburak.awsdeployment.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("v1/users")
    public ResponseEntity<?> getUsers() {
        final var response = userService.getUsers();
        return ResponseEntity.ok(response);
    }
}
