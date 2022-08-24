package com.buu.bcs.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Getter
public class ApplicationConfiguration {
    private static ApplicationConfiguration instance;

    public static ApplicationConfiguration getInstance() {
        if (ApplicationConfiguration.instance == null) {
            ApplicationConfiguration.instance = new ApplicationConfiguration();

        }
        return ApplicationConfiguration.instance;
    }

    public static void setInstance(ApplicationConfiguration instance) {
        ApplicationConfiguration.getInstance();
        ApplicationConfiguration.instance = instance;
    }

    @Value("${server.port}")
    private String serverPort;
}
