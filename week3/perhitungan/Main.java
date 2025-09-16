package PBO.week3.perhitungan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputPengguna = new Scanner(System.in);
        OperasiMatematika operator = new kalkulator();

        System.out.print("Input bilangan pertama: ");
        int angka1 = inputPengguna.nextInt();
        
        System.out.print("Input bilangan kedua: ");
        int angka2 = inputPengguna.nextInt();
        
        System.out.println("--- Menjalankan Operasi ---");

        int jumlah = operator.hasilTambah(angka1, angka2);
        System.out.println(jumlah); 

        int perkalian = operator.hasilKali(angka1, angka2);
        
        System.out.println(perkalian); 
        System.out.println("Hasil perkalian (dari metode return): " + perkalian); 

        inputPengguna.close();
    }
}
