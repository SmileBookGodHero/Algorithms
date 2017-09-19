package com.shrbank.test;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lilei on 2017/9/18 下午5:18.
 */
public class Test02 {
    public static void main(String[] args) {
        Counter c1 = new Counter("ones");
        c1.increment();
        Counter c2 = c1;
        c2.increment();
        StdOut.println(c1);
    }
}
