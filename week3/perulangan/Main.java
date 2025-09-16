package PBO.week3.perulangan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("tentukan berapa kali perulangan akan dijalankan: ");
        int batas = inputUser.nextInt();

        jalankanFor(batas);
        jalankanWhile(batas);
        jalankanDoWhile(batas);

        inputUser.close();
    }

    public static void jalankanFor(int jumlahBatas) {
        System.out.println("\n--- hasil perulangan for ---");
        for (int i = 1; i <= jumlahBatas; i++) {
            System.out.println("putaran nomor " + i);
        }
    }

    public static void jalankanWhile(int jumlahBatas) {
        System.out.println("\n--- hasil perulangan while ---");
        int counter = 1; // Nama variabel diubah
        while (counter <= jumlahBatas) {
            System.out.println("putaran nomor " + counter);
            counter++;
        }
    }

    public static void jalankanDoWhile(int jumlahBatas) {
        System.out.println("\n--- hasil perulangan do-while ---");
        if (jumlahBatas < 1) {
            return; 
        }
        int counter = 1; 
        do {
            System.out.println("putaran nomor " + counter);
            counter++;
        } while (counter <= jumlahBatas);
    }
}
