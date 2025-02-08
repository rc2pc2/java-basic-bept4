package it.java.oop.bept4.animals;

public class Tamagochi implements Pet {
    protected String name;

    public Tamagochi(String name){
        this.name = name;
    }

    public String canta(){
        return "lalalala";
    }

    @Override
    public void coccola() {
    }

    @Override
    public String parla() {
        return "non mi piace parlare...";
    }
}
