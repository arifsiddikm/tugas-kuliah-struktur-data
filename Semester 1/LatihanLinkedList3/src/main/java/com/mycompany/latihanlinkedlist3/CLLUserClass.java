/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanlinkedlist3;

/**
 *
 * @author mac
 */
public class CLLUserClass {
    
    
    public static void main(String args[]) {
        CircularLinkedList ccl = new CircularLinkedList();
        ccl.addBeg(1);
        ccl.append(2);
        ccl.append(3);
        ccl.append(4);
        ccl.addAt(1, 0);
        ccl.append(5);
        ccl.append(12);
        ccl.displayList();
        ccl.deleteAt(1);
        System.out.println("After deletion...");
        ccl.displayList();
              
    }
    
}
