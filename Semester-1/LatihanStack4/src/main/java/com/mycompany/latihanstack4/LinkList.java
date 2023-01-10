/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanstack4;

/**
 *
 * @author mac
 */
public class LinkList {
    private Node first = null;
    
    public void insertFirst(int data) {
        Node n = new Node (data);
        n.next = first;
        first = n;
    }
    
    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
    public boolean isEmpty() {
        return (first == null);
    }

}
