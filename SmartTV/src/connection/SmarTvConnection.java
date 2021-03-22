package connection;

import controller.SmartTVController;
import model.SmartTV;
import view.SmartTVJFrame;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SmarTvConnection {
    public static void main(String[] args) throws RemoteException {
        Registry registro=null;
        try {
            SmartTV smartTV = new SmartTV();
            SmartTVController obj = new SmartTVController(smartTV);
            Remote remote = UnicastRemoteObject.exportObject(obj,0);
            registro = LocateRegistry.createRegistry(1099);
            registro.rebind("tv", remote);
            SmartTVJFrame.setFrame(smartTV,obj);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }

}
