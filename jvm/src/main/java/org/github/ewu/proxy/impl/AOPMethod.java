package org.github.ewu.proxy.impl;

import java.lang.reflect.Method;

/**
 * @author ewu
 * @date 2021-05-06 下午 3:28
 **/
public interface AOPMethod {
    //实例方法执行前执行的方法
    void after(Object proxy, Method method, Object[] args);

    //实例方法执行后执行的方法
    void before(Object proxy, Method method, Object[] args);
}
