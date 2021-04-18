package org.github.easonwy.singleton;

/**
 * 饿汉式单例模式实现
 *
 * @author ewu
 * @date 2021/1/3 20:21
 */
public class SingletonDemo01 {

    /**
     * 类出事化时， 立即加载这个对象（没有延时加载优势）， 加载类时，天然的线程安全。
     */
    private static SingletonDemo01 instance = new SingletonDemo01();

    private SingletonDemo01() {}

    /**
     * 方法没有同步，调用效率高
     *
     * @return
     */
    public static SingletonDemo01 getInstance() {
        return instance;
    }
}
