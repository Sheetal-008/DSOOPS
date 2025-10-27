package com.Sheetal.LinkedList;

public class SinglyLinkedList {
    private Node head;
    private int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size ++;
        }
    }

    public void addFirst(int data){
        Node node = new Node (data);
        node.next = head;
        head = node;
    }
    public void Last(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return ;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    public void InsertAtPosition(int data, int position){
        if(position <- 0 || position > size * 1){
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i=1;i < position - 1 && current != null;i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display(){
        if (head == null){
            System.out.println("List is empty");
            return ;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public int size(){
        return size;
    }
    public static void main (String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(56);
        list.addFirst(70);
        list.addFirst(99);
        System.out.println("Initial List: ");
        list.display();

        list.InsertAtPosition(54,2);
        System.out.println("After insertion, list is: ");
        list.display();

        list.Last(100);
        System.out.println("After adding 100 to the last position: ");
        list.display();

        System.out.println("The size of the list is: " + list.size());
    }
}
