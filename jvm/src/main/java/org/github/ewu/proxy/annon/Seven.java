package org.github.ewu.proxy.annon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Seven
 *
 * @author ewu
 * @date 2021-05-06 下午 2:05
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface Seven {

    String value() default "小黑";

    String Property() default "无属性";
}
