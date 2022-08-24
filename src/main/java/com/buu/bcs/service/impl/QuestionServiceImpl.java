package com.buu.bcs.service.impl;

import com.buu.bcs.dto.question.QuestionDto;
import com.buu.bcs.entity.QuestionEntity;
import com.buu.bcs.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {

    @Override
    public void saveQuestion(QuestionDto.QuestionRequest request) throws Throwable {
        QuestionEntity questionEntity = new QuestionEntity();
    }

}
