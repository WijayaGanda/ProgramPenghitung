package com.Wijaya;

import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double p, l, L;

        System.out.println("Masukkan Panjang");
        p = input.nextDouble();
        System.out.println("Masukkan Lebar");
        l = input.nextDouble();

        L = p * l ;
        System.out.println("Luas Persegi Panjang = " + L);

    }
}
