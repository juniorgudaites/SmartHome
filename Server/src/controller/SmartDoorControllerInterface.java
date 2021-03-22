package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SmartDoorControllerInterface extends Remote {
    public boolean checkPassword(String pwd) throws RemoteException;
    public void closeDoor()  throws RemoteException;
    public boolean getIsOpen()  throws RemoteException;
}
