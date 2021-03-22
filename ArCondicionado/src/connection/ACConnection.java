package connection;

import controller.ACController;
import model.ArCondicionado;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ACConnection {
    public static void main(String[] args) {
        Registry registro=null;
        try {
            ArCondicionado ar = new ArCondicionado();
            ACController obj = new ACController(ar);
            Remote remote = UnicastRemoteObject.exportObject(obj,0);
            registro = LocateRegistry.createRegistry(1102);
            registro.rebind("ac", remote);

        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
