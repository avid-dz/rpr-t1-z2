package com.company;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj) {
        int pomocni = broj;
        int suma = 0;
        while (pomocni != 0) {
            suma += pomocni % 10;
            pomocni /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Brojevi od 1 do n koji su djeljivi sa svojom sumom cifara su:");
        for (int i=1; i<=n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}