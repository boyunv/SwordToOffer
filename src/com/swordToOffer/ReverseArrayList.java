package com.swordToOffer;

import java.util.ArrayList;

public class ReverseArrayList {

   //将链表进行反置的操作
    //采用的是ArrayList的头插法
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> arrayList=new ArrayList<Integer>();
            while(listNode!=null){
                arrayList.add(0,listNode.val);
                listNode=listNode.next;
            }
            return arrayList;
    }
    //第二张方法


    //进行链表的相关方法的描述
    private ListNode head=null;//头结点
    public boolean add(int a){
        ListNode newNode=new ListNode(a);
        if(head==null){
            head=newNode;
            return true;
        }
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
        return true;
    }
}
