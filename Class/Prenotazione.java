package Class;
import java.sql.Date;

class Prenotazione {
    private String evento;
    private Date data;
    private String luogo;
    private int num_biglietto;
    private int quantita;
    private String nominativo;
    
    public Prenotazione(String evento_prenotato, Date data_evento, String luogo_evento, int numero, int quantita_evento, String nominativo_evento) {
        evento = evento_prenotato;
        data = data_evento;
        luogo = luogo_evento;
        num_biglietto = numero;
        quantita = quantita_evento;
        nominativo = nominativo_evento;
    }

    //public String Prenotazione() {}

    public String evento() {
        return evento;
    }

    public Date Data() {
        return data;
    }

    public String Luogo() {
        return luogo;
    }

    public int Num_biglietto() {
        return num_biglietto;
    }

    public int Quantita() {
        return quantita;
    }

    public String Nominativo() {
        return nominativo;
    }

}