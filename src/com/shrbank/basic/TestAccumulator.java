package com.shrbank.basic;

import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by lilei on 2017/9/19 下午6:11.
 */
public class TestAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt("1000");
        Accumulator accumulator = new Accumulator();
        for (int t = 0; t < T; t++) {
            accumulator.addDataValue(StdRandom.uniform(0.0, 1.0));
        }
        StdOut.println(accumulator.mean());
    }
}
