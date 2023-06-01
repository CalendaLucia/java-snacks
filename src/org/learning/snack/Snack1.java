package org.learning.snack;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
       // Inserisci un numero, se è pari stampa il numero,
        // se è dispari stampa il numero successivo.
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero è pari: " + numero);
        } else {
            System.out.println("Il numero è dispari. Il numero successivo è: " + (numero + 1));
        }



    }
}
