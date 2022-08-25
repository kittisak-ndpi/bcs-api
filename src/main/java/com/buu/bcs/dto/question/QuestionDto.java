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
        private String qt_id;

        @JsonProperty(name = "qt_index")
        private int qt_index;

        @JsonProperty(name = "qt_question")
        private String qt_question;

        @JsonProperty(name = "qt_create_date")
        private LocalDateTime create_date;

        @JsonProperty(name = "qt_create_by")
        private String create_by;

        @JsonProperty(name = "qt_update_date")
        private LocalDateTime update_date;

        @JsonProperty(name = "qt_update_by")
        private String update_by;
    }

    }


}
