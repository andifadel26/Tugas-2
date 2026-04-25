/**
 *  NIM          : 13020240011
 *  Nama         : Ilham Khairudin Putra
 *  Hari/Tanggal : Minggu/12 April 2026
 *  Waktu        : 9.46
 */

import java.util.Scanner;

//maksimum dua bilangan yang dibaca
public class Max2 {
    public static void main(String[] args) {
        //kamus
        int a, b;
        Scanner masukan = new Scanner(System.in);
        //program
        System.out.print("Maksimum dua bilangan : \n");
        System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println("Ke dua bilangan : a = "+ a + " b = "+ b);
        if (a >= b){
            System.out.println("Nilai a yang maksimum "+ a);
        }else //a > b
        {
            System.out.println("Nilai b yang maksimum "+ b);
        }

    }
}