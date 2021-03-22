/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.SmartTV;

import java.rmi.RemoteException;

/**
 *
 * @author biizuka
 */
public class SmartTVController implements SmartTVControllerInterface {

    private SmartTV stv;

    public SmartTVController(SmartTV stv) {
        System.out.println("Novo Servidor SmartTV Disponivel");
        this.stv = stv;
    }

    public void turnOffOn() throws RemoteException {
        if (stv.isPowerButton()) {
            stv.setPowerButton(false);
            System.out.println("TV Desligada");
        } else {
            stv.setPowerButton(true);
            System.out.println("TV Ligada");
        }
    }

    public void changeChannel(int channel) throws RemoteException{
        stv.setChannel(channel);
        System.out.println("Canal Alterado: "+ getChannel());
    }
    
    public void changeVolume(int volume) throws RemoteException{
        stv.setVolume(volume);
        System.out.println("Volume Alterado: "+ getVolume());
    }

    public boolean getIsPower() throws RemoteException{
        return stv.isPowerButton();
    }
    public int getVolume() throws RemoteException{
        return stv.getVolume();
    }

    public int getChannel() throws RemoteException{
        return stv.getChannel();
    }

}
