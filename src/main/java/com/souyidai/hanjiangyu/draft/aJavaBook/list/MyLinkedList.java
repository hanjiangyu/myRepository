package com.souyidai.hanjiangyu.draft.aJavaBook.list;

import java.util.Hashtable;

/**
 * Created by hanjiangyu on 2016/10/11.
 */
public class MyLinkedList {
    Node head = null;

    public void addNode(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node tmp = head;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    public Boolean deletaNode(int index){
        if(index<1||index>length()){
            return false;
        }
        if(index==1){
            head=head.next;
            return true;
        }
        int i =1;
        Node preNode = head;
        Node curNode = preNode.next;
        while(curNode!=null){
            if(i==index){
                //把curNode删除了
                //传入的index是从0开始计算的
                preNode.next=curNode.next;
                return true;
            }
            preNode=curNode;
            curNode=curNode.next;
            i++;
        }
        return true;
    }

    public int length(){
        int length = 0;
        Node tmp=head;
        while(tmp!=null){
            length++;
            tmp = tmp.next;
        }
        return  length;
    }

    public void printList(){
        Node tmp = head;
        while (tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }

    public Node orderList(){
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;
        while (curNode.next!=null){
            nextNode = curNode.next;
            while (nextNode!=null){
                if(curNode.data>nextNode.data){
                    temp=curNode.data;
                    curNode.data=nextNode.data;
                    nextNode.data=temp;
                }
                nextNode=nextNode.next;
            }
            curNode=curNode.next;
        }
        return head;
    }

    //删除重复节点
    public void deleteDuplecate(){
        Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
        Node tmp = head;
        Node pre = null;
        while(tmp!=null){
            if(table.containsKey(tmp.data)){
                pre.next=tmp.next;
            }else{
                table.put(tmp.data,1);
                pre = tmp;
            }
            tmp=tmp.next;
        }
    }

}
