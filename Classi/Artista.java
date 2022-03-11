class Artista {
    private String nome;
    private String cognome;
    private String esibizione;
    
    public Artista (String nome_artista, String cognome_artista, String esibizione_artista) {
        nome = nome_artista;
        cognome = cognome_artista;
        esibizione = esibizione_artista;
    }

    public String Nome() {
        return nome;
    }
    public String Cognome() {
        return cognome;
    }
    public String Esibizione() {
        return esibizione;
    }
}