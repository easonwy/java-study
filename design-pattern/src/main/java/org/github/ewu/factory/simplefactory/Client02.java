package org.github.ewu.factory.simplefactory;

/**
 * @author ewu
 * @date 2021/1/5 21:31
 */
public class Client02 {

    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");

        c1.run();
        c2.run();

        Car c3 = CarFactory2.createAudi();
        Car c4 = CarFactory2.createByd();

        c3.run();
        c4.run();
    }
}
