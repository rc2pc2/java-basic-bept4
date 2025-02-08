package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        boolean isFound = false;
        
        int i = 0;
        while (i < guests.length && !isFound){
            if ( guests[i].equalsIgnoreCase(userInput)){
                isFound = true;
            }
        
            i++;
        }


        i = i - 1;
        if (isFound){
            System.out.println("Puoi entrare!! Con indice: " + i);
        } else {
            System.out.println("Mi dispiace, non puoi entrare " + i);
        }

        // int foundIndex = -1;

        // for (int i = 0; i < guests.length; i++) {
        //     if (guests[i].equalsIgnoreCase(userInput)){
        //         foundIndex = i;
        //         // isFound = true;
        //     }
        // }

        // if (foundIndex >= 0){
        //     System.out.println("Puoi entrare!! Con indice: " + foundIndex);
        // } else {
        //     System.out.println("Mi dispiace, non puoi entrare " + foundIndex);
        // }


        input.close();
    }
}
