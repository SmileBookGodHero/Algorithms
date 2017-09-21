package com.shrbank.basic;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * Created by lilei on 2017/9/21 下午1:43.
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N;
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    public Iterator<Item> iterator() {
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

    public static void main(String[] args) {
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
