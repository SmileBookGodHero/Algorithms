package com.shrbank.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * Created by lilei on 2017/9/20 下午3:03.
 * Dijkstra 的双栈算术表达式求值算法
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> options = new Stack<>();
        Stack<Double> values = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("(")) {

            } else if (s.equals("+")) {
                options.push(s);
            } else if (s.equals("-")) {
                options.push(s);
            } else if (s.equals("*")) {
                options.push(s);
            } else if (s.equals("/")) {
                options.push(s);
            } else if (s.equals("sqrt")) {
                options.push(s);
            } else if (s.equals(")")) {
                String option = options.pop();
                double value = values.pop();
                if (option.equals("+")) {
                    value = values.pop() + value;
                } else if (option.equals("-")) {
                    value = values.pop() - value;
                } else if (option.equals("*")) {
                    value = values.pop() * value;
                } else if (option.equals("/")) {
                    value = values.pop() / value;
                } else if (option.equals("sqrt")) {
                    value = Math.sqrt(value);
                }
                values.push(value);
            } else {
                values.push(Double.parseDouble(s));
            }
        }
        StdOut.println(values.pop());
    }
}
