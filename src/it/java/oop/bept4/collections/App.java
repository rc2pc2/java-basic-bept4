package it.java.oop.bept4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {
        // String[] studentiA = new String[]{"Xina", "Zina", "Gina", "Ginetto", "Nina"};
        // // System.out.println(studentiA);
        // List<String> studentiB = Arrays.asList(studentiA); 
        // System.out.println(studentiB);
        // System.out.println(studentiB);
        // ArrayList<String> studentiList = new ArrayList<String>();
        // studentiList.add("Ninetta");
        // studentiList.add("Xina");
        // studentiList.add("Nina");
        // studentiList.add("Gino");
        // System.out.println(studentiList.get(1));
        // studentiList.remove(2);
        // System.out.println(studentiList.get(2));
        // System.out.println(studentiList.size());

        // int[] numeri = new int[]{1,2,3,4,5};
        // ArrayList<Integer> numeriList = new ArrayList<Integer>();
        // numeriList.add(1);
        // numeriList.add(2);
        // numeriList.add(3);
        // numeriList.add(4);
        // numeriList.add(5);
        // numeriList.remove(2); //, rimuovi l'elemento che si trova al posto 2
        // System.out.println(numeriList.indexOf(6));

        // Set<Integer> insiemeNumeri = new HashSet<Integer>();
        // insiemeNumeri.add(3);
        // insiemeNumeri.add(4);
        // insiemeNumeri.add(2);
        // insiemeNumeri.add(56);
        // insiemeNumeri.add(11);
        // insiemeNumeri.add(1);
        // insiemeNumeri.remove(2);
        // System.out.println(insiemeNumeri); ///' rimuovi l'elemento con valore 2

        // for( int intero : insiemeNumeri){
        //     System.out.println(intero);
        // }

        Map<String, String> dizionario = new HashMap<String, String>();
        dizionario.put("A1", "Il Milione");
        dizionario.put("B33", "Moby Dick");
        dizionario.put("Z1233", "La Gerusalemme Liberata");
        dizionario.put("N5512", "L'Orlando Furioso");
        // System.out.println(dizionario.get("A1")); //; dammi il valore associato alla chiave A1
        // dizionario.remove("A1");
        // System.out.println(dizionario.get("A1")); //; dammi il valore associato alla chiave A1

        for (String chiave: dizionario.keySet()){
            System.out.println(chiave);
            System.out.println(dizionario.get(chiave));
        }

        // for (String valore: dizionario.values() ){
        //     System.out.println(valore);
        // }


    }
}
