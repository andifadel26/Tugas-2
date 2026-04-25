/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 22.35
 */

import java.util.Scanner;

//contoh baca nilia x
//jumlahkan nilai yang dibaca dengan ITERATE
public class PrintXinterasi {
    public static void main(String[] args){
        //kamus
        int Sum=0;
        int x;
        Scanner masukan = new Scanner(System.in);

        //program
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); //first elmt
        if(x == 999){
            System.out.print("Kasus kosong \n");
        }else{ //Minimal ada satu data yang dijumlahkan
            Sum = x; //inisialisasi; invariant
            for (;;){
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); //next elmt
                if(x == 999)
                break;
                else{
                    Sum = Sum + x; //proses
                }
            }
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
        //Terminasi
    }
}