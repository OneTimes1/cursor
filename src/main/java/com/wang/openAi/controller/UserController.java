package com.wang.openAi.controller;

import com.wang.hazelcast.service.UserService;
import com.wang.openAi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/getUser",params = {"id","name"})
    public User getUser(@RequestParam("id") Integer id,@RequestParam("name") String name ){
        return userService.getUser(id);
    }

}
