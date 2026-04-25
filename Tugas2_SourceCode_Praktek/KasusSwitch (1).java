/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 21.10 */

import java.util.Scanner;

public class KasusSwitch {
    public static void main(String[] args) {
        //kamus
        char cc;
        Scanner masukan = new Scanner(System.in);
        //program
        System.out.print("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
        cc = masukan.next().charAt(0);
        switch (cc) {
            case 'a' : 
            System.out.print(" Yang anda ketik adalah a \n");
            break;
            case 'i' : 
            System.out.print(" Yang anda ketik adalah i \n");
            break;
            case 'u' : 
            System.out.print(" Yang anda ketik adalah u \n");
            break;
            case 'e' : 
            System.out.print(" Yang anda ketik adalah e \n");
            break;
            case 'o' : 
            System.out.print(" Yang anda ketik adalah o \n");
            break;
            default :
            System.out.print(" Yang anda ketik adalah huruf mati \n");
        }
    }
}