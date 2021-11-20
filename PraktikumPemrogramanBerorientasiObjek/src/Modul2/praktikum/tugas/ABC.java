package Modul2.praktikum.tugas;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputData, hasil, a, b, c;

        System.out.println("Masukan nilai yang akan di hitung");
        inputData = input.nextInt();

        for (int i = 1; i < inputData; i++) {
            System.out.println("Masukkan nilai A" +1+ " = ");
            a = input.nextInt();
            System.out.print("Masukan nilai B" +i+ " = ");
            b = input.nextInt();
            System.out.print("Masukan nilai C" +i+ " = ");
            c = input.nextInt();
            hasil = a + b - c;
            System.out.print("Hasil Dari A " +i+ "+ B " +i+ "- C " +i+ "adalah = " +hasil);
            System.out.println();
        }
    }
}


