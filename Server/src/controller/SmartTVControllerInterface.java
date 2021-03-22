package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SmartTVControllerInterface extends Remote {

    public void turnOffOn() throws RemoteException;
    public void changeChannel(int channel) throws RemoteException;
    public void changeVolume(int volume) throws RemoteException;
    public boolean getIsPower() throws RemoteException;
    public int getVolume() throws RemoteException;
    public int getChannel() throws RemoteException;

}
