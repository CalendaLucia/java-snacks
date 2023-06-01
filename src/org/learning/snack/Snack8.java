package org.learning.snack;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
       // Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero

        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Inserisci un numero di 4 cifre: ");
            numero = input.nextInt();

            // Verifica se il numero ha 4 cifre
            if (numero < 1000 || numero > 9999) {
                System.out.println("Il numero inserito non ha 4 cifre. Riprova.");
            }
        } while (numero < 1000 || numero > 9999);

        int cifra1 = numero / 1000; // Ottiene la prima cifra
        int cifra2 = (numero % 1000) / 100; // Ottiene la seconda cifra
        int cifra3 = (numero % 100) / 10; // Ottiene la terza cifra
        int cifra4 = numero % 10; // Ottiene la quarta cifra

        int somma = cifra1 + cifra2 + cifra3 + cifra4; // Calcola la somma delle cifre

        System.out.println("La somma delle cifre è: " + somma);
    }
}
