package Classi;
//import java.sql.Date;

class Prenotazione {
    private Evento evento;
    private int num_biglietto;
        
    public Prenotazione(Evento evento_prenotato, int numero) {
        evento = evento_prenotato;
        num_biglietto = numero;
    }

    public Evento restituisceEvento() {
        return evento;
    }

    public int restituisceNumBiglietto() {
        return num_biglietto;
    }

    /**public Boolean PrenotazionePossibile() {
        Boolean esito = true;
        int n;
        if(n.restituisceNumBiglietto() == num_biglietto) {
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