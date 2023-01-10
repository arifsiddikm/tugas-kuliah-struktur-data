/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanqueue1;

/**m
 *
 * @author mac
 */
public class Queue {
    private List listAntrian;
    public Queue() {
        listAntrian = new List("queue");
    }
    public void enqueue(Object object) {
        listAntrian.sisipDiAkhir( object );
    }
    public Object dequeue() {
        return listAntrian.hapusDrDepan();
    }
    public boolean kosong() {
        return listAntrian.kosong();
    }
    public void cetak() {listAntrian.cetak();}
    public static void main( String args[] ) {
        Queue q = new Queue();
        q.enqueue(10 + " ");
        q.cetak();
        q.enqueue(40 + " ");
        q.cetak();
        q.enqueue(25 + " ");
        q.cetak();
        q.enqueue(30 + " ");
        q.cetak();
        Object dtHapus = null;
        while (!q.kosong()){
            dtHapus = q.dequeue();
            System.out.printf("%stelah dihapus \n",dtHapus );
            q.cetak();
        }
    }
}
