package com.shrbank.basic;

import edu.princeton.cs.algs4.*;

/**
 * Created by lilei on 2017/9/19 下午2:42.
 */
public class Interval2DTest {
    public static void main(String[] args) {
        double xLow = Double.parseDouble("0.2");
        double xHigh = Double.parseDouble("0.5");
        double yLow = Double.parseDouble("0.2");
        double yHigh = Double.parseDouble("0.5");
        int T = Integer.parseInt("2");
        Interval1D xInterval = new Interval1D(xLow, xHigh);
        Interval1D yInterval = new Interval1D(yLow, yHigh);
        Interval2D box = new Interval2D(xInterval, yInterval);
        box.draw();
        Counter counter = new Counter("hits");
        for (int t = 0; t < T; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D point2D = new Point2D(x, y);
            if (box.contains(point2D)) {
                counter.increment();
            } else {
                point2D.draw();
            }
        }
        StdOut.println(counter);
        StdOut.println(box.area());
    }
}
