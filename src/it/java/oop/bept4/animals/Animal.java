package it.java.oop.bept4.animals;

public abstract class Animal {
    protected String name;
    protected int age;

    public String respira(){
        return "respiro...";
    }

    public String dormi(){
        return "zzz...zzz...";
    }

    // , chi eredita un metodo astratto si occupera' obbligatoriamente di implementarlo
    public abstract String mangia();
}
