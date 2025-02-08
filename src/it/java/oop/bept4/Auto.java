package it.java.oop.bept4;

import java.util.Random;

public class Auto {
    // % variabili di istanza
    private String targa;
    private String tipoDiMotore;
    private int cilindrata;
    private int annoImmatricolazione;
    private int cavalli;
    private String nomeModello;
    private Volante volante;

    public static int numeroDiRuote = 4;
    public static int numeroDiAutoCreate = 0;

    public Auto(String targa, String tipoDiMotore, int cilindrata, int annoImmatricolazione, int cavalli, String nomeModello){
        numeroDiAutoCreate++;
        this.targa = targa;
        this.tipoDiMotore = tipoDiMotore;
        this.cilindrata = cilindrata;
        this.annoImmatricolazione = annoImmatricolazione;
        this.cavalli = cavalli;
        this.nomeModello = nomeModello;
        this.volante = new Volante();
    }

    //; Overload del costruttore
    public Auto(String nomeModello){
        numeroDiAutoCreate++;
        Random rand = new Random();
        this.targa = "AA" + rand.nextInt(100, 999) + "ZZ";
        this.tipoDiMotore = "Benzina";
        this.cilindrata = rand.nextInt(1000, 4000);
        this.annoImmatricolazione = rand.nextInt(1990, 2024);
        this.cavalli = rand.nextInt(60, 1300);
        this.nomeModello = nomeModello;
        this.volante = new Volante();
    }
    
    public String getTarga(){
        return this.targa;
    }

    // % creo un nuovo metodo visibile ovunque (public)
    // # che non restituisca nulla (void)
    // < che si chiami setTarga
    // > fornisce a chi lo invoca un parametro obbligatorio da inserire che sia di tipo String
    public void setTarga(String targa){
        // @ prende il valore consegnato presente in targa (quella inserita nell'invocazione) e la assegna al valore della variabile di istanza targa in questa istanza dell'oggeto Auto
        this.targa = targa;
    }

    public String getTipoDiMotore(){
        return this.tipoDiMotore;
    }

    public void setTipoDiMotore(String tipoDiMotore){
        this.tipoDiMotore = tipoDiMotore;
    }

    public int getCilindrata(){
        return this.cilindrata;
    }

    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }
    
    public void setAnnoImmatricolazione(int annoImmatricolazione){
        this.annoImmatricolazione= annoImmatricolazione;
    }
    public int getAnnoImmatricolazione(){
        return this.annoImmatricolazione;
    }
    
    public void setCavalli(int cavalli){
        this.cavalli = cavalli;
    }
    public int getCavalli(){
        return this.cavalli;
    }
    
    public void setNomeModello(String nomeModello){
        this.nomeModello = nomeModello;
    }

    public String getNomeModello(){
        return this.nomeModello;
    }

    public String accelera(){
        return "Accelero di " + (this.cavalli * 5) + " km/h!";
    }

    public int frena(){
        return this.cavalli * -1;
    }

    // nome + tipi di argomento
    // frena()
    // frena(String)

    public float frena(String nino){
        return 1.0f;
    }
    
    public String frena(int distanza){
        return "screeeech! Ho frenato in " + distanza + " metri!";
    }

    public String frena(int distanza, int potenza){
        return "screeeech! Ho frenato in " + distanza + " metri!";
    }

    public String frena(float potenza){
        return "screeeech! Ho frenato in " + potenza + " metri!";
    }

    public static String suonaIlClacson(){
        return "BEE-BEEP!";
    }


    public static int getNumeroDiRuote(){
        suonaIlClacson(); // % posso esclusivamente invocare altri metodi statici, 
        // . this.frena() <==> mai non statici perche' dipendono da un'istanza che non ho in quanto statico.
        return numeroDiRuote;
    }
}