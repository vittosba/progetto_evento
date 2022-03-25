package Classi;
class Main{

    public static void main(String[] args) {
        Organizzatore_Evento organizzatore_evento = new Organizzatore_Evento("Michele", 4679810);
        Operazioni_Organizzatore operazioni_organizzatore = new Operazioni_Organizzatore(organizzatore_evento);
        operazioni_organizzatore.esegui();
    }
}

