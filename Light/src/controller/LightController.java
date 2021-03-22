/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Light;

import java.rmi.RemoteException;

/**
 * @author biizuka
 */
public class LightController implements LightControllerInterface{

    private Light lig;

    public LightController(Light lig) throws RemoteException{
        super();
        System.out.println("Novo Servidor Light Disponivel");
        this.lig = lig;

    }

    public boolean getIsPowerButton() throws RemoteException{
        return this.lig.isPowerButton();
    }

    public int getIntensity() throws RemoteException{
        return this.lig.getIntensity();
    }

    public void turnOffOn() throws RemoteException{
        if (lig.isPowerButton()) {
            lig.setPowerButton(false);
            System.out.println("Lampada Desligada");
        } else {
            lig.setPowerButton(true);
            System.out.println("Lampada Ligada");
        }
    }

    public void changeIntensity(int intensity) throws RemoteException{
        lig.setIntensity(intensity);
        System.out.println("Intensidade alterada: "+ getIntensity());
    }

}
