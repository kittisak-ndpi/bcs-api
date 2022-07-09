package com.buu.bcs.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.lang.Nullable;

@NoArgsConstructor(access = AccessLevel.NONE)
public class UserRequest {

    @NoArgsConstructor(access = AccessLevel.NONE)
    public static class Authen {

        @Getter
        @Setter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Login {

            @JsonProperty("username")
            private String username;

            @JsonProperty("password")
            private String password;

            @Nullable
            @JsonProperty("clientId")
            private String clientId;
        }
    }

}
