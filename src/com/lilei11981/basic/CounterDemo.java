package com.lilei11981.basic;

/**
 * Created by lilei on 2017/9/19 下午3:17.
 */
public class CounterDemo {
    private final String name;
    private int count;

    private CounterDemo(String id) {
        name = id;
    }

    private void increment() {
        count++;
    }

    private int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }

    public static void main(String[] args) {
        CounterDemo heads = new CounterDemo("heads");
        CounterDemo tails = new CounterDemo("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        System.out.println(heads + " " + tails);
        System.out.println(heads.tally() + tails.tally());
    }
}
