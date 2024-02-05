package com.javalearning.basic.linkedlist;

import org.w3c.dom.Node;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END");

    }
    public void insertFirst(int value){

        Node node = new Node(value);
        node.next = head;

        head = node;
        if(tail==null)
            tail = head;

        size+=1;
    }

    public void insertAtEnd(int value){

        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int index, int value){

        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertAtEnd(value);
            return;
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;

    }

    public int deleteFirst(){

        if(head == null ){
            tail=null;
            System.out.println("Linked List is empty");
        }

            int val = head.value;
        head = head.next;
        size--;
        return val;
    }


    public Node getIndex(int index){
        Node node = head;

        for (int i = 0; i < index ; i++) {
            node = node.next;
        }

        return node;
    }

    public int findValue(int value){
        Node temp = head;
        int index = 0;

        while(temp != null){
            if(temp.value == value){
                return index;
            }
            index++;
            temp = temp.next;
        }

        return -1;
    }
    public int deleteLast(){
        if(size<1){
            return deleteFirst();
        }

        Node secondLast = getIndex(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index){

        if(index ==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node previous = getIndex(index-1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        return value;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
