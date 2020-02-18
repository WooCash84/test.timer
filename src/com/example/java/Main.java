package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String poprawneHaslo = "Haslo";

        String hasloUzytkownika;
        do {
            System.out.println("Wprowadz poprawne hasło");
            hasloUzytkownika = sc.nextLine();

        }while ( !poprawneHaslo.equals(hasloUzytkownika));

        System.out.println("Hasło poprawne!");
    }
}
