package org.example;

public class Macchina implements Veicolo{

    int velocita = 0;
    @Override
    public void accelera(){
        velocita+=2;
    }

    public int getVelocita() {
        return velocita;
    }

    @Override
    public void frena(){
        velocita-=2;
    }

}
