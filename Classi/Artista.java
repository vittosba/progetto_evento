package Classi;
class Artista {

    private String nome_arte;
    private String nome;
    private String cognome;
    private String esibizione;
    
    public Artista () {
        setNome_arte(nome_arte);
        setNome(nome);
        setCognome(cognome);
        setEsibizione(esibizione);
    }

    public void setNome_arte(String nome_arte) {
        this.nome_arte = nome_arte;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setEsibizione(String esibizione) {
        this.esibizione = esibizione;
    }

    public String getNome_arte() {
        return nome_arte;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getEsibizione() {
        return esibizione;
    }
}