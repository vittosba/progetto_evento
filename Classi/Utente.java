package Classi;
public class Utente { 
    /**attributi dell'utente */
    private String nome;
    private String cognome;
    private String email;
    private Boolean email_verificata;
    private String password;

    /**metodo costruttore */
    public Utente(String nome_utente, String cognome_utente, String email_utente, Boolean email_verificata_utente, String password_utente) {
        nome = nome_utente;
        cognome = cognome_utente;
        email = email_utente;
        password = password_utente;
    }

    public String restituisceNome() {   /**restituisce il nome dell'utente*/
        return nome;
    }
    public String restituisceCognome() {    /**restituisce il cognome dell'utente*/
        return cognome;
    }
    public String restituisceEmail() {  /**restituisce l'email dell'utente*/
        return email;
    }
    public Boolean restituisceVerifica() {  /**verifica che l'email dell'utente sia corretta*/
        return email_verificata;
    }
    public String restituiscePassword() {   /**restituisce la password dell'utente*/
        return password;
    }
}