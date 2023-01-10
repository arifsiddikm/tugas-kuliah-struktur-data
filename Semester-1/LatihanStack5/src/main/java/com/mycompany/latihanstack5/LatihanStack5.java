/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanstack5;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author mac
 */
public class LatihanStack5 { 

    public static void main(String[] args) {
        
//        Scanner read=new Scanner(System.in);
//        System.out.print("Pilih menu Perawatan : ");
//        String aaa = read;
          
        String kalimat = "algoritma dan struktur data";
        String huruf[] = kalimat.split("");
        
        Stack<String> call = new Stack<>();
        System.out.print("Masukkan kalimat : ");
        for(int i = 0; i < kalimat.length(); i++) {
            call.push(huruf[i]);
            System.out.print(huruf[i]);
        }
        System.out.println(); 
        
        System.out.print("Hasil : ");
        int jumlah = call.size();
        for(int i=0;i<jumlah;i++) {
            System.out.print(call.pop());
        }
//        System.out.println();
        
    }
}
