package org.github.easonwy.factory.simplefactory;

/**
 * @author ewu
 * @date 2021/1/5 21:33
 */
public class CarFactory extends Client02 {

    public static Car createCar(String type) {
        if ("奥迪".equalsIgnoreCase(type)) {
            return new Audi();
        } else if ("比亚迪".equalsIgnoreCase(type)) {
            return new Byd();
        } else {
            return null;
        }
    }
}


