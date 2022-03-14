package Class;
class Utente{
    private String nome;
    private String cognome;
    private String email;
    private Boolean email_verificata;
    private String password;
    private Boolean registrazione;
    
    public Utente(String nome_utente, String cognome_utente, String email_utente, Boolean email_verificata_utente, String password_utente, Boolean registrazione_utente) {
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
    public String Verifica() {
        return email_verificata;
    }
    public String Password() {
        return password;
    }
    public Boolean Registrazione() {
        return registrazione;
    }
    //public String Prenotazione() {}
}