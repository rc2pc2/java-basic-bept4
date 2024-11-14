package com.bept4.java.basic;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        String firstUserWord;
        String secondUserWord;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first word: ");
        firstUserWord = input.nextLine();

        System.out.println("Enter your second word: ");
        secondUserWord = input.nextLine();
        input.close();

        String message;

        if (firstUserWord.length() > secondUserWord.length()){
            message = "First word, -" + firstUserWord + "- is the longest";
        } else if (firstUserWord.length() < secondUserWord.length()){
            message = "Second word, -" + secondUserWord + "- is the longest";
        } else {
            message = "The given words share the same length!";
        }

        System.out.println(message);
    }
}
