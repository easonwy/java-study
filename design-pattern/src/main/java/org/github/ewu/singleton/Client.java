package org.github.ewu.singleton;

/**
 * @author ewu
 * @date 2021/1/3 20:50
 */
public class Client {
    SingletonDemo04 s3 = SingletonDemo04.getInstance();

    public static void main(String[] args) {
        SingletonDemo04 s1 = SingletonDemo04.getInstance();
        SingletonDemo04 s2 = SingletonDemo04.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);


        SingletonDemo05 sd = SingletonDemo05.INSTANCE;
        SingletonDemo05 sd2 = SingletonDemo05.INSTANCE;
        System.out.println(sd);
        System.out.println(sd2);
        System.out.println(sd == sd2);
    }
}
