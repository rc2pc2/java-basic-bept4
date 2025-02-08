package it.java.oop.bept4.encapsulation;

public class AppEnc {

    
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        rettangolo.setBase(0); 
        System.out.println(rettangolo.calcolaArea());

    }
}
