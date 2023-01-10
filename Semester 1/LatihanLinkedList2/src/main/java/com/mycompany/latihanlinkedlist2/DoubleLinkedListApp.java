/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanlinkedlist2;

/**
 *
 * @author mac
 */
public class DoubleLinkedListApp {
    
    public static void main(String[] args) {
        DoubleLinkedList link = new DoubleLinkedList();
        link.insertFirst(1);
        link.insertFirst(2);
        link.insertLast(3);
        link.insertLast(4);
        link.displayForward();
        link.displayBackward();
        link.insertAfter(3,10);
        link.displayForward();
        link.displayBackward();
        link.deleteFirst();
    }
    
}
