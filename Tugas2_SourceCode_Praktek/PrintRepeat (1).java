/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 22.20
 */

import java.util.Scanner;

public class PrintRepeat{
    public static void main(String[] args){
        //kamus
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);
        
        //program
        System.out.print("Nilai N > 0 = ");

        //inisialisasi
        N = masukan.nextInt();

        i = 1;
        //First Elmt
        System.out.print("Print i dengan REPEAT: \n");
        do{
            System.out.print(i+"\n");//proses
            i++; //next Elmt
        }
        while (i <= N); //kondisi pengulangan
    }
}

