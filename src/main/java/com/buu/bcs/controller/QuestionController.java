package com.buu.bcs.controller;

import com.buu.bcs.dto.StandardResponse;
import com.buu.bcs.dto.question.QuestionResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "question")
public class QuestionController {
    @PostMapping(path = "question", produces = MediaType.APPLICATION_JSON_VALUE)
    public StandardResponse<QuestionResponse.Authen.Login> Login (@RequestBody QuestionResponse.Authen.Login request){
        return StandardResponse.success(null);
    }
}
