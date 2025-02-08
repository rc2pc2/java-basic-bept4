package it.java.oop.bept4.encapsulation;

public class Rettangolo {
    private int base;
    private int altezza;
    
    public Rettangolo(int base, int altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    public int calcolaArea() {
      return base * altezza;
    }

    public int getAltezza(){
        return this.altezza;
    }

    public void setAltezza(int altezza){
        if (altezza > 1){
            this.altezza = altezza;
        }
    }

    public int getBase(){
        return this.base;
    }

    public void setBase(int base){
        if (base > 1){
            this.base = base;
        }
    }
}
