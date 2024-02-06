package com.study.condition.v1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(MyCondition.class)
public class MyConfigV1 {

    @Bean
    public ConditionV1Controller conditionV1Controller() {
        return new ConditionV1Controller();
    }
}
