package it.java.oop.bept4.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//% Posso avere dei parametri all'interno di una annotation
//% I parametri di una annotation sono definiti come metodi privi di argomenti (e altre caratteristiche) 
// # un parametro puo' essere di tipo: primitive, Class, String, enum, annotazioni oppure array di uno di questi tipi.  
// ^ un parametro puo' avere un valore di default, dopo la keyword default
// @ se ha un solo argomento si usa value(), se non ha valore di default allora diventa obbligatorio inserire questo argomento

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR}) // $ se assente, allora posso applicarla ovunque
@Inherited
@Documented
public @interface DaFinire {
    public enum Importanza { MINORE, BASSA, MEDIA, IMPORTANTE, PRIORITARIA}

    String value();
    boolean utilizzabile() default false;
    Importanza importanza() default Importanza.MINORE;
}
