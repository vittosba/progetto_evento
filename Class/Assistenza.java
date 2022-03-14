package Class;
class Assistenza {
    private String nome;
    private int cod_assistente;
    private int num_pratiche;
    
    public Assistenza(String nome_assistenza, int codice, int numero) {
        nome = nome_assistenza;
        cod_assistente = codice;
        num_pratiche = numero;
    }

    /*public String Visualizzazione_Utente() {
        Utente.Nome();
        Utente.Cognome();
        Utente.Email();
    }*/
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