package org.github.ewu.proxy;

import org.github.ewu.proxy.impl.AOPMethod;
import org.github.ewu.proxy.impl.AnimalInterface;
import org.github.ewu.proxy.impl.DogImp;

import java.lang.reflect.Method;

/**
 * @author ewu
 * @date 2021-05-06 下午 3:21
 **/
public class AOPTest {

    public static void main(String[] args) {
        AnimalInterface dog = AnimalFactory.getAnimal(DogImp.class, new AOPMethod() {
            // 这里写方法执行前的AOP切入方法
            @Override
            public void before(Object proxy, Method method, Object[] args) {
                if (method.getName().equals("getProperty")) {
                    System.err.println("成功拦截" + method.getName() + "方法,启动");
                }
            }

            // 这里系方法执行后的AOP切入方法
            @Override
            public void after(Object proxy, Method method, Object[] args) {
                if (method.getName().equals("getProperty"))
                    System.err.println("成功拦截" + method.getName() + "方法,结束");

            }
        });

        dog.say();
        String name1 = "我的名字是" + dog.getName();
        System.out.println(name1);
        dog.setName("二狗子");
        String name2 = "我的名字是" + dog.getName();
        System.out.println(name2);
        dog.getProperty();
    }
}
