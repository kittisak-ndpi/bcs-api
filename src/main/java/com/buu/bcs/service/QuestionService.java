package com.buu.bcs.service;

import com.buu.bcs.dto.question.QuestionDto;

public interface QuestionService {

    public void saveQuestion(QuestionDto.QuestionRequest request) throws Throwable;
}
