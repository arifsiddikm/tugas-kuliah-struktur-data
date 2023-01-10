/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanlinkedlist1_2;

/**
 *
 * @author mac
 */
public class LLApp {
    
    public static void main(String[] args) {
        LL link = new LL();
        System.out.println("1 : LL ASAL");
        link.dataAwal(11);
        link.dataAwal(2);
        link.dataAwal(30);
        link.dataAwal(14);
        link.dataAwal(5);
        link.dataAwal(16);
        System.out.println("1 : LL SETELAH SISIP DI AKHIR");
        link.dataAkhir(56);
        link.dataAkhir(16);
        link.show();
        System.out.println("1 : LL SETELAH DIHAPUS DI DEPAN");
        link.hapusAwal();
        link.show();
        System.out.println("1 : LL SETELAH 30 DIHAPUS");
        link.hapusTerserah(30);
        link.show();
    }
    
}
