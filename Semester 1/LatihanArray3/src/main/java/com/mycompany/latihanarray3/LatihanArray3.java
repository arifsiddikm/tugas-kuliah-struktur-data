/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanarray3;
import java.util.Scanner;


/**
 *
 * @author mac
 */
public class LatihanArray3 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Scanner read=new Scanner(System.in);
        System.out.println("Masukkan Nilai\n" );
        int [] Array_x = new int [5];
        for(int x=0;x<5;x++){
            System.out.print("Nilai Mahasiswa : " );
            Array_x[0]=read.nextInt();
        }
    }
}
