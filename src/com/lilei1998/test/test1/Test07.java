package com.lilei1998.test.test1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by user on 2018/1/12.
 */
public class Test07 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }
}
