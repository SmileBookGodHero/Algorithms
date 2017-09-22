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
        Stack<String> operationalSymbols = new Stack<>();
        Stack<Double> values = new Stack<>();
        while (!StdIn.isEmpty()) {
            String readString = StdIn.readString();
            if (readString.equals("(")) {

            } else if (readString.equals("+")) {    //  读取字符，如果是字符则压入栈
                operationalSymbols.push(readString);
            } else if (readString.equals("-")) {
                operationalSymbols.push(readString);
            } else if (readString.equals("*")) {
                operationalSymbols.push(readString);
            } else if (readString.equals("/")) {
                operationalSymbols.push(readString);
            } else if (readString.equals("sqrt")) {
                operationalSymbols.push(readString);
            } else if (readString.equals(")")) {    //  如果字符为“)”，弹出运算符和操作数，计算结果并压出栈
                String operationalSymbol = operationalSymbols.pop();
                double value = values.pop();
                if (operationalSymbol.equals("+")) {
                    value = values.pop() + value;
                } else if (operationalSymbol.equals("-")) {
                    value = values.pop() - value;
                } else if (operationalSymbol.equals("*")) {
                    value = values.pop() * value;
                } else if (operationalSymbol.equals("/")) {
                    value = values.pop() / value;
                } else if (operationalSymbol.equals("sqrt")) {
                    value = Math.sqrt(value);
                }
                values.push(value);
            } else {
                values.push(Double.parseDouble(readString));
            }
        }
        StdOut.println(values.pop());
    }
}
