package it.java.oop.bept4.composition;

public class ComputerPortatile extends Computer{
    private Monitor display = new Monitor();

    public ComputerPortatile(Processore processore, SchedaMadre schedaMadre, Memoria[] memoria){
        super(processore, schedaMadre, memoria);
    }
    
    @Override
    public String accendi(){
        // $ chiama il metodo accendi del parent
        return super.accendi() + " Accendi il display e accendi il computer!";
    }
}
