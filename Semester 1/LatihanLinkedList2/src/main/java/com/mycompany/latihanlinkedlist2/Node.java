/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanlinkedlist2;

/**
 *
 * @author mac
 */
public class Node {
    
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data=data;
    }
    
    public void tampil() {
        System.out.print("("+data+")");
    }
    
}
