class Utente{
    private string Nome;
    private string Cognome;
    private string Email;
    private string Password;
    private boolean Registrazione;
    
    public string Nome(){}
    public string Cognome(){}
    public string Email(){}
    public string Password(){}
    public boolean Registrazione(){}
    public string Prenotazione(){}
}

class Organizzatore_Evento{
    private string Nome;
    private int Cod_Organizzatore;
    
    public string Gestione_Evento(){}
    public string Nome(){}
    public int Cod_Organizzatore(){}
}

class Assistenza{
    private string Nome;
    private int Cod_Assistente;
    private int Num_pratiche;
    
    public string Visualizzazione_Utente(){}
    public int Nome(){}
    public int Cod_Assistente(){}
    public int Num_pratiche(){}
}

class Evento{
    private string Tipo;
    private datatime Data;
    private string Luogo;
    private int Capacità_Persone;
    private string Artista;
    
    public string Creazione_Evento(){}
    public string Cancellazione_Evento(){}
    public string Modifica_Evento(){}
    public string Tipo(){}
    public datatime Data(){}
    public string Luogo(){}
    public int Capacità_Persone(){}
}

class Prenotazione{
    private string Evento;
    private datatime Data;
    private string Luogo;
    private int Num_biglietto;
    private int Quantità;
    private string Nominativo;
    
    public string prenotazione(){}
    public int Num_biglietto(){}
    public string Nominativo(){}
    public string Tipo_evento(){}
    public datatime Data(){}
    public string Luogo(){}
    public int Quantità(){}
}

class Artista{
    private string Nome;
    private string Cognome;
    private string Esibizione;
    
    public string Nome(){}
    public string Cognome(){}
    public string Esibizione(){}
}

class Pagamento{
    private string Tipo_pagamento;
    private string Gestione_carta;
    private int Num_carta;
    private int Pin;
    
    public boolean pagamento(){}
    public string Tipo_pagamento(){}
    public string Gestione_carta(){}
    public int Num_carta(){}
    public int Pin(){}
}

class Assistenza_Clienti{
    private string Nome_Utente;
    private string Descrizione_Problema;
    
    public string Prenotazione_assisstita(){}
    public string Registrazione_assistita(){}
    public string Pagamento_assistito(){}
    public string Gestione_Resi(){}
    public string Nome_Utente(){}
    public string Descrizione_Problema(){}
}