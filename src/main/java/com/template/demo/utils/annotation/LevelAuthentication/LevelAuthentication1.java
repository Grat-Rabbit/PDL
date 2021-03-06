package com.template.demo.utils.annotation.LevelAuthentication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义一个level权限等级认证注解，用来判断用户的权限等级1
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LevelAuthentication1 {
    boolean required() default true;
}
