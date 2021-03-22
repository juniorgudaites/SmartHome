package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LightControllerInterface extends Remote {

    public void turnOffOn() throws RemoteException;
    public void changeIntensity(int intensity) throws RemoteException;
    public boolean getIsPowerButton() throws RemoteException;
    public int getIntensity() throws RemoteException;
}
