/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel *  Hari/Tanggal : Sabtu/25 April 2026
 *  Waktu        : 22.25
 */

 import java.util.Scanner;

 public class PrintWhile1 {
    public static void main(String[] args){
        //kamus
        int N;
        int i = 1;
        Scanner masukan = new Scanner(System.in);

        //program
        System.out.print("Nilai N > 0 = ");
        N = masukan.nextInt();
        System.out.print("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
            System.out.println(i++);
        } //(i > N)
    }
 }