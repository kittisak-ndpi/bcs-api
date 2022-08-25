package com.buu.bcs.service;

import com.buu.bcs.dto.choice.ChoiceDto;;

public interface ChoiceService {

    public void saveQuestion(ChoiceDto.ChoiceRequest request) throws Throwable;
}
