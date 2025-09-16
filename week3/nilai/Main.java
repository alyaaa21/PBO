package PBO.week3.nilai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        
        ceknilai penentuNilai = new ceknilai();

        System.out.print("Masukkan skor mahasiswa (0-100): ");
        int skor = inputScanner.nextInt();
        
        String hasilEvaluasi = penentuNilai.dapatkanHasil(skor);
        
        System.out.println("\n--- Hasil Akhir ---");
        System.out.println(hasilEvaluasi);
        
        inputScanner.close();
    }
}