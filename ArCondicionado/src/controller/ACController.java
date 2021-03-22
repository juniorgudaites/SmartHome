/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ArCondicionado;

/**
 *
 * @author biizuka
 */
public class ACController implements ACControllerInterface {

    private ArCondicionado ac;

    public ACController(ArCondicionado ac) {
        System.out.println("Novo Servidor Ar Condicionado Disponivel");
        this.ac = ac;
    }

    public void turnOffOn() {
        if (ac.isPowerButton()) {
            ac.setPowerButton(false);
            System.out.println("AC Desligado");
        } else {
            ac.setPowerButton(true);
            System.out.println("AC Ligado");
        }
    }

    public void turnWindOffOn() {
        if (ac.isWind()) {
            ac.setWind(false);
            System.out.println("Wind Desligado");
        } else {
            ac.setWind(true);
            System.out.println("Wind Ligado");
        }
    }
    
    public void changeTemperature(float temp){
        ac.setTemperature(temp);
        System.out.println("Termperatura Alterada: " + ac.getTemperature());
    }

    public boolean getIsPower(){
        return ac.isPowerButton();
    }

    public boolean getIsWind(){
        return ac.isWind();
    }

    public float getTemperature(){
        return ac.getTemperature();
    }
}
