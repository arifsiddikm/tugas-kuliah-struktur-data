/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanqueue2;

/**
 *
 * @author mac
 */
public class List {
    
    
    private Node nodeAwal;
    private Node nodeAkhir;
    private String nama;
    public List(){this( "list");}
    public List( String namaList ){
        nama = namaList;
        nodeAwal = nodeAkhir = null;
    }
    public void sisipDiAwal( Object dt ){
        if (kosong()) nodeAwal = nodeAkhir = new Node( dt );
        else nodeAwal = new Node( dt, nodeAwal );
    }

    public void sisipDiAkhir( Object dt ){
        if(kosong()) nodeAwal = nodeAkhir = new Node( dt );
        else nodeAkhir = nodeAkhir.next = new Node( dt );
    }
    
    public Object hapusDrDepan () {
        Object itemDihapus = null;
        if (!kosong()) {
            itemDihapus = nodeAwal.data;
            if (nodeAwal == nodeAkhir) 
                nodeAwal = nodeAkhir = null;
            else nodeAwal = nodeAwal.next;
        }
        return itemDihapus;
    }
    
    public boolean kosong() {return nodeAwal == null; }
            
          
    public int size() {
        Node kini = nodeAwal; int count = 0;
        while (kini!= null) {
            count++;
            kini = kini.next;
        }
        return count;
    }
    
    public void cetak(){
        if (kosong()){
            System.out.printf( "Kosong %s\n", nama );
            return;
        }
        Node kini = nodeAwal;
        while ( kini != null ){
            System.out.printf( "%s ", kini.data );
            kini = kini.next;
        }
        System.out.println( "\n");
    }
}
