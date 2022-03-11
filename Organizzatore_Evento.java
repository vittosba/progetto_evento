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