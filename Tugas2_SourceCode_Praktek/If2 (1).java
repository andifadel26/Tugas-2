/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 20.13
 */

import java.util.Scanner;

//contoh pemakaian IF dua kasus komplementer
//membaca sebuah nilai
//menuliskan 'Nilai a positif , nilai a', jika a >= 0
//'Nilai a negatif, nilai a', jika a < 0

public class If2 {
    public static void main (String[] args){
        //Kamus
        int a;
        Scanner masukan = new Scanner(System.in);
        //program
        System.out.print("Contoh IF dua kasus \n");

        System.out.print("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();

        if (a >= 0){
            System.out.println("Nilai a positif "+ a);
        }else //a<0
        {
            System.out.println("Nilai a negatif "+ a);
        }
    }
}