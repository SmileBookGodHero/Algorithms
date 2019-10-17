package com.lilei1998.basic;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by lilei on 2017/9/20 上午9:24.
 */
public class Accumulator {
    private double total;
    private int N;
    public void addDataValue(double value) {
        N++;
        total += value;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " value): " + String.format("%7.5f", mean());
    }

    public static void main(String[] args) {
        Accumulator accumulator = new Accumulator();
        for (int i = 0; i < 10000; i++) {
            accumulator.addDataValue(StdRandom.uniform(0.0, 1.0));
        }
        System.out.println(accumulator.mean());
    }
}
