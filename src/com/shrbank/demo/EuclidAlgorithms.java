package com.shrbank.demo;

/**
 * Created by lilei on 2017/9/19 下午4:46.
 */
public class EuclidAlgorithms {
    public static int greatestCommonDivisor(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("r = " + r);
        return greatestCommonDivisor(q, r);
    }

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(567392, 6372));
    }
}
