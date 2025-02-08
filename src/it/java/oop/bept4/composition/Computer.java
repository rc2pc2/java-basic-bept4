package it.java.oop.bept4.composition;

import it.java.oop.bept4.annotations.DaFinire;

@DaFinire(value = "Mancano ancora getter e setter", 
            utilizzabile = false, 
            importanza = DaFinire.Importanza.MEDIA )
public class Computer {
    private Processore processore;      //' ✅  relazione ha-una => composizione
    private SchedaMadre schedaMadre;    //. ✅  relazione ha-una => composizione
    private Memoria[] memoria;          //; ✅  relazione ha-una => composizione


    public Computer(Processore processore, SchedaMadre schedaMadre, Memoria[] memoria){
        this.processore = processore;
        this.schedaMadre = schedaMadre;
        this.memoria = memoria;
    }

    public String accendi(){
        return "CHOMP CHOMP!";
    }
}
