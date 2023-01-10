/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanstack4;

/**
 *
 * @author mac
 */
public class LinkListStack {
    
    LinkList li = new LinkList();
    
    public void push(int data) {
        li.insertFirst(data);
    }
    public void pop() {
        while(!li.isEmpty()) {
            li.deleteFirst();
        }
    }
    public void displayStack() {
        System.out.println("  ");
        li.displayList();
    }
        
}
