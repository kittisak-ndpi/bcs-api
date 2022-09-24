package com.buu.bcs.service;

import com.buu.bcs.dto.user.UserRequest;
import com.buu.bcs.dto.user.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    UserResponse.Authen.Login RegisUser(UserRequest.Regis user);

    List<UserResponse.Authen.Login> test();
}
