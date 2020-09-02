package com.Wijaya;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, L;
        final double pi = 3.14;

        System.out.println("Masukkan Jari-Jari (r)");
        r = input.nextDouble();
        L = pi * r * r;
        System.out.println("Luas Lingkaran = " + L);

    }
}
