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
public class Light implements Remote {
    
    private int intensity;
    private boolean powerButton;

    public Light() {
        this.intensity = 10;
        this.powerButton = false;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    
    
    public boolean isPowerButton() {
        return powerButton;
    }

    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
    
    
    
}
