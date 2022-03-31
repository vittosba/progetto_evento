package Classi;
public class Utente { 
    /**attributi dell'utente */
    private String username;
    private String nome;
    private String cognome;
    private String email;
    private Boolean email_verificata;
    private String password;

    /**metodo costruttore */
    public Utente(String nome, String cognome, String email, Boolean email_verificata, String password) {
        setNome(nome);
        setCognome(cognome);
        setEmail(email);
        setEmail_verificata(email_verificata);
        setPassword(password);
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEmail_verificata(Boolean email_verificata) {
        this.email_verificata = email_verificata;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getNome() {   /**restituisce il nome dell'utente*/
        return nome;
    }
    public String getCognome() {    /**restituisce il cognome dell'utente*/
        return cognome;
    }
    public String getEmail() {  /**restituisce l'email dell'utente*/
        return email;
    }
    public Boolean getVerifica() {  /**verifica che l'email dell'utente sia corretta*/
        return email_verificata;
    }
    public String getPassword() {   /**restituisce la password dell'utente*/
        return password;
    }
}