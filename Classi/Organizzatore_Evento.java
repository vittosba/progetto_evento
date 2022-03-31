package Classi;
class Organizzatore_Evento {

    private int cod_organizzatore;
    private String nome;
    public Evento[] listaEvento;
    int cont;
      
    public Organizzatore_Evento(String nome_organizzatore, int codice) {
        setCod_organizzatore(cod_organizzatore);
        setNome(nome);
        cont = 0;
        listaEvento = new Evento[cont+1];
    }

    public void aggiungiEvento(Evento evento){
        listaEvento [cont] = evento;
        cont++;
    }

    public boolean cancellazione_evento(String data, String luogo) {
        for (int i = 0; i < listaEvento.length; i++) {
              String data_evento = listaEvento[i].getData();
              String luogo_evento = listaEvento[i].getLuogo();
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
            String data_evento = listaEvento[i].getData();
            String luogo_evento = listaEvento[i].getLuogo();
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

    public void setCod_organizzatore(int cod_organizzatore) {
        this.cod_organizzatore = cod_organizzatore;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod_organizzatore() {
        return cod_organizzatore;
    }
    public String getNome() {
        return nome;
    }
}
