package com.leoric.code.in.java.algorithm;

import java.util.Stack;

/**
 * Created by wecash on 18/9/20.
 */
public class MyLinkedList<T> implements MyList<T> {

    Node<T> first;

    Node<T> last;

    int size = 0;

    @Override
    public void add(T t) {
        Node<T> l = last;
        //新建一个node
        Node<T> newNode = new Node<>(l, t, null);
        //将新节点挂到链表尾部
        last = newNode;
        //如果尾节点为null
        if (l == null)
            //新建节点为首节点
            first = newNode;
        else
            //否则将新节点挂到尾节点后面
            l.next = newNode;
        //容量增加
        size++;
    }

    @Override
    public T get(int index) {
        return node(index).item;
    }

    private Node<T> node(int index) {
        //折半查找
        if (index < (size >> 1)) {
            Node<T> x = this.first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = this.last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    @Override
    public void reserve(MyList myList) {

    }

    @Override
    public T remove(int index) {
        Node<T> x = node(index);
        T element = x.item;
        Node<T> prev = x.prev;
        Node<T> next = x.next;
        //要删除的节点是头节点
        if (prev == null) {
            first = next;
        } else {
            //删除的不是头结点
            prev.next = next;
            x.prev = null;
        }
        //要删除的是尾节点
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        x.item = null;
        size--;
        return element;
    }

    @Override
    public int size() {
        return size - 1;
    }

    @Override
    public void add(int index, T t) {

    }

    public class Node<T> {
        T item;
        Node<T> prev;
        Node<T> next;

        public Node(Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}


