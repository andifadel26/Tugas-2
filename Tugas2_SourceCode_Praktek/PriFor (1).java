/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 21.50
 */

import java.util.Scanner;

// baca N, Print 1 s/d N dengan FOR

public class PriFor {
    public static void main(String[] args) {
        //kamus
        int i, N;
        Scanner masukan = new Scanner(System.in);
        //Program
        System.out.print("Baca N, print 1 s/d N \n");
        System.out.print("N = ");
        N = masukan.nextInt();
        for (i = 1; i <= N; i++) {
            System.out.print(i + " "); 
        }
        System.out.println("\nAkhir program \n");
    }
}