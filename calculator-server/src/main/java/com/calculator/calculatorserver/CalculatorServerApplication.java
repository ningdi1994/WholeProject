package com.calculator.calculatorserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CalculatorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorServerApplication.class, args);
    }

    @Bean
    public Sampler getSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
