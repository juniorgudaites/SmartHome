/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.SmartDoor;

/**
 *
 * @author biizuka
 */
public class SmartDoorController implements SmartDoorControllerInterface{

    private SmartDoor sd;

    public SmartDoorController(SmartDoor sd) {
        System.out.println("Novo Servidor SmartDoor Disponivel");
        this.sd = sd;
    }
        
    public boolean checkPassword(String pwd) {
        if (pwd.equals(sd.getPassword())){
            sd.setOpened(true);
            System.out.println("Senha Correta, Porta foi Aberta");
            return true;
        }
        return false;
    }
    
    public void closeDoor(){
        this.sd.setOpened(false);
        System.out.println("Porta foi Fechada");
    }

    public boolean getIsOpen(){
        return sd.isOpened();
    }
    
}
