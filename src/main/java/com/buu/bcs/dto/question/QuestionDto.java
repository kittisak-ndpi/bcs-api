package com.buu.bcs.dto.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class QuestionDto {
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class QuestionRequest {

        @JsonProperty("id")
        private String sbc_ans_id;

        @JsonProperty("index")
        private LocalDateTime answ_index;

        @JsonProperty("answer")
        private LocalDateTime answer;

        @JsonProperty("ans_create_date")
        private LocalDateTime ans_create_date;

        @JsonProperty("ans_create_by")
        private String ans_create_by;

        @JsonProperty("ans_update_date")
        private LocalDateTime ans_update_date;

        @JsonProperty("ans_update_by")
        private String ans_update_by;
    }


}
