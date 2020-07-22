package com.algorithms.fundamentals.programmingModel.basic;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by lilei on 2017/9/20 上午9:40.
 */
public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt("1000");
        VisualAccumulator accumulator = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++) {
            accumulator.addDataValue(StdRandom.uniform(0.0, 1.0));
        }
        StdOut.println(accumulator);
    }
}

class VisualAccumulator {
    private double total;
    private int N;
    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(0.005);
    }
    public void addDataValue(double value) {
        N++;
        total += value;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }
    public double mean() {
        return total / N;
    }

    public String toString() {
        return "Mean (" + N + " value): " + String.format("%7.5f", mean());
    }
}
