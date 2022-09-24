package com.buu.bcs.service.impl;

import com.buu.bcs.dto.question.QuestionDto;
import com.buu.bcs.entity.QuestionEntity;
import com.buu.bcs.entity.UsersEntity;
import com.buu.bcs.repository.UsersRepository;
import com.buu.bcs.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;

public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void saveQuestion(QuestionDto.QuestionRequest request) throws Throwable {
        UsersEntity save = new UsersEntity();
        usersRepository.save(save);
    }

}
