package Classi;
import java.util.Scanner;
//import java.sql.Date;
public class Operazioni_Organizzatore {

    private Organizzatore_Evento organizzatore_evento;
    Scanner in = new Scanner(System.in);
    Utility U = new Utility();
    String scelta;

    public Operazioni_Organizzatore(Organizzatore_Evento newOrganizzatore){
        organizzatore_evento = newOrganizzatore;
    }

    public void esegui() {

        do{
            System.out.println("Vuoi creare un nuovo evento? " + "Inserire 1");
            System.out.println("Vuoi cancellare un evento? " + "Inserire 2");
            System.out.println("Vuoi modificare un evento? " + "Inserire 3");
            scelta = in.next();
            System.out.println("Hai scelto" + scelta); 
        }while (scelta.compareTo("1") != 0 && scelta.compareTo("2") != 0 && scelta.compareTo("3") != 0);

        if (scelta.compareTo("1") == 0) {
            creazione_evento();
        }
        else if(scelta.compareTo("2") == 0) {
            cancellazione();
        }
        else if(scelta.compareTo("3") == 0) {
            modifica();
        }
    }

    public void creazione_evento() {

        System.out.println("Inserire il tipo di evento: ");
        String tipo = in.next();

        System.out.println("Inserire la data dell'evento: ");
        String data = in.next();

        System.out.println("Inserire il luogo dell'evento: ");
        String luogo = in.next();

        System.out.println("Inserire il numero di massimo di persone che possono partecipare all'evento: ");
        int capacita_persone = in.nextInt();

        System.out.println("Inserire l'artista che partecipa all'evento: ");
        String artista = in.next();

        Evento event = new Evento(tipo, data, luogo, capacita_persone, artista);
        organizzatore_evento.aggiungiEvento(event);

    }
    
    public void cancellazione() {

        System.out.println("Inserire la data dell'evento: ");
        String data = in.next();

        System.out.println("Inserire il luogo dell'evento: ");
        String luogo = in.next();

        organizzatore_evento.cancellazione_evento(data, luogo);
    }

    public void modifica() {

        System.out.println("Inserire la data dell'evento: ");
        String data = in.next();

        System.out.println("Inserire il luogo dell'evento: ");
        String luogo = in.next();

        System.out.println("Inserire il tipo di evento: ");;
        String tipoMod = in.next();

        System.out.println("Inserire la data dell'evento: ");
        String dataMod = in.next();

        System.out.println("Inserire il luogo dell'evento: ");
        String luogoMod = in.next();
        
        System.out.println("Inserire il numero di massimo di persone che possono partecipare all'evento: ");
        int capacita_personeMod = in.nextInt();
        
        System.out.println("Inserire l'artista che partecipa all'evento: ");
        String artistaMod = in.next();

        organizzatore_evento.modifica_evento(data, luogo, tipoMod, dataMod, luogoMod, capacita_personeMod, artistaMod);
    }
}
