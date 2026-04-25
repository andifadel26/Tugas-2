/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 21.30
 */

import java.util.Scanner;

//membaca jari-jari, menghitung luas lingkaran
//latihan memakai konstanta

public class Konstant {

    public static void main(String[] args) {
     //kamus
        final float PHI = 3.1415f;
        float r;
        Scanner masukan = new Scanner(System.in);
        //Program
        //Baca Data
        System.out.print("Jari-Jari lingkaran = ");
        r = masukan.nextFloat();
        //hitung dan tulis hasil
        System.out.print ("Luas lingkaran = "+ (PHI * r * r) + "\n");
        System.out.print ("Akhir Program \n");

    }
}