package org.github.ewu.singleton;

/**
 * 静态内部类实现单例模式(也是一种懒加载方式）
 *
 * 要点：
 *   - 外部类没有static树形，则不会像饿汉式那样立即加载对象
 *   - 只有真正调用getInstance方法才会加载静态内部类。加载类时是线程安全的。instance是static final类型，
 *     保证了内存中只有这样一个实例存在，而且只能被赋值一次， 从而保证了线程安全性。
 *   - 兼备了并发高效调用和延迟加载的优势
 *
 * @author ewu
 * @date 2021/1/3 20:31
 */
public class SingletonDemo04 {

    private static class SingletonClassInstance {
        public static final SingletonDemo04 instance = new SingletonDemo04();
    }

    /**
     * 没有同步块，调用效率高
     * @return
     */
    public static SingletonDemo04 getInstance() {
        return SingletonClassInstance.instance;
    }

    private SingletonDemo04() {}
}
