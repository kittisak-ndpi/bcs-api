package com.buu.bcs.service.impl;

import com.buu.bcs.dto.user.UserRequest;
import com.buu.bcs.dto.user.UserResponse;
import com.buu.bcs.entity.UsersEntity;
import com.buu.bcs.repository.UsersRepository;
import com.buu.bcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserResponse.Authen.Login RegisUser(UserRequest.Regis user) {
        UserResponse.Authen.Login authen = new UserResponse.Authen.Login();
        UsersEntity usersEntity = usersRepository.findByUsernameAndPassword("", "").orElseThrow(
                ()-> new RuntimeException("Not found user")
        );
        authen.setCode(usersEntity.getId());
        return authen;
    }

    @Override
    public List<UserResponse.Authen.Login> test() {
        return null;
    }
}
