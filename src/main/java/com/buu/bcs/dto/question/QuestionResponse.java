package com.buu.bcs.dto.question;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.JoinColumn;

@NoArgsConstructor(access = AccessLevel.NONE)
public class QuestionResponse {

    @NoArgsConstructor(access = AccessLevel.NONE)
    public static class Authen {
        @Getter
        @Setter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Login {

            @JsonProperty("id")
            private String id;

            @JsonProperty("index")
            private int index;

            @JsonProperty("question")
            private String question;

        }
    }


}
