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
    //public String Prenotazione() {}
}