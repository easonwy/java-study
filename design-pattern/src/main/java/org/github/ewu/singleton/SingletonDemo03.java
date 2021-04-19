package org.github.ewu.singleton;

/**
 * 双重检测锁实现单例模式
 *
 *
 * 问题：
 *  - 基于编译器优化原因和JVM底层内部模型原因，偶尔会出问题。不建议使用
 *
 * @author ewu
 * @date 2021/1/3 20:31
 */
public class SingletonDemo03 {

    private static SingletonDemo03 instance = null;

    public static SingletonDemo03 getInstance() {
        if (instance == null) {
            SingletonDemo03 sc;
            synchronized (SingletonDemo03.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo03.class) {
                        if (sc == null) {
                            sc = new SingletonDemo03();
                        }
                    }
                    instance = sc;
                }
            }
        }

        return instance;
    }

    private SingletonDemo03() {}

}
