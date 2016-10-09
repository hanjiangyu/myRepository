package com.souyidai.hanjiangyu.draft.aJavaBook.list;

/**
 * Created by hanjiangyu on 2016/10/9.
 */
public class Main {
    public static void main(String[] args){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        ListNode result = Operate.removeNthFromEnd(listNode1,1);

        System.out.println(result.val);

    }
}
