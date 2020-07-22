package com.algorithms.fundamentals.programmingModel.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lilei on 2017/9/20 下午5:31.
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;
    public FixedCapacityStack(int capacity) {
        a = (Item[]) new Object[capacity];   //  java 不允许创建泛型数组，需要使用类型转换
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        a[N++] = item;
    }
    public Item pop() {
        return a[--N];
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<>(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
