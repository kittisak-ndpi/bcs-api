package com.buu.bcs.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.JoinColumn;

@NoArgsConstructor(access = AccessLevel.NONE)
public class UserResponse {

    @NoArgsConstructor(access = AccessLevel.NONE)
    public static class Authen {
        @Getter
        @Setter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Login {

            @JsonProperty("code")
            private String code;

            @JsonProperty("name")
            private String name;

            @JsonProperty("lastName")
            private String lastName;

            @JsonProperty("position")
            private String position;

            @JsonProperty("positionCode")
            private String positionCode;

            @JsonProperty("email")
            private String email;

            @JsonProperty("tel")
            private String tel;

            @JsonProperty("gender")
            private String gender;

            @JsonProperty("tokenId")
            private String tokenId;
        }
    }


}
