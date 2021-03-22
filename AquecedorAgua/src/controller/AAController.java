/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AquecedorAgua;

/**
 *
 * @author biizuka
 */
public class AAController implements AAControllerInterface{

    private AquecedorAgua aa;

    public AAController(AquecedorAgua aa) {
        System.out.println("Novo Servidor Aquecedor Disponivel");
        this.aa = aa;
    }

    public void turnOffOn() {
        if (aa.isPowerButton()) {
            aa.setPowerButton(false);
            System.out.println("Aquecedor Desligado");
        } else {
            aa.setPowerButton(true);
            System.out.println("Aquecedor Ligado");
        }
    }
    
    public void changeTemperature(float temp){
        aa.setTemperature(temp);
        System.out.println("Temperatura Alterada: " + getTemperature());
    }

    public boolean getIsPower(){
        return aa.isPowerButton();
    }
    public float getTemperature(){
        return aa.getTemperature();
    }
}
