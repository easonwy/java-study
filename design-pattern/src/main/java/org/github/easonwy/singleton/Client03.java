package org.github.easonwy.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试5中创建单例模式的效率
 *
 * @author ewu
 * @date 2021/1/3 20:50
 */
public class Client03 {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
                        Object o = SingletonDemo01.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();

        long end = System.currentTimeMillis();
        System.out.println("总耗时 = " + (end - start));
    }
}
