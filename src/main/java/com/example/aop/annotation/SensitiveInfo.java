package com.example.aop.annotation;

import com.example.aop.config.SensitiveInfoSerialize;
import com.example.aop.enums.SensitiveType;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lee
 * @version 1.0
 * @date 2021/1/27
 */


@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonSerialize(using = SensitiveInfoSerialize.class)
public @interface SensitiveInfo {
    SensitiveType value();
}
