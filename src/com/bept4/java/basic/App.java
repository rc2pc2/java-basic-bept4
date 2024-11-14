package com.bept4.java.basic;

public class App {

    public static void main(String[] args) {
        // System.out.println("hello world");

        // int condizione = 1;

        // if (condizione >= 1) { // ; se la variabiile condizione e' maggiore o uguale ad 1 
        //     // ; allora esegui questo blocco di codice
        // } else if (condizione == 0) { // ' se invece la variabile condizione e' uguale a 0
        //     // ' allora esegui quest'altro blocco di codice
        // } else { // $ in tutti gli altri casi 
        //     // $ esegui questo blocco di codice
        // }

        int[] numbers = { 1, 2, 3, 4 }; 
        // // int[] numbersTwo = new int[10];

        String[] strings = { "stringa1", "stringa2", "stringa3"}; 
        
        numbers[1] = 55;
        numbers[2] = 45;
        numbers[3] = 11;
        // numbers[4] = 11;

        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);
    
        // ! a : per ogni iterazione
            // & : elaboro l'operazione iterativa 
            // $ : controllo che la condizione iterativa sia rispettata 

        // for ( int i = 0 ; i <= 10 ; i++){
        //     System.out.println(i);
        // }


        // % quando conosco il numero di iterazioni per cui voglio iterare un blocco di codice, uso tendenzialmente un ciclo for
        // for ( int i = 0 ; i < numbers.length ; i++){
        //     System.out.println(numbers[i]);
        // }

        // & quando non conosco il numero di iterazioni per cui voglio iterare un blocco di codice, uso tendenzialmente un ciclo while`
        int i = 0;
        while( i < numbers.length){  // > finche' (espressione) l'espressione inserita (condizione iterativa) e' vera continua ad eseguire il blocco di codice
            System.out.println(numbers[i]);

            i++;
        }





    }

}
