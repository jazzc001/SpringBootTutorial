package com.sg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sg")
public class BeanConfig {

    @Bean
    public Doctor doctor() {
        return new Doctor();
    }
}