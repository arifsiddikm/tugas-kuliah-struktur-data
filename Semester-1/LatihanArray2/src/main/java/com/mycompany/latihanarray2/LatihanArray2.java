/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanarray2;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class LatihanArray2 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        System.out.println("Menentukan Tahun Kabisat");
        System.out.print("Masukkan Tahun : ");
        Scanner read=new Scanner(System.in);
        int tahun=read.nextInt();
        if(tahun % 4 == 0) {
            System.out.println("Tahun "+tahun+" adalah tahun kabisat");
        }
        else {
            System.out.println("Tahun "+tahun+" bukan tahun kabisat");
        }
    }
}
