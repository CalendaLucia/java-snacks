package org.learning.snack;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
// Data in input una stringa verificare se è palindroma
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String stringaUtente = input.nextLine();
        char[] charArray = stringaUtente.toCharArray();

        StringBuilder reverseString = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseString.append(charArray[i]);
        }

        String parolaCapovolta = reverseString.toString();

        if (stringaUtente.equalsIgnoreCase(parolaCapovolta)) {
            System.out.println("La parola è palindroma.");
        } else {
            System.out.println("La parola non è palindroma.");
        }




        input.close();
    }
}
