package com.shrbank.basic;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by lilei on 2017/9/22 下午6:19.
 */
public class Queue<Item> implements Iterable<Item> {
    private Node first;   //  指向最早添加的结点的链接
    private Node last;   //  指向最近添加的结点的链接
    private int N;
    private class Node {   // 定义了结点的嵌套类
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return N;
    }
    public void enqueue(Item item) {   //  向表尾添加元素
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public Item dequeue() {  //  从表头删除元素
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
}
