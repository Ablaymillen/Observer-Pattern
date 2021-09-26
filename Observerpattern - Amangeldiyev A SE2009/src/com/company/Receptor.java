package com.company;

import java.util.ArrayList;
import java.util.List;

public class Receptor {
    private String reflex;
    private List<Neurone> neurones = new ArrayList<Neurone>();

    public void addNeuron(Neurone neurone){
        this.neurones.add(neurone);
    }

    public void removeNeuron(Neurone neurone){
        this.neurones.remove(neurone);
    }

    public void NotifyAllNeurones(){
        for (Neurone neurone: this.neurones){
            neurone.update(this.reflex);
        }
    }

    public String getReflex(){
        return reflex;
    }

    public void setReflex(String reflex){
        this.reflex = reflex;
        NotifyAllNeurones();
    }



}
