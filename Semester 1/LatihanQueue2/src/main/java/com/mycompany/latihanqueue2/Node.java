/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanqueue2;

/**
 *
 * @author mac
 */
public class Node {
    Object data;
    Node next;
    
    Node(Object object) {this(object,null);}
    
    Node(Object object, Node node) {
        data = object;
        next = node;
    }
    
    Object getObject() {return data;}
    
    Node getNext() {return next;}
}