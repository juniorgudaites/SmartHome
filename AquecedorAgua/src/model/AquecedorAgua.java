/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.rmi.Remote;

/**
 *
 * @author biizuka
 */
public class AquecedorAgua implements Remote {
    
    private float temperature;
    private boolean powerButton;

    public AquecedorAgua() {
        this.temperature = 35;
        this.powerButton = false;
    }
        

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public boolean isPowerButton() {
        return powerButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }


    
    
    
}
