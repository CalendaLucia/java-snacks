package org.learning.snack;

import java.util.ArrayList;
import java.util.Random;

// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi
// e una lista di cognomi, e da queste vuole mostrare a video una falsa lista
//di invitati con nome e cognome.
public class Snack2 {
    public static void main(String[] args) {

        String[] nomi = {"Giorgio", "Jasmine", "Rebecca", "Antonio"};
        String[] cognomi = {"Davinci", "Rossi", "Bianchi", "Ipsum"};

        Random rand = new Random();
        ArrayList<String> invitati = new ArrayList<>();

        while (invitati.size() < 10) {
            String nomeCasuale = nomi[rand.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[rand.nextInt(cognomi.length)];
            String nomeCognomeCasuale = nomeCasuale + " " + cognomeCasuale;

            if (!invitati.contains(nomeCognomeCasuale)) {
                invitati.add(nomeCognomeCasuale);
                System.out.println(nomeCognomeCasuale);
            }
        }
        }


    }

