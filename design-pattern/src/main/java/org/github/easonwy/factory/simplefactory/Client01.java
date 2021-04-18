package org.github.easonwy.factory.simplefactory;

/**
 * @author ewu
 * @date 2021/1/5 21:31
 */
public class Client01 {

    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();
    }
}
