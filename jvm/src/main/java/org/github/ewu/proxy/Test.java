package org.github.ewu.proxy;

import org.github.ewu.proxy.impl.DogImp;

/**
 * @author ewu
 * @date 2021-05-06 下午 2:31
 **/
public class Test {
    public static void main(String[] args) {
        DogImp dogImp = new DogImp();
        System.out.println(dogImp.getName());
        dogImp.getProperty();
    }
}
