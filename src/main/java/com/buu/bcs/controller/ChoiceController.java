package com.buu.bcs.controller;

import com.buu.bcs.dto.StandardResponse;
import com.buu.bcs.dto.choice.ChoiceResponse;
import com.buu.bcs.dto.question.QuestionResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "choice")
public class ChoiceController {
    @PostMapping(path = "choice", produces = MediaType.APPLICATION_JSON_VALUE)
    public StandardResponse<ChoiceResponse.Authen.Login> Login (@RequestBody ChoiceResponse.Authen.Login request){
        return StandardResponse.success(null);
    }
}
