package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by masahirayamamoto on 2/27/16.
 */
@Configuration
public class AppConfig {
    @Bean
    Calculator calculator() {
        return new AddCalculator();
    }
}
