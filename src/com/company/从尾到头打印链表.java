package com.company;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by hzq on 16-12-8.
 */
public class 从尾到头打印链表 {
    public static void main(String[] args) {
        ListNode head = new ListNode(12);
        ListNode mid = head;
        for (int i = 0; i < 20; i++) {

            ListNode listNode = new ListNode(i);
            mid.next=listNode;
            mid=listNode;
        }
        System.out.println(printListFromTailToHead(head));
    }

    /**
     * 链表倒转：先把链表中的元素放入栈中，再弹出栈
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }

        return list;
    }
}

class ListNode {
    int val;
    ListNode next = null;
//  构造方法
    ListNode(int val) {
        this.val = val;
    }
}