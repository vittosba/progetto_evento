package Classi;
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
    public String restituisceNome() {
        return nome;
    }

    public int restituisceCodAssistente() {
        return cod_assistente;
    }

    public int restituisceNumPratiche() {
        return num_pratiche;
    }
}