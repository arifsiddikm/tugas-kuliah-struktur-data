package com.mycompany.latihan2;

/*
 * @author mac
 */
public class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
    }
    
    public static void main(String[] args) {
//        System.out.println("Hello World!");
    }

    public void tampil() {
        System.out.print("{"+data+"}");
    }
    
}


public class LinkedList {
    Node first;
    
    public LinkedList() {
        first = null;
    }
    
    public boolean isEmpty() {
        return (first==null);
    }
    
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = first;
        first = node;
    }
    
    public void addLast(int data) {
        Node node, help;
        node = new Node(data);
        node.next = null;
        
        if(isEmpty()) {
//            Node node = null;
            first = node;
            first.next = null;
        }
        else {
            help = first;
            while(help.next != null) {
                help = help.next;
            }
            Node node = null;
            help.next=node;
        }
    }
}



public Node deleteFirst() {
    if(!isEmpty()) {
        Node temp = first;
        first = first.next;
        return temp;
    }
    else {
        return null;
    }
}


public Node deleteLast() {
    if(!isEmpty()) {
        Node temp, current;
        current = first;
        while(current.next.next != null) {
            current=current.next;
        }
        temp = current.next;
        current.next=null;
        return temp;
    }
    else {
        Node temp = first;
        first = null;
        return temp;
    }
}

public void tampilkan() {
    Node current = first;
    if(current == null) {
        System.out.println("Kosong");
    }
    else {
        while(current != null) {
            current.tampil();
            current = current.next;
        }
        System.out.println();
    }
}



public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.addFirst(1);
        link.addFirst(2);
        link.addLast(3);
        link.addLast(4);
        link.tampilkan();
        link.deleteLast();
        link.tampilkan();
    }
}
