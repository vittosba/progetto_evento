//import java.lang.Enum;
import javax.xml.crypto.Data;

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
    private int cod_organizzatore;
    
    public Organizzatore_Evento(String nome_organizzatore, int codice) {
        nome = nome_organizzatore;
        cod_organizzatore = codice;
    }

    //public String Creazione_Evento() {}
    
    //public String Cancellazione_Evento() {}

    //public String Modifica_Evento() {}

    public String Nome() {
        return nome;
    }

    public int Cod_Organizzatore() {
        return cod_organizzatore;
    }
}

class Assistenza {
    private String nome;
    private int cod_assistente;
    private int num_pratiche;
    
    public Assistenza(String nome_assistenza, int codice, int numero) {
        nome = nome_assistenza;
        cod_assistente = codice;
        num_pratiche = numero;
    }

    //public String Visualizzazione_Utente() {}
    public String Nome() {
        return nome;
    }

    public int Cod_Assistente() {
        return cod_assistente;
    }

    public int Num_pratiche() {
        return num_pratiche;
    }
}

//public enum tipo_Ammessi {
//    evento_musicale, evento_teatrale, evento_comico, evento_sportivo}

class Evento {
 
    private String tipo;
    private Data data;
    private String luogo;
    private int capacita_persone;
    private String artista;
    
    public Evento(String tipo_evento, Data data_evento, String luogo_evento, int capacita_evento, String artista_evento) {
        tipo = tipo_evento;
        data = data_evento;
        luogo = luogo_evento;
        capacita_persone = capacita_evento;
        artista = artista_evento;
    }

    //public String Creazione_Evento() {}
    //public String Cancellazione_Evento() {}
    //public String Modifica_Evento() {}

    public String Tipo() {
        return tipo;
    }

    public Data Data(){
        return data;
    }
    public String Luogo(){
        return luogo;
    }
    public int Capacita_Persone(){
        return capacita_persone;
    }
    public String Artista(){
        return artista;
    }
}

class Prenotazione {
    private String evento;
    private Data data;
    private String luogo;
    private int num_biglietto;
    private int quantita;
    private String nominativo;
    
    public Prenotazione(String evento_prenotato, Data data_evento, String luogo_evento, int numero, int quantita_evento, String nominativo_evento) {
        evento = evento_prenotato;
        data = data_evento;
        luogo = luogo_evento;
        num_biglietto = numero;
        quantita = quantita_evento;
        nominativo = nominativo_evento;
    }

    //public String Prenotazione() {}

    public String evento() {
        return evento;
    }

    public Data Data() {
        return data;
    }

    public String Luogo() {
        return luogo;
    }

    public int Num_biglietto() {
        return num_biglietto;
    }

    public int Quantita() {
        return quantita;
    }

    public String Nominativo() {
        return nominativo;
    }

}

class Artista {
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

class Pagamento {
    private String tipo_pagamento;
    private String gestione_carta;
    private int num_carta;
    private int pin;
    private Boolean pag;
    
    public Pagamento(String tipo, String gest, int carta, int pi, boolean p) {
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
    public int Num_carta() {
        return num_carta;
    }
    public int Pin() {
        return pin;
    }
}

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