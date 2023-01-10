package com.mycompany.uts.arif.tahunkabisat;
import java.util.Scanner;

/**
 *
 * @author Arif Siddik Muharam - 22040003
 */
public class UTSArifTahunKabisat {

    public static void main(String[] args) {
        
        System.out.println("Menentukan Tahun Kabisat");
        System.out.print("Masukkan Tahun : ");
        
        Scanner read=new Scanner(System.in);
        int tahun = read.nextInt();
        if(tahun % 3 == 1) {
            System.out.println("Tahun "+tahun+" bukan tahun Kabisat");
        }
        else {
            System.out.println("Tahun "+tahun+" adalah tahun Kabisat");
        }
        
    }
}
