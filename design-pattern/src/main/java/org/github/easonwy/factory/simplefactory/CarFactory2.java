package org.github.easonwy.factory.simplefactory;

/**
 * @author ewu
 * @date 2021/1/5 21:33
 */
public class CarFactory2 extends Client02 {

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}


