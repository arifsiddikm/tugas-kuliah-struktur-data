/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanqueue2;

/**
 *
 * @author mac
 */
public class Queue {
    
    private final List listAntrian;
    public Queue() {
        listAntrian = new List( "queue");
    }
    public void enqueue( Object object ) {
        listAntrian.sisipDiAkhir( object );
    }
    public Object dequeue () {
        return listAntrian.hapusDrDepan();
    }
    public boolean kosong() {
    return listAntrian.kosong();
    }
    public void cetak(){listAntrian.cetak();}
    public int size(){
        return listAntrian.size();
    }
    public static void main( String args[]){
        Queue q = new Queue();
        q.enqueue( "10" );
        q.enqueue( 20 );
        q.enqueue( 30 );
        q.enqueue( 40 );
        q.enqueue( 50 );
        System.out.println("Element : ");
        q.cetak();
        System.out.println("Ukuran Queue : "+q.size()+"\n");
        System.out.printf("Hapus Angka : %s\n",q.dequeue());
        System.out.println("Ukuran Queue : "+q.size()+"\n");
        System.out.println("Tambahkan Data : 60");
        q.enqueue(60);
        System.out.println("Ukuran Queue : "+q.size());
        System.out.print("Cetak Queue : ");
        q.cetak();
    }


    
}
