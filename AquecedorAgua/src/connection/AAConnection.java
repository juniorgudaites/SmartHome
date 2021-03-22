package connection;

import controller.AAController;
import model.AquecedorAgua;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class AAConnection {
    public static void main(String[] args) {
        Registry registro=null;
        try {
            AquecedorAgua aquecedorAgua = new AquecedorAgua();
            AAController obj = new AAController(aquecedorAgua);
            Remote remote = UnicastRemoteObject.exportObject(obj,0);
            registro = LocateRegistry.createRegistry(1101);
            registro.rebind("aa", remote);

        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }
}
