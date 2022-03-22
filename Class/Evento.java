package Class;
import java.sql.Date;

class Evento {
 
    private String tipo;
    private Date data;
    private String luogo;
    private int capacita_persone;
    private String artista;
    
    public Evento(String tipo_evento, Date data_evento, String luogo_evento, int capacita_evento, String artista_evento) {
        tipo = tipo_evento;
        data = data_evento;
        luogo = luogo_evento;
        capacita_persone = capacita_evento;
        artista = artista_evento;
    }

    //public String Creazione_Evento() {}
    //public String Cancellazione_Evento() {}
    //public String Modifica_Evento() {}

    public String restituisceTipo() {
        return tipo;
    }

    public Date restituisceData(){
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