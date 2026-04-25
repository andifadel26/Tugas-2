/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 22.30
 */

import java.util.Scanner;

public class PrintXRepeat{
    public static void main(String[] args){
        //kamus
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);
        //program
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");

        x = masukan.nextInt(); //first elmt
        if (x == 999){
            System.out.print("Kasus Kosong \n");
        }else { //minimal ada satu data yang dijumlahkan
            Sum = 0; //inisialisas; invariant
            do{
                Sum = Sum + x; //proses
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); //Next elmt
            }while (x != 999); //kondisi pengulangan
            System.out.println("Hasil Penjumlahan = "+ Sum);
            //Terminasi
        }
    }
}