package org.learning.snack;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        //Data una stringa in input mostrare a video quanti caratteri
        // alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
        // Continuare a chiedere una nuova stringa finchè non si inserisce 0.
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un testo, puoi usare caratteri alfabetici, numeri e simboli alfanumerici: ");

        String stringaUtente = input.nextLine();

        input.close();

//      trasformo la variabile stringaUtente in un array per poter analizzare la stringa
        char[] charArray = stringaUtente.toCharArray( );

//      creo dei contatori
        int countAlfabetici = 0;
        int countNumerici = 0;
        int countNonAlfanumerici = 0;

//        con un ciclo for scorro l array della stringa in input facendo partire i vari contatori
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                countAlfabetici++;
            } else if (Character.isDigit(charArray[i])) {
                countNumerici++;
            } else {
                countNonAlfanumerici++;
            }

        }

//      riporto la variabile stringaUtente al suo tipo inziale ovvero una stringa
        String stringaUtente2 = String.valueOf(charArray);

        System.out.println(stringaUtente2 + "\nIl tuo testo contiene:\n" +
                "Caratteri alfabetici: " + countAlfabetici + "\n" +
                "Caratteri numerici: " + countNumerici + "\n" +
                "Caratteri non alfanumerici: " + countNonAlfanumerici);



    }
}
