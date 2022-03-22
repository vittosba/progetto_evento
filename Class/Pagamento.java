package Class;
class Pagamento {
    private String tipo_pagamento;
    private String gestione_carta;
    private int num_carta;
    private int pin;
    private Boolean pag;
    
    public Pagamento(String tipo, String gest, int carta, int pi, boolean p) {
        tipo_pagamento = tipo;
        gestione_carta = gest;
        num_carta = carta;
        pin = pi;
        pag = p;
    }

    public Boolean restituiscePagamento() {
        return pag;
    }
    public String restituisceTipo_pagamento() {
        return tipo_pagamento;
    }
    public String restituisceGestione_carta() {
        return gestione_carta;
    }
    public int restituisceNum_carta() {
        return num_carta;
    }
    public int restituiscePin() {
        return pin;
    }
}