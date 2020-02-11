package com.objlove.web;


import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Liao {
    String name() default "not name";

    int age() default 0;

}
