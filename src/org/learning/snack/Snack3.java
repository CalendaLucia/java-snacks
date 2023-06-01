package org.learning.snack;
//Crea un array di numeri interi e fai la somma di tutti gli elementi
//        che sono in posizione dispari
public class Snack3 {
    public static void main(String[] args) {

        int[] n = {1,2,3,4,5,10,15,18,19,21,25,28,33,47,52};
        int nDispari;
        int sommaDispari = 0;

        for (int i = 0; i < n.length ; i++) {
            if (n[i] % 2 != 0) {
                nDispari = n[i];
                System.out.println("i numeri dispari sono: " + nDispari);
                sommaDispari += n[i];
            }
        }
        System.out.println("La somma degli elementi dispari è: " + sommaDispari);

    }
}
