package com.example.dubbo.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * @Author Ciwei
 * @Date 2019/5/2/002
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface RedisLock {

    String lockPrefix() default "";

    String lockKey() default "";

    String timeOut() default "5";

    TimeUnit timeUnit() default TimeUnit.SECONDS;

}
