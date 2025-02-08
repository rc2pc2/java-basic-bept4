package it.java.oop.bept4.composition;

import java.lang.annotation.Annotation;

import it.java.oop.bept4.annotations.DaFinire;

public class App {
    public static void main(String[] args) {
        Memoria[] memorie = {
            new MemoriaPrimaria(),
            new MemoriaSecondaria(),
            new MemoriaPrimaria(),
        };

        Computer pc = new Computer(new NanoProcessore(), new SchedaMadre(), memorie);
        Computer laptop = new ComputerPortatile(new NanoProcessore(), new SchedaMadre(), memorie);

        System.out.println(pc.accendi());
        System.out.println(laptop.accendi());

        // Annotation annotation = pc.getClass().getAnnotation(DaFinire.class);
        // DaFinire myAnnotation = (DaFinire) annotation;
        DaFinire myAnnotation = pc.getClass().getAnnotation(DaFinire.class);

        if (myAnnotation == null){
            System.out.println("Non sei un controller");
        } else {
            System.out.println("Sei un controller");
        }
        
        // if( myAnnotation.utilizzabile() ){
        //     System.out.println("posso utilizzare comunque la mia classe");
        // } else {
        //     System.out.println("Warning: stai utilizzando una classe ancora da finire, poiche': " + myAnnotation.value());
        // }

    }
}
