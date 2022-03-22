package Classi;
class Assistenza_Clienti{
    private String nome_utente;
    private String descrizione_problema;
    
    public Assistenza_Clienti(String nome, String descr) {
        nome_utente = nome;
        descrizione_problema = descr;
    }

    //public String Prenotazione_assisstita() {}
    //public String Registrazione_assistita() {}
    //public String Pagamento_assistito() {}
    //public String Gestione_Resi() {}

    public String restituisceNomeUtente() {
        return nome_utente;
    }
    public String restituisceDescrizioneProblema() {
        return descrizione_problema;
    }
}