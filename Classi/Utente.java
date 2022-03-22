package Classi;
class Utente {
    private String nome;
    private String cognome;
    private String email;
    private Boolean email_verificata;
    private String password;
    
    public Utente(String nome_utente, String cognome_utente, String email_utente, Boolean email_verificata_utente, String password_utente) {
        nome = nome_utente;
        cognome = cognome_utente;
        email = email_utente;
        password = password_utente;
    }

    public String restituisceNome() {
        return nome;
    }
    public String restituisceCognome() {
        return cognome;
    }
    public String restituisceEmail() {
        return email;
    }
    public Boolean restituisceVerifica() {
        return email_verificata;
    }
    public String restituiscePassword() {
        return password;
    }
}