package com.leoric.code.in.java.algorithm;

import com.leoric.code.in.java.algorithm.reverse.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wecash on 18/9/20.
 */
public class ListTest {

    public static void main(String[] args) {
        myList();
        //reverseList();

    }

    private static void reverseList() {
        ListNode node6 = new ListNode("node6", null);
        ListNode node5 = new ListNode("node5", node6);
        ListNode node4 = new ListNode("node4", node5);
        ListNode node3 = new ListNode("node3", node4);
        ListNode node2 = new ListNode("node2", node3);
        ListNode node1 = new ListNode("node1", node2);
        ListNode listNode = reserveNode(node1);
        System.out.println(listNode.value);
    }


    public static ListNode reserveNode(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        } else {
            ListNode headNode = reserveNode(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }
    }

    private static void myList() {
        //List<String> list = new LinkedList<String>();
        MyList<String> list = new MyLinkedList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        list.add("test6");
        //System.out.println(list.get(1));
        //list.remove(1);
        //System.out.println(list.get(1));
        //list.reserve();
        //System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static class ListNode {

        String value;

        ListNode next;

        public ListNode(String value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
