package com.fitness.userservice.controller;

import com.fitness.userservice.model.dto.RegisterRequest;
import com.fitness.userservice.model.dto.UserResponse;
import com.fitness.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/{userid}")
    public ResponseEntity<UserResponse> fetchUserProfile(@PathVariable String userid){
        return ResponseEntity.ok(userService.fetchUserProfile(userid));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerNewUSer(@Valid  @RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.registerNewUser(request));
    }

    @GetMapping("/{userId}/validate")
    public ResponseEntity<Boolean> validateUser(@PathVariable String userId){
        return ResponseEntity.ok(userService.existByUserId(userId));
    }
}
