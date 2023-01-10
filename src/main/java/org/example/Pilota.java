package org.example;

public class Pilota {
    String nome;
    Veicolo veicolo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo() {
        FactoryVeicolo factory = new FactoryVeicolo();
        this.veicolo = factory.creaVeicolo(1);
    }

    public void guidaPiano() {
        this.veicolo.frena();
    }

    public void guidaVeloce() {
        this.veicolo.accelera();
        this.veicolo.accelera();
    }
}
