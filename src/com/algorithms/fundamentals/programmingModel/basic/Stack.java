package com.algorithms.fundamentals.programmingModel.basic;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;


/**
 * Created by lilei on 2017/9/21 下午1:43.
 * 下压堆栈（链表实现）
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;   //  栈顶（最近添加的元素）
    private int N;        //  元素数量
    private class Node {     //  定义了结点的嵌套类
        Item item;
        Node next;
    }
    public boolean isEmpty() {   //  或 N == 0
        return first == null;
    }
    public int size() {
        return N;
    }
    public void push(Item item) {   //  向栈顶添加元素
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public Item pop() {          //  从栈顶删除元素
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    public Iterator<Item> iterator() {   //  迭代
        return new ListIterator();
    }
    public class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }
        public void remove() {}
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {    //  创建一个栈并根据 StdIn 中的指示压入或弹出字符串
        Stack<String> string = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                string.push(item);
            } else if (!string.isEmpty()) {
                StdOut.print(string.pop() + " ");
            }
        }
        StdOut.println("(" + string.size() + " left on stack)");
    }
}
