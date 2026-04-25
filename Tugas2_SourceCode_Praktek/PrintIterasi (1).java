/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 22.10
 */

import java.util.Scanner;

//Baca N
//Print i = 1 s/d N dengan ITERATE 

public class PrintIterasi {
    public static void main(String[] args) {
        //kamus
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);
        //program
        System.out.print("Nilai N > 0 = "); //inisialisasi
        N = masukan.nextInt();
        i = 1; // First Elmt
        System.out.print("Print i dengan ITERATE : \n");
        for (;;) {
            System.out.println(i);//proses
            if (i == N)
            //kondisi berhenti
            break;
            else {
                i++; //next Elmt
            }
        } //(i == N)
    }
}