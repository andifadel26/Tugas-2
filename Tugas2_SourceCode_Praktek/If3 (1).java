/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 20.15
 */

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        //kamus
        int a;
        Scanner masukan = new Scanner(System.in);
        //program
        System.out.print("Contoh IF tiga kasus \n");
        System.out.print("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a > 0) {
            System.out.println("Nilai a positif "+ a);
        }else if (a == 0) {
            System.out.println("Nilai a Nol "+ a);
        }else //a > 0 
        {
            System.out.println("Nilai a negatif "+ a);
        }
    }
}
