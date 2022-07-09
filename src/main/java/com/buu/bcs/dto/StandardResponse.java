package com.buu.bcs.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class StandardResponse<T> {
    @JsonProperty(value = "status")
    @Setter(value = AccessLevel.NONE)
    private boolean status;

    @JsonProperty(value = "code")
    private String code;

    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "data")
    private T data;

    public static <T> StandardResponse<T> success(T data) {
        return StandardResponse.success("", data);
    }

    public static <T> StandardResponse<T> success(String message, T data) {
        return StandardResponse.<T>builder()
                .status(true)
                .code(String.valueOf(HttpStatus.OK.value()))
                .message(message)
                .data(data)
                .build();
    }

    public static <T> StandardResponse<T> fail(HttpStatus code, String message) {
        return StandardResponse.fail(String.valueOf(code.value()), message);
    }

    public static <T> StandardResponse<T> fail(String code, String message) {
        return StandardResponse.fail(code, message, null);
    }

    public static <T> StandardResponse<T> fail(String code, String message, T data) {
        return StandardResponse.<T>builder().status(false).code(code).message(message).data(data).build();
    }

    public static <T> StandardResponse<T> error(T data) {
        return StandardResponse.<T>builder().status(false).code("error").message(null).data(data).build();
    }

    @Getter
    @Setter
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Page<T> {

        @JsonProperty("data")
        @Builder.Default
        private List<T> data = new ArrayList<>(0);

        @JsonProperty("totalItems")
        private long totalItems;
    }
}
