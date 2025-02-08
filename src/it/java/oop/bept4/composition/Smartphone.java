package it.java.oop.bept4.composition;

public class Smartphone {
    private Processore processore;      //' ✅  relazione ha-una => composizione
    private SchedaMadre schedaMadre;    //. ✅  relazione ha-una => composizione
    private Memoria[] memoria;          //; ✅  relazione ha-una => composizione
    private Monitor display;
}
