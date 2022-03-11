package Class;
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

    public String Nome_Utente() {
        return nome_utente;
    }
    public String Descrizione_Problema() {
        return descrizione_problema;
    }
}