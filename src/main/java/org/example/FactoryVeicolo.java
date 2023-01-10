package org.example;

public class FactoryVeicolo {
    public Veicolo creaVeicolo(int i){
        Veicolo veicolo;
        switch(i){
            case 1:
                veicolo = creaAereo();
                break;
            case 2:
                veicolo = creaMacchina();
                break;
            case 3:
                veicolo = creaTreno();
                break;
            default:
                return null;
        }
        return veicolo;
    }

    public Aereo creaAereo(){
        return new Aereo();
    }

    public Macchina creaMacchina(){
        return new Macchina();
    }

    public Treno creaTreno(){
        return new Treno();
    }
}
