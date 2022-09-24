package com.buu.bcs.controller;

import com.buu.bcs.dto.StandardResponse;
import com.buu.bcs.dto.user.UserRequest;
import com.buu.bcs.dto.user.UserResponse;
import com.buu.bcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "authen")
public class AuthenController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "login", produces = MediaType.APPLICATION_JSON_VALUE)
    public StandardResponse<List<UserResponse.Authen.Login>> Login (@RequestBody UserRequest.Authen.Login request){
        UserResponse.Authen.Login response = new UserResponse.Authen.Login();

        return StandardResponse.success(userService.test());
    }

}
