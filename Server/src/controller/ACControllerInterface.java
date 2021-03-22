package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ACControllerInterface extends Remote {

    public void turnOffOn() throws RemoteException;
    public void turnWindOffOn() throws RemoteException;
    public void changeTemperature(float temp) throws RemoteException;
    public boolean getIsPower() throws RemoteException;
    public boolean getIsWind() throws RemoteException;
    public float getTemperature() throws RemoteException;

}
