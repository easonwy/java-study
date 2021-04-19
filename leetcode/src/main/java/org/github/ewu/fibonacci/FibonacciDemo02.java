package org.github.ewu.fibonacci;

/**
 * 非递归实现
 *
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列，因数学家莱昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，
 * 指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、……在数学上，斐波那契数列以如下被以递推的方法定义：F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
 * 在现代物理、准晶体结构、化学等领域，斐波纳契数列都有直接的应用，为此，美国数学会从 1963 年起出版了以《斐波纳契数列季刊》为名的一份数学杂志，用于专门刊载这方面的研究成果。
 *
 * @author ewu
 */
public class FibonacciDemo02 {

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(20));
    }

    public static long fibonacci(long n) {
        if (n <= 1) return n;
        long first = 0, second = 1, sum = 0;
        for(int i = 0; i < n -1; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }

}
