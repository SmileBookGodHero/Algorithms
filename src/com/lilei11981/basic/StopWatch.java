package com.lilei11981.basic;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.ThreeSum;

/**
 * Created by lilei on 2017/9/26 下午1:48.
 */
public class StopWatch {
    private final long start;
    public StopWatch() {
        start = System.currentTimeMillis();
    }
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt("600");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-1000000, 1000000);
        }
        StopWatch timer = new StopWatch();
        int count = ThreeSum.count(a);
        double time = timer.elapsedTime();
        StdOut.println(count + " triples " + time + " seconds");
    }
}
