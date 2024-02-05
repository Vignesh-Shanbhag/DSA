package com.javalearning.basic.linkedlist;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();

        ll.insertFirst(10);
        ll.insertFirst(17);

        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertAtEnd(99);
        ll.insertAtIndex(3,100);
        ll.display();
        System.out.println();
        System.out.println(ll.deleteFirst());

        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();

        System.out.println(ll.deleteAtIndex(2));
        ll.display();
        System.out.println();
        System.out.println(ll.findValue(2));



    }

}
