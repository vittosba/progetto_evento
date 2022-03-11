import java.lang.Enum;

class Utente{
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private Boolean registrazione;
    
    public Utente(String nome_utente, String cognome_utente, String email_utente, String password_utente, Boolean registrazione_utente) {
        nome = nome_utente;
        cognome = cognome_utente;
        email = email_utente;
        password = password_utente;
        registrazione = registrazione_utente;
    }

    public String Nome() {
        return nome;
    }
    public String Cognome() {
        return cognome;
    }
    public String Email() {
        return email;
    }
    public String Password() {
        return password;
    }
    public Boolean Registrazione() {
        return registrazione;
    }
    //public String Prenotazione() {

    //}
}

class Organizzatore_Evento {
    private String nome;
    private Int cod_organizzatore;
    
    public Organizzatore_Evento(String nome_organizzatore, Int codice) {
        nome = nome_organizzatore;
        cod_organizzatore = codice;
    }

    public String Creazione_Evento() {}
    
    public String Cancellazione_Evento() {}

    public String Modifica_Evento() {}

    public String Nome() {
        return nome;
    }

    public Int Cod_Organizzatore() {
        return cod_organizzatore;
    }
}

class Assistenza {
    private String nome;
    private Int cod_assistente;
    private Int num_pratiche;
    
    public Assistenza(String nome_assistenza, Int codice, Int numero) {
        nome = nome_assistenza;
        cod_assistente = codice;
        num_pratiche = numero;
    }

    public String Visualizzazione_Utente() {}
    public Int Nome() {
        return nome;
    }

    public Int Cod_Assistente() {
        return cod_assistente;
    }

    public Int Num_pratiche() {
        return num_pratiche;
    }
}

class Evento{
 
    private tipo_Ammessi tipo;
    private Datatime data;
    private String luogo;
    private Int capacita_persone;
    private String artista;
    
    public Evento(tipo_Ammessi tipo_evento, Datatime data_evento, String luogo_evento, Int capacita_evento, String artista_evento){
        tipo = tipo_evento;
        data = data_evento;
        luogo = luogo_evento;
        capacita_persone = capacita_evento;
        artista = artista_evento;
    }

    public String Creazione_Evento() {

    }
    public String Cancellazione_Evento() {

    }
    public String Modifica_Evento(){

    }
    public String Tipo() {
        return tipo;
    }
    public enum tipo_Ammessi {
        evento_musicale, evento_teatrale, evento_comico, evento_sportivo
    }
    public Datatime Data(){
        return data;
    }
    public String Luogo(){
        return luogo;
    }
    public Int Capacita_Persone(){
        return capacita_persone;
    }
}

class Prenotazione {
    private String evento;
    private Datatime data;
    private String luogo;
    private Int num_biglietto;
    private Int quantita;
    private String nominativo;
    
    public Prenotazione(String evento_prenotato, Datatime data_evento, String luogo_evento, Int numero, Int quantita_evento, String nominativo_evento){
        evento = evento_prenotato;
        data = data_evento;
        luogo = luogo_evento;
        num_biglietto = numero;
        quantita = quantita_evento;
        nominativo = nominativo_evento;
    }

    public String prenotazione() {}

    public String evento() {
        return evento;
    }

    public Datatime Data() {
        return data;
    }

    public String Luogo() {
        return luogo;
    }

    public Int Num_biglietto() {
        return num_biglietto;
    }

    public Int Quantita() {
        return quantita;
    }

    public String Nominativo() {
        return nominativo;
    }

}

class Artista{
    private String nome;
    private String cognome;
    private String esibizione;
    
    public Artista (String nome_artista, String cognome_artista, String esibizione_artista) {
        nome = nome_artista;
        cognome = cognome_artista;
        esibizione = esibizione_artista;
    }

    public String Nome() {
        return nome;
    }
    public String Cognome() {
        return cognome;
    }
    public String Esibizione() {
        return esibizione;
    }
}

class Pagamento{
    private String tipo_pagamento;
    private String gestione_carta;
    private Int num_carta;
    private Int pin;
    private Boolean pag;
    
    public Pagamento(String tipo, String gest, Int carta, Int pi, bloolean p) {
        tipo_pagamento = tipo;
        gestione_carta = gest;
        num_carta = carta;
        pin = pi;
        pag = p;
    }

    public Boolean pagamento() {
        return pag;
    }
    public String Tipo_pagamento() {
        return tipo_pagamento;
    }
    public String Gestione_carta() {
        return gestione_carta;
    }
    public Int Num_carta() {
        return num_carta;
    }
    public Int Pin() {
        return pin;
    }
}

class Assistenza_Clienti{
    private String nome_utente;
    private String descrizione_problema;
    
    public Assistenza_Clienti(String nome, String descr){
        nome_utente = nome;
        descrizione_problema = descr;
    }

    public String Prenotazione_assisstita() {

    }
    public String Registrazione_assistita() {

    }
    public String Pagamento_assistito() {

    }
    public String Gestione_Resi() {

    }
    public String Nome_Utente() {
        return nome_utente;
    }
    public String Descrizione_Problema() {
        return descrizione_problema;
    }
}