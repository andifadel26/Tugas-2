/**
 *  NIM          : 13020240011
 *  Nama         : Ilham Khairudin Putra
 *  Hari/Tanggal : Sabtu/11 April 2026
 *  Waktu        : 19.06
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {

    public static void main(String[] args) throws IOException {

        //Kamus
        String str;
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        //Program
        System.out.print("\nBaca string dan integer: \n");
        System.out.print("Masukkan sebuah string: ");
        str = dataIn.readLine();
        System.out.print("String yang dibaca : "+ str);
    }
}