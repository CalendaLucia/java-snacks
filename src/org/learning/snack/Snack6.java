package org.learning.snack;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
//        Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//                Possibile usare solo :
//                  cicli
//                  chartAt
//                  if / switch
//        Es. “25" come stringa deve essere convertito in intero 25.

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        String numeroStringa = input.nextLine();
        input.close();

        int numero = 0;
        boolean trovato = false;

        for (int i = 0; i < numeroStringa.length(); i++) {
            char c = numeroStringa.charAt(i);

            if (c >= '0' && c <= '9') {
                int cifra = c - '0';
                numero = numero * 10 + cifra;
                trovato = true;
            }
        }

        if (trovato) {
            System.out.println("Numero convertito: " + numero);
        } else {
            System.out.println("Nessun numero valido trovato nella stringa di input.");
        }
    }
}
