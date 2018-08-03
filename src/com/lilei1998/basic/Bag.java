package com.lilei1998.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * Created by lilei on 2017/9/25 上午10:07.
 */
public class Bag<Item> implements Iterable<Item> {
    private Node first;    //  链表的首结点
    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {   //  和 Stack 的 push() 方法完全相同
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }
        public void remove() {

        }
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }
        for (String i : bag) {
            StdOut.println(i);
        }
    }
}
