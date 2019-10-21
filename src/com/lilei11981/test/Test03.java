package com.lilei11981.test;

/**
 * Created by user on 2018/1/12.
 */
public class Test03 {
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
    public static void main(String[] args) {
        System.out.println(gcd(1200, 240));
    }
}
