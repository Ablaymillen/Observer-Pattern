package com.company;

public class ThermalSensoryNeurone implements Neurone{

    @Override
    public void update(Object reflex){
        System.out.println("I can feel " + ((String) reflex)+ "'s surface temperature");;
    }

}
