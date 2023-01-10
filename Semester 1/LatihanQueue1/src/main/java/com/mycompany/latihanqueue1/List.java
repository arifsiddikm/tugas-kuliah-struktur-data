/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanqueue1;

/**
 *
 * @author mac
 */

//Class List package p11;
public class List {
     private Node nodeAwal;
     private Node nodeAkhir;
     private String nama;
     public List() {this( "list" );}
     
     public List( String namaList ) {
        nama = namaList;
        nodeAwal = nodeAkhir = null;
     }
     public void sisipDiAwal(Object dt) {
        if (kosong()) nodeAwal = nodeAkhir = new Node( dt );
        else nodeAwal = new Node( dt, nodeAwal );
     }
     
     public void sisipDiAkhir( Object dt ) {
         if (kosong()) nodeAwal = nodeAkhir = new Node( dt );
         else nodeAkhir = nodeAkhir.next = new Node( dt );
    }
     
    public Object hapusDrDepan() {
        Object itemDihapus = null;
        if(!kosong()) {
            itemDihapus = nodeAwal.data;
            if(nodeAwal == nodeAkhir) 
                nodeAwal = nodeAkhir = null;
            else 
                nodeAwal = nodeAwal.next;
        }
        return itemDihapus;
    }

    public boolean kosong () {return nodeAwal == null;}
    public void cetak() {

        if(kosong()) {
            System.out.printf("Kosong %s\n",nama);
            return;
        }
        System.out.printf("Isi %s adalah : ",nama);
        Node kini = nodeAwal;

        while(kini != null) {
            System.out.printf("%s",kini.data);
            kini = kini.next;
        }

        System.out.println( "\n" );

    }
}