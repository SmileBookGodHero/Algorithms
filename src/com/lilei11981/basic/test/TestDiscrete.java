package com.lilei11981.basic.test;

/**
 * @author lilei
 * @date 2019-11-02 12:10
 * @apiNote
 */

public class TestDiscrete {
    public static void main(String[] args) {
        double[] a = {0.1, 0.2, 0.3, 0.5};
//        int[] a = new int[3];
        int b = StdRandom.discrete(a);
        System.out.println(b);
    }
}
