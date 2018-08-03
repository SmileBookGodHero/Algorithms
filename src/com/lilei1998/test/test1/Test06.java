package com.lilei1998.test.test1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by user on 2018/1/12.
 */
public class Test06 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
