package it.java.oop.bept4.animals;

public class Cat extends Animal implements Pet{
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    // @Override
    public String mangia() {
        return "mangio i croccantini... crunch crunch!";
    }

    public String graffia(){
        return "scratch scratch!!";
    }

    @Override
    public void coccola() {}

    @Override
    public String parla() {
        return "miao";
    }
}
