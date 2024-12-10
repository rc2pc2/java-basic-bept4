package it.java.oop.bept4.animals;

public class App {
    
    public static void main(String[] args) {
        Pet animale = new Cat("fuffina", 3);
        Pet giggino = new Tamagochi("giggino");
        // Cat cat = new Cat();

        System.out.println(animale.parla());
        System.out.println(giggino.parla());
    }
}
