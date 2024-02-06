package com.study.condition.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Slf4j
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean isEnabled = Boolean.parseBoolean(context.getEnvironment().getProperty("isEnabled"));
        log.info("isEnabled= {}", isEnabled);
        return isEnabled;
    }
}
