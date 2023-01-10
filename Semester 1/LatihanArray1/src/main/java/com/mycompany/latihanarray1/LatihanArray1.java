/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanarray1;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class LatihanArray1 { 

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        String [] Array = new String [5];
          Array[0]=("1. Potong Rambut Rp. 15.000");
          Array[1]=("2. Cuci Catok/Blow Rp. 20.000");
          Array[2]=("3. Creambath Rp. 20.000");
          Array[3]=("4. Hair Spa Rp. 20.000");
          Array[4]=("5. Hair Mask Rp. 20.000");
          
//          Array[] = ("1. Potong Rambut Rp. 15.000","1. Potong Rambut Rp. 15.000","1. Potong Rambut Rp. 15.000","1. Potong Rambut Rp. 15.000","1. Potong Rambut Rp. 15.000");
          // lakukan perulangan looping 
          for(int x=0; x<5; x++) {
              System.out.println(Array[x]);
          }
          Scanner read=new Scanner(System.in);  
          System.out.print("Pilih menu Perawatan : " );
          int a = read.nextInt();
          // Jika pilih nomor 1 
          if(a==1) {
              System.out.println("Anda memilih perawatan nomor "+Array[0]);
              int pr = 15000;
              // Masukkan jumlah bayar
              System.out.print("Bayar : Rp. " );
              // inisialisasi variable bayar
              int byr = read.nextInt();
              
              // Jika bayar lebih dari sama dengan 15rb
              if(byr > 15000) {
                  // hitung jumlah kembalian
                  int kembali = byr - pr;
                  System.out.println(" Kembali  Rp. "+kembali);
              }
              // Jika bayar kurang dari 15rb
              else if(byr < 15000) {
                  // hitung jumlah kekurangan bayar 
                  int kurang = pr - byr;
                  System.out.println("Uang anda kurang! Kurang sebesar Rp. "+kurang);
              }
          }
          // Jika pilih opsi nomor 2
          else if(a==2) {
              System.out.println("Anda memilih perawatan nomor "+Array[1]);
              int cc = 20000;
              // Masukkan jumlah bayar
              System.out.print("Bayar : Rp. " );
              // inisialisasi variable bayar
              int byr = read.nextInt();
              // Jika bayar lebih dari sama dengan 15rb
              if(byr >= 20000) {
                  // hitung jumlah kembalian
                  int kmb = byr - cc;
                  System.out.println(" Kembali  Rp. "+kmb);
              }
              // Jika bayar kurang dari 15rb
              else if(byr < 20000) {
                  // hitung jumlah kekurangan bayar 
                  int kurang = cc - byr;
                  System.out.println("Uang anda kurang! Kurang sebesar Rp. "+kurang);
              }
          }
          // Jika pilih opsi nomor 3
          else if(a==3) {
              System.out.println("Anda memilih perawatan nomor "+Array[1]);
              int total3 = 35000;
              // Masukkan jumlah bayar
              System.out.print("Bayar : Rp. " );
              // inisialisasi variable bayar
              int byr = read.nextInt();
              // Jika bayar lebih dari sama dengan 15rb
              if(byr >= 35000) {
                  // hitung jumlah kembalian
                  int kmb = byr - total3;
                  System.out.println(" Kembali  Rp. "+kmb);
              }
              // Jika bayar kurang dari 15rb
              else if(byr < 35000) {
                  // hitung jumlah kekurangan bayar 
                  int kurang = total3 - byr;
                  System.out.println("Uang anda kurang! Kurang sebesar Rp. "+kurang);
              }
          }
          // Jika pilih opsi nomor 4
          else if(a==4) {
              System.out.println("Anda memilih perawatan nomor "+Array[1]);
              int total4 = 40000;
              // Masukkan jumlah bayar
              System.out.print("Bayar : Rp. " );
              // inisialisasi variable bayar
              int byr = read.nextInt();
              // Jika bayar lebih dari sama dengan 15rb
              if(byr >= 40000) {
                  // hitung jumlah kembalian
                  int kmb = byr - total4;
                  System.out.println(" Kembali  Rp. "+kmb);
              }
              // Jika bayar kurang dari 15rb
              else if(byr < 40000) {
                  // hitung jumlah kekurangan bayar 
                  int kurang = total4 - byr;
                  System.out.println("Uang anda kurang! Kurang sebesar Rp. "+kurang);
              }
          }
          // Jika pilih opsi nomor 5
          else if(a==5) {
              System.out.println("Anda memilih perawatan nomor "+Array[1]);
              int total5 = 50000;
              // Masukkan jumlah bayar
              System.out.print("Bayar : Rp. " );
              // inisialisasi variable bayar
              int byr = read.nextInt();
              // Jika bayar lebih dari sama dengan 15rb
              if(byr >= 50000) {
                  // hitung jumlah kembalian
                  int kmb = byr - total5;
                  System.out.println(" Kembali  Rp. "+kmb);
              }
              // Jika bayar kurang dari 15rb
              else if(byr < 50000) {
                  // hitung jumlah kekurangan bayar 
                  int kurang = total5 - byr;
                  System.out.println("Uang anda kurang! Kurang sebesar Rp. "+kurang);
              }
          }
          // end
    }
}
