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

    public String restituisceEvento() {
        return evento;
    }

    public Date restituisceData() {
        return data;
    }

    public String restituisceLuogo() {
        return luogo;
    }

    public int restituisceNum_biglietto() {
        return num_biglietto;
    }

    public int restituisceQuantita() {
        return quantita;
    }

    public String Nominativo() {
        return nominativo;
    }

    /*public Boolean PrenotazionePossibile() {
        Boolean esito = true;
        int n;
        if(n.num_biglietto() == num_biglietto) {
            esito = false;
        }
        else{
            esito = true;
        }
        return esito;
    }
    
    public String Prenotazione() {
        if(!PrenotazionePossibile()) {
            return "Il biglietto non è disponibile";
        }
        else{

            return "La prenotazione è avvenuta con successo";
        }
    }*/
}