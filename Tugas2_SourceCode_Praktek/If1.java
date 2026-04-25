/**
 *  NIM          : 13020240011
 *  Nama         : Ilham Khairudin Putra
 *  Hari/Tanggal : Sabtu/11 April 2026
 *  Waktu        : 19.06
 */



//contoh pemakaian IF satu kasus
//membaca nilai integer, menuliskan nilainya jika positif

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        //kamus
        Scanner masukan = new Scanner(System.in);
        int a;
        //program
        System.out.print("Contoh IF satu kasus \n");
        System.out.print("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.println("\n Nilai a positif " + a);
        
    }
}
