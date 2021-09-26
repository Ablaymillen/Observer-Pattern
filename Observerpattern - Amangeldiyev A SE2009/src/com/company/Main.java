package com.company;

public class Main {

    public static void main(String[] args) {
	    Receptor rec = new Receptor();
	    ThermalSensoryNeurone tempsn = new ThermalSensoryNeurone();
		ThermalSensoryNeurone thermalSensoryNeurone = new ThermalSensoryNeurone();

		rec.addNeuron(tempsn);
		rec.addNeuron(thermalSensoryNeurone);

	    rec.setReflex("Fire");
		rec.setReflex("Ice");
    }
}
