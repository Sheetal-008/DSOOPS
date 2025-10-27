package com.Sheetal.LinkedList;

public class Create {
    private Create.Node head;
    private int size;

    class Node{
        int data;
        Create.Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size ++;
        }
    }
    public static void main (String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        System.out.println("Initial List: ");
        list.display();
    }
}
