package org.example;

public class Treno implements Veicolo{

    int velocita = 0;

    @Override
    public void accelera(){
        velocita+=5;
    }

    @Override
    public void frena(){
        velocita-=5;
    }


    public int getVelocita() {
        return velocita;
    }
}
