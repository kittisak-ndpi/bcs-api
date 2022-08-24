package com.buu.bcs.configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class EndpointConfiguration {
    private static EndpointConfiguration instance;

    public static EndpointConfiguration getInstance() {
        if (instance == null) {
            instance = new EndpointConfiguration();
        }
        return instance;
    }

    public void config(ApplicationConfiguration appConfig) {

    }
}
