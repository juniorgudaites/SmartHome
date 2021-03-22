package connection;

import controller.SmartDoorController;
import model.SmartDoor;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SmartDoorConnection {
    public static void main(String[] args) {
        Registry registro=null;
        try {
            SmartDoor ar = new SmartDoor();
            SmartDoorController obj = new SmartDoorController(ar);
            Remote remote = UnicastRemoteObject.exportObject(obj,0);
            registro = LocateRegistry.createRegistry(1103);
            registro.rebind("door", remote);

        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
