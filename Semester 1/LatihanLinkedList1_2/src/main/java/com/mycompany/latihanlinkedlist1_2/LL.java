/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanlinkedlist1_2;

/**
 *
 * @author mac
 */
public class LL {
    
    Node2 first;
    Node2 last;
    public LL() {
        first = null;
    }
    public boolean apaKosong() {
        return (first == null);
    }
    public void dataAwal(int data) {
        Node2 node = new Node2(data);
        node.next = first;
        first = node;
    }
    public void dataAkhir(int data) {
        Node2 node, help;
        node = new Node2(data);
        node.next = null;
        if(apaKosong()) {
            first = node;
            first.next = null;
        }
        else {
            help = first;
            while(help.next!=null) {
                help = help.next;
            }
            help.next=node;
        }
    }
    
    public Node2 hapusAwal() {
        if(!apaKosong()) {
            Node2 temp = first;
            first = first.next;
            return temp;
        }
        else {
            return null;
        }
    }
    public Node2 hapusAkhir() {
        if(!apaKosong()) {
            Node2 temp, current;
            current=first;
            while(current.next.next != null) {
                current = current.next;
            }
            temp=current.next;
            current.next = null;
            return temp;
        }
        else {
            Node2 temp = first;
            first = null;
            return temp;
        }
    }
    public void hapusTerserah(int key) {
        Node2 temp = first;
        if(!apaKosong()) {
            while(temp!=null) {
                if(temp.next.data==key) {
                    temp.next = temp.next.next;
                    break;
                }
                else if((temp.data==key) && (temp==first)){
                    this.hapusAwal();
                    break;
                }
                temp=temp.next;
            }
        }
    }
    public void show() {
        Node2 current = first;
        if(current==null) {
            System.out.println("Kosong");
        }
        else {
            while(current!=null) {
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
    
}












