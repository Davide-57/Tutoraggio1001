package org.example;

public class Aereo implements Veicolo{

    int velocita = 0;

    @Override
    public void accelera(){
        velocita+=10;
    }

    @Override
    public void frena(){
        velocita-=10;
    }

    public int getVelocita() {
        return velocita;
    }
}
