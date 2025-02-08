package it.java.oop.bept4;

public class AutoDaCorsa extends Auto{
    private int regolazioneAlettone; 
    private String tipoDiTrasmissione; 

    public AutoDaCorsa(String targa, String tipoDiMotore, int cilindrata, int annoImmatricolazione, int cavalli, String nomeModello, int regolazioneAlettone, String tipoDiTrasmissione){
        super(targa, tipoDiMotore, cilindrata, annoImmatricolazione, cavalli, nomeModello);
        this.regolazioneAlettone = regolazioneAlettone;
        this.tipoDiTrasmissione = tipoDiTrasmissione;
    }

    public int getRegolazioneAlettone(){
        return this.regolazioneAlettone;
    }

    public String getTipoDiTrasmissione(){
        return this.tipoDiTrasmissione;
    }

    public void setRegolazioneAlettone(int regolazioneAlettone){
        this.regolazioneAlettone = regolazioneAlettone;
    } 
    
    public void setTipoDiTrasmissione(String tipoDiTrasmissione){
        this.tipoDiTrasmissione = tipoDiTrasmissione;
    } 

    @Override
    public String accelera(){
        return "Accelera velocissimamente!!";
    }
}
