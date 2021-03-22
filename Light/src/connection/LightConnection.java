package connection;

import controller.LightController;
import model.Light;
import view.LightJFrame;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class LightConnection {

    public static void main(String[] args) throws RemoteException {
        Registry registro=null;
        try {
            Light light = new Light();
            LightController obj = new LightController(light);
            Remote remote = UnicastRemoteObject.exportObject(obj,0);
            registro = LocateRegistry.createRegistry(1100);
            registro.rebind("light", remote);
            LightJFrame.setFrame(light,obj);
            //LightJFrame.main(args);

        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }

}
