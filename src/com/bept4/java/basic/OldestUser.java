package com.bept4.java.basic;

import java.util.Scanner;

public class OldestUser {
    public static void main(String[] args) {
        int firstUserAge;
        int secondUserAge;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first user age: ");
        firstUserAge = input.nextInt();

        System.out.println("Enter your second user age: ");
        secondUserAge = input.nextInt();
        input.close();

        String message;

        if (firstUserAge > secondUserAge){
            message = "First user, -" + firstUserAge + "- is the oldest";
        } else if (firstUserAge < secondUserAge){
            message = "Second user, -" + secondUserAge + "- is the oldest";
        } else {
            message = "The given words share the same age!";
        }

        System.out.println(message);
    }
}
