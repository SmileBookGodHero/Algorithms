package com.shrbank.demo;

/**
 * Created by lilei on 2017/9/17 上午12:17.
 * 输出斐波那契数列
 */
public class Test01 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
