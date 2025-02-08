package it.java.oop.bept4;

public class App {
    public static void main(String[] args) {
        // Auto pandino = new Auto();
        // pandino.targa = "DDAWE1232D";
        // pandino.tipoDiMotore = "Metano";
        // pandino.cilindrata = 800;
        // pandino.annoImmatricolazione = 1998;
        // pandino.cavalli = 33;
        // pandino.nomeModello = "Fiat Panda Jolly";

        // Auto pandino = new Auto("DDAWE1232D", "metano", 800, 1998, 33, "Fiat Panda Jolly");

        // Auto seicento = new Auto("AA2319DDN", "benzina", 600, 2010, 70, "Fiat Seicento Ultra");

        // System.out.println(pandino.targa);
        // System.out.println(pandino.nomeModello);
        // System.out.println(seicento.targa);
        // System.out.println(seicento.nomeModello);
        // System.out.println(seicento.frena(10));
        // System.out.println(seicento.accelera());
        // System.out.println(pandino.frena(100));
        // System.out.println(pandino.accelera());

        Cat gattoUno = new Cat("Fuffi", 4);
        Cat gattoDue = new Cat("Agostina", 8);

        System.out.println(gattoDue.mew());
        System.out.println(gattoUno.mew());

    }
}
