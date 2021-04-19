package org.github.ewu.singleton;

/**
 * 懒汉式实现（单例对象延迟加载）
 * <p>
 * 要点：
 * - lazy load!  延迟加载，懒加载，真正用的时候才加载
 * 问题：
 * - 资源利用率高了。但是，每次调用getInstance方法都要同步，并发效率低。
 *
 * @author ewu
 * @date 2021/1/3 20:25
 */
public class SingletonDemo02 {

    /**
     * 不进行初始化，调用时才初始化。资源利用率高
     */
    private static SingletonDemo02 instance;

    /**
     * 加同步块， 每次调用getInstance方法都要同步，并发效率低。
     *
     * @return
     */
    public static synchronized SingletonDemo02 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo02();
        }

        return instance;
    }

    /**
     * 私有化构造函数
     */
    private SingletonDemo02() { }

}
