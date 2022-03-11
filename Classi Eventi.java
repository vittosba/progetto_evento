import java.lang.Enum;
import java.nio.file.StandardCopyOption;

class Utente{
    private string nome;
    private string cognome;
    private string email;
    private string password;
    private boolean registrazione;
    
    public Utente(string nome_utente, string cognome_utente, string email_utente, string password_utente, boolean registrazione_utente) {
        nome = nome_utente;
        cognome = cognome_utente;
        email = email_utente;
        password = password_utente;
        registrazione = registrazione_utente;
    }

    public string Nome() {
        return nome;
    }
    public string Cognome() {
        return cognome;
    }
    public string Email() {
        return email;
    }
    public string Password() {
        return password;
    }
    public boolean Registrazione() {
        return registrazione;
    }
    //public string Prenotazione() {

    //}
}

class Organizzatore_Evento {
    private string nome;
    private int cod_organizzatore;
    
    public Organizzatore_Evento(string nome_organizzatore, int codice) {
        nome = nome_organizzatore;
        cod_organizzatore = codice;
    }

    public string Creazione_Evento() {}
    
    public string Cancellazione_Evento() {}

    public string Modifica_Evento() {}

    public string Nome() {
        return nome;
    }

    public int Cod_Organizzatore() {
        return cod_organizzatore;
    }
}

class Assistenza {
    private string nome;
    private int cod_assistente;
    private int num_pratiche;
    
    public Assistenza(string nome_assistenza, int codice, int numero) {
        nome = nome_assistenza;
        cod_assistente = codice;
        num_pratiche = numero;
    }

    public string Visualizzazione_Utente() {}
    public int Nome() {
        return nome;
    }

    public int Cod_Assistente() {
        return cod_assistente;
    }

    public int Num_pratiche() {
        return num_pratiche;
    }
}

class Evento{
 
    private tipo_Ammessi tipo;
    private datatime data;
    private string luogo;
    private int capacita_persone;
    private string artista;
    
    public Evento(tipo_Ammessi tipo_evento, datatime data_evento, string luogo_evento, int capacita_evento, string artista_evento){
        tipo = tipo_evento;
        data = data_evento;
        luogo = luogo_evento;
        capacita_persone = capacita_evento;
        artista = artista_evento;
    }

    public string Creazione_Evento() {

    }
    public string Cancellazione_Evento() {

    }
    public string Modifica_Evento(){

    }
    public string Tipo() {
        return tipo;
    }
    public enum tipo_Ammessi {
        evento_musicale, evento_teatrale, evento_comico, evento_sportivo
    }
    public datatime Data(){
        return data;
    }
    public string Luogo(){
        return luogo;
    }
    public int Capacita_Persone(){
        return capacita_persone;
    }
}

class Prenotazione {
    private string evento;
    private datatime data;
    private string luogo;
    private int num_biglietto;
    private int quantita;
    private string nominativo;
    
    public Prenotazione(string evento_prenotato, datatime data_evento, string luogo_evento, int numero, int quantita_evento, string nominativo_evento){
        evento = evento_prenotato;
        data = data_evento;
        luogo = luogo_evento;
        num_biglietto = numero;
        quantita = quantita_evento;
        nominativo = nominativo_evento;
    }

    public string prenotazione() {}

    public string evento() {
        return evento;
    }

    public datatime Data() {
        return data;
    }

    public string Luogo() {
        return luogo;
    }

    public int Num_biglietto() {
        return num_biglietto;
    }

    public int Quantita() {
        return quantita;
    }

    public string Nominativo() {
        return nominativo;
    }

}

class Artista{
    private string nome;
    private string cognome;
    private string esibizione;
    
    public Artista (string nome_artista, string cognome_artista, string esibizione_artista) {
        nome = nome_artista;
        cognome = cognome_artista;
        esibizione = esibizione_artista;
    }

    public string Nome() {
        return nome;
    }
    public string Cognome() {
        return cognome;
    }
    public string Esibizione() {
        return esibizione;
    }
}

class Pagamento{
    private string tipo_pagamento;
    private string gestione_carta;
    private int num_carta;
    private int pin;
    private boolean pag;
    
    public Pagamento(string tipo, string gest, int carta, int pi, bloolean p) {
        tipo_pagamento = tipo;
        gestione_carta = gest;
        num_carta = carta;
        pin = pi;
        pag = p;
    }

    public boolean pagamento() {
        return pag;
    }
    public string Tipo_pagamento() {
        return tipo_pagamento;
    }
    public string Gestione_carta() {
        return gestione_carta;
    }
    public int Num_carta() {
        return num_carta;
    }
    public int Pin() {
        return pin;
    }
}

class Assistenza_Clienti{
    private string nome_utente;
    private string descrizione_problema;
    
    public Assistenza_Clienti(string nome, string descr){
        nome_utente = nome;
        descrizione_problema = descr;
    }

    public string Prenotazione_assisstita() {

    }
    public string Registrazione_assistita() {

    }
    public string Pagamento_assistito() {

    }
    public string Gestione_Resi() {

    }
    public string Nome_Utente() {
        return nome_utente;
    }
    public string Descrizione_Problema() {
        return descrizione_problema;
    }
}