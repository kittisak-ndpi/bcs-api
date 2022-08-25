package com.buu.bcs.dto.choice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class ChoiceDto {
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ChoiceRequest {

        @JsonProperty("id")
        private String sbc_ans_id;

        @JsonProperty(name = "ans_index")
        private int ans_index;

        @JsonProperty(name = "sbc_answer")
        private String answer;

        @JsonProperty(name = "ans_create_date")
        private LocalDateTime ans_create_date;

        @JsonProperty(name = "ans_create_by")
        private String ans_create_by;

        @JsonProperty(name = "ans_update_date")
        private LocalDateTime ans_update_date;

        @JsonProperty(name = "ans_update_by")
        private String ans_update_by;
    }

    }


}
