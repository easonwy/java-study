package org.github.easonwy.singleton;

/**
 * 使用枚举实现单例模式
 *
 * 优点：
 *  - 实现简单
 *  - 枚举本身就是单例模式。由JVM从根本上提供保障， 避免同步反射和反序列化的漏洞
 * 缺点：
 *  - 无延迟加载
 *
 * @author ewu
 * @date 2021/1/3 20:40
 */
public enum SingletonDemo05 {
    /**
     * 定义一个枚举的元素， 它就代表了singleton的一个实例
     */
    INSTANCE;

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation() {
        // 功能处理
    }
}
