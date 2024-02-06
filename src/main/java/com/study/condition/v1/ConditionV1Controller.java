package com.study.condition.v1;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConditionV1Controller {
    @PostConstruct
    public void init() {
        log.info(" >> ConditionV1Controller init");
    }
}
