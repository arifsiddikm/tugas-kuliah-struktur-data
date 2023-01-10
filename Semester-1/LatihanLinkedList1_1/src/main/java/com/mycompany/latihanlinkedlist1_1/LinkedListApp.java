/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanlinkedlist1;

/**
 *
 * @author mac
 */
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
