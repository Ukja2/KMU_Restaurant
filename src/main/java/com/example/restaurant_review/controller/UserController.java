package com.example.restaurant_review.controller;


import com.example.restaurant_review.domain.User;
import com.example.restaurant_review.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userservice){
        this.userService = userservice;
    }


    @PostMapping
    //post요청시 클라이언트의 json형태의 데이터를 java 객체 타입으로 변환 후 저장
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    //Get요청시 유저 리스트 반환
    public List<User> getAllUsers(){
        return userService.findAll();
    }
}
