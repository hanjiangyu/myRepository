package com.souyidai.hanjiangyu.draft.aJavaBook.List;

/**
 * Created by hanjiangyu on 2016/10/9.
 */
 class Main {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(3);
        System.out.println("listLen="+list.length());
        System.out.println("before order:");
        list.printList();
        list.orderList();
        System.out.println("after order:");
        list.printList();
        list.deleteDuplecate();
        System.out.println("删除重复:");
        list.printList();
    }
}
