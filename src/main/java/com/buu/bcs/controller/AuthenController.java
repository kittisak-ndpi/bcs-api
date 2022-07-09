package com.buu.bcs.controller;

import com.buu.bcs.dto.StandardResponse;
import com.buu.bcs.dto.user.UserRequest;
import com.buu.bcs.dto.user.UserResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "authen")
public class AuthenController {
    @PostMapping(path = "login", produces = MediaType.APPLICATION_JSON_VALUE)
    public StandardResponse<UserResponse.Authen.Login> Login (@RequestBody UserRequest.Authen.Login request){
        return StandardResponse.success(null);
    }
}
