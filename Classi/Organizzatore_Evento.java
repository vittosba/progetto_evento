package Classi;
class Organizzatore_Evento {
    
    private String nome;
    private int cod_organizzatore;
    public Evento[] listaEvento;
    int cont;
      
    public Organizzatore_Evento(String nome_organizzatore, int codice) {
        nome = nome_organizzatore;
        cod_organizzatore = codice;
        cont = 0;
        listaEvento = new Evento[cont+1];
    }

    public void aggiungiEvento(Evento evento){
        listaEvento [cont] = evento;
        cont++;
    }

    public boolean cancellazione_evento(String data, String luogo) {
        for (int i = 0; i < listaEvento.length; i++) {
              String data_evento = listaEvento[i].restituisceData();
              String luogo_evento = listaEvento[i].restituisceLuogo();
              if (data_evento.equals(data) && luogo_evento.equals(luogo)) {
                listaEvento[i] = listaEvento[cont - 1];
                cont--;
                return true;
              }
        }
        return false;
    }

    public boolean modifica_evento(String data, String luogo, String tipoMod, String dataMod, String luogoMod, int capacita_personeMod, String artistaMod) {
        for (int i = 0; i < listaEvento.length; i++) {
            String data_evento = listaEvento[i].restituisceData();
            String luogo_evento = listaEvento[i].restituisceLuogo();
            if (data_evento.equals(data) && luogo_evento.equals(luogo)) {
              listaEvento[i].setEvento(tipoMod, dataMod, luogoMod, capacita_personeMod, artistaMod);
              return true;
            }
      }
      return false;
    }

    public Evento[] getListaEvento(){
        return listaEvento;
    }

    public int getCont(){
        return cont;
    }

    public String restituisceNome() {
        return nome;
    }

    public int restituisceCodOrganizzatore() {
        return cod_organizzatore;
    }
}
