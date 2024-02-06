package com.study.condition.v2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "isEnabled", havingValue = "true")
public class MyConfigV2 {
    @Bean
    public ConditionV2Controller conditionV2Controller() {
        return new ConditionV2Controller();
    }
}
