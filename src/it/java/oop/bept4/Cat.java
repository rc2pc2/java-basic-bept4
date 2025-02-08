package it.java.oop.bept4;

public class Cat {
    public String color;  // % controlla l'accesso alla variabile di istanza sia in lettura che in scrittura
    protected int age;
    private String name;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String mew(){
        this.mewTwo();
        return this.name + " mews!";
    }

    private String mewTwo(){ 
        return this.name + " mews!";
    }
}
