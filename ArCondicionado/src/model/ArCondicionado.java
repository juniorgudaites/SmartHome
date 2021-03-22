/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author biizuka
 */
public class ArCondicionado {
    
    private float temperature;
    private boolean wind;
    private boolean powerButton;

    public ArCondicionado() {
        this.temperature = 23;
        this.wind = false;
        this.powerButton = false;
    }
        

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public boolean isWind() {
        return wind;
    }

    public void setWind(boolean wind) {
        this.wind = wind;
    }

    public boolean isPowerButton() {
        return powerButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
    
    
    
}
