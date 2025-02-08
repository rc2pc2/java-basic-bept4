package com.bept4.java.basic;

import java.util.Scanner;

public class CompareStrings {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // System.out.println("Enter your word: ");
        // String primaParola = input.nextLine();  // & via milano 11

        // System.out.println("Enter your second word: ");
        // String secondaParola = input.nextLine();  
        // input.close();

        // String terzaParola = primaParola; // & via milano 11

        // System.out.println("La comparazione tra le due stringe ha valore: ");
        // String primaParola = "ciao";
        // String secondaParola = "ciao";

        // if (primaParola.equals(secondaParola)){
        //     System.out.println("Le due parole sono uguali");
        // } else {
        //     System.out.println("Le due parole sono diverse");
        // }

        // int a = 1;
        // int b = a; // perche' l'ho dichiarato a riga 30, quindi non avevo ancora a = 2

        // a = a + 1;
        // System.out.println(b); // 1 o vale 2?

        // String a = "ciao";
        // String b = a; // perche' l'ho dichiarato a riga 30, quindi non avevo ancora a = 2

        // a = a + "ciao"; // come se avessi cambiato via
        // System.out.println(b); // ciao o ciao1?

        String[] iscritti = { "Luca", "Marco", "Paolo" }; 

        for (int i = 0; i < iscritti.length; i++) {
            System.out.println("iscritto: " + iscritti[i]);
        }

        int j = 0;
        while( j < iscritti.length ){
            System.out.println(iscritti[j]);
            j++; //! 👈👈👈 attenzione: e' la nostra condizione di uscita !!!
        }



    }
}
