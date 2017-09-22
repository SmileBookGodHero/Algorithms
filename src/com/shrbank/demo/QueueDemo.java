package com.shrbank.demo;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

/**
 * Created by lilei on 2017/9/22 上午10:49.
 */
public class QueueDemo {
    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> queue = new Queue<>();
        while (in.isEmpty()) {
            queue.enqueue(in.readInt());
        }
        int N = queue.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = queue.dequeue();
        }
        return a;
    }
}
