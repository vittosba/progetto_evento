package Classi;
//import java.sql.Date;
class Evento {
 
    private String tipo;
    private String data;
    private String luogo;
    private int capacita_persone;
    private String artista;
    
    public Evento(String tipo_evento, String data_evento, String luogo_evento, int capacita_evento, String artista_evento) {
        setTipo(tipo_evento);
        setData(data_evento);
        setLuogo(luogo_evento);
        setCapacitaPersone(capacita_evento);
        setArtista(artista_evento);
    }

    public void setEvento(String tipo_evento, String data_evento, String luogo_evento, int capacita_evento, String artista_evento) {
        setTipo(tipo_evento);
        setData(data_evento);
        setLuogo(luogo_evento);
        setCapacitaPersone(capacita_evento);
        setArtista(artista_evento);
    }
    public void setTipo(String tipo_evento) {
        tipo = tipo_evento;
    }
    public void setData(String data_evento){
        data = data_evento;
    }
    public void setLuogo(String luogo_evento){
        luogo = luogo_evento;
    }
    public void setCapacitaPersone(int capacita_evento){
        capacita_persone = capacita_evento;
    }
    public void setArtista(String artista_evento){
        artista = artista_evento;
    }

    public String restituisceTipo() {
        return tipo;
    }

    public String restituisceData(){
        return data;
    }
    public String restituisceLuogo(){
        return luogo;
    }
    public int restituisceCapacitaPersone(){
        return capacita_persone;
    }
    public String restituisceArtista(){
        return artista;
    }
}