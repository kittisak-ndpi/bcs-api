package com.buu.bcs.service;

import com.buu.bcs.dto.questiontopic.QuestionTopicDto;

public interface QuestionTopicService {

    public void saveQuestion(QuestionTopicDto.QuestionTopicRequest request) throws Throwable;
}
