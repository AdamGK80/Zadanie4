package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    /*
     * Cwiczenia: 1. Zamiast wczytywac elementy tablicy, wylosuj je z przedzialu od
     * 0 do 100, a nastepnie do wartosci podanej przez uzytkownika. 2. Zamiast
     * wczytywac elementy tablicy, wypelnij ja kolejnymi liczbami calkowitymi,
     * kolejnymi potegami dwojki itp.
     */

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int r;
            System.out.println("Podaj rozmiar: ");
            r = Integer.parseInt(in.readLine());
            int[] t = new int[r];
            wczytaj_tablice(t, r);

            System.out.println("Podales nastepujace liczby:");
            wypisz_tablice(t, r);

        } catch (IOException e) {
        }
    }

    public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj sposób wczytywania tablicy: ");
        System.out.println("1 - Manualnie");
        System.out.println("2 - Automatycznie (Generowanie)");
        System.out.println("3 - Liczby całkowite od 0 do n");
        System.out.println("4 - Potęgi dwójki");
        System.out.println("Wybór: ");

        int wybor = Integer.parseInt(in.readLine());

        if (wybor == 1) {
            for (int i = 0; i < rozmiar; i++) {
                System.out.println("Podaj liczbe " + i + ":");
                tablica[i] = Integer.parseInt(in.readLine());
            }
        } else if (wybor == 2) {
            Random los = new Random();
            for (int i = 0; i < rozmiar; i++) {
                tablica[i] = los.nextInt(101);
            }
        } else if(wybor == 3) {
            for (int i = 0; i < rozmiar; i++) {
                tablica[i] = i;
            }
        } else if(wybor == 4) {
            System.out.println("Podaj liczbę");
            int a = Integer.parseInt(in.readLine());
            int n = rozmiar;
            int potega = 1, tmp = n;
            for (int i = 0; i < rozmiar; i++) {
                potega*=a;
                tablica[i] = potega;
                tmp--;
            }
        } else {
            System.out.println("Wybór nieprawidłowy!");
        }
    }

    public static void wypisz_tablice(int[] tablica, int rozmiar) {
        for (int i = 0; i < rozmiar; i++)
            System.out.println("tablica[" + i + "] = " + tablica[i]);
    }
}
