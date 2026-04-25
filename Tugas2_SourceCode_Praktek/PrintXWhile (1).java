/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 22.30
 */

import java.util.Scanner;

//contoh baca nilai x
//Jumlahkan nilai yang dibaca dengan WHILE

public class PrintXWhile{
    public static void main(String[] args){
        //kamus
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);
        //program
        Sum = 0; //inisialisasi

        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); //first elmt
        while (x != 999)//kondisi berhenti
        {

        Sum = Sum + x; //proses
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); //first elmt
        }
        System.out.println("Hasil penjumlahan = "+ Sum); 
        //Terminasi
    }

}