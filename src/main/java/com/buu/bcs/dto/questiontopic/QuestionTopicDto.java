package com.buu.bcs.dto.questiontopic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class QuestionTopicDto {
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class QuestionTopicRequest {

        @JsonProperty("id")
        private String ex_id;

        @JsonProperty(name = "sbc_title")
        private String title;

        @JsonProperty(name = "sbc_create_date")
        private LocalDateTime create_date;

        @JsonProperty(name = "sbc_create_by")
        private String create_by;

        @JsonProperty(name = "sbc_update_date")
        private LocalDateTime update_date;

        @JsonProperty(name = "sbc_update_by")
        private String update_by;
    }

    }


}
