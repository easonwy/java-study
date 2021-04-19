package org.github.ewu.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ewu
 * @date 2021/1/3 20:50
 */
public class Client02 {
    SingletonDemo04 s3 = SingletonDemo04.getInstance();

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        SingletonDemo06 s1 = SingletonDemo06.getInstance();
        SingletonDemo06 s2 = SingletonDemo06.getInstance();

        System.out.println(s1);
        System.out.println(s2);


        // 通过反射的方式直接电泳私有构造器
        Class<SingletonDemo06> clazz = (Class<SingletonDemo06>)Class.forName("org.github.ewu.singleton.SingletonDemo06");
        Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        SingletonDemo06 s3 = c.newInstance();
        SingletonDemo06 s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);

        // 通过反序列化的方式构造多个对象
        FileOutputStream fos = new FileOutputStream("e:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
        SingletonDemo06 s5 = (SingletonDemo06)ois.readObject();
        System.out.println(s5);








    }
}
