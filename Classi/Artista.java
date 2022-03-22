package Classi;
class Artista {
    private String nome;
    private String cognome;
    private String esibizione;
    
    public Artista (String nome_artista, String cognome_artista, String esibizione_artista) {
        nome = nome_artista;
        cognome = cognome_artista;
        esibizione = esibizione_artista;
    }

    public String restituisceNome() {
        return nome;
    }
    public String restituisceCognome() {
        return cognome;
    }
    public String restituisceEsibizione() {
        return esibizione;
    }
}