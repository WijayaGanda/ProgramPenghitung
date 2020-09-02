package com.Wijaya;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a , t , L;

        System.out.println("Masukkan panjang alas");
        a = input.nextDouble();
        System.out.println("Masukkan tinggi");
        t = input.nextDouble();
        L = 0.5 * a * t;

        System.out.println("Luas segitiga = " + L);
    }
}
