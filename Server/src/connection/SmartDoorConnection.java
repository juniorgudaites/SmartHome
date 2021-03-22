package connection;

import controller.LightControllerInterface;
import controller.SmartDoorControllerInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class SmartDoorConnection {

    public void Connect() {
//        new Thread() {
//            @Override
//            public void run() {

                System.out.println("Caregando o cliente.");

                try {
                    SmartDoorControllerInterface objRemoto =
                            (SmartDoorControllerInterface) Naming.lookup("rmi://LOCALHOST:1103/door");

                    String option = null;
                    Scanner in = new Scanner(System.in);

                    int loop = 1;
                    while (loop != 0) {
                        System.out.println();
                        System.out.println("======================");
                        System.out.println("\tIsOpen: " + objRemoto.getIsOpen());
                        System.out.println("======================");
                        System.out.println();
                        System.out.println("===========================================");
                        System.out.println("\tO que deseja fazer com Porta?");
                        System.out.println("open = Abrir Porta");
                        System.out.println("close = Fechar Porta");
                        System.out.println("0 = Sair");
                        System.out.println("===========================================");
                        System.out.print("Insira Opção: ");
                        option = in.next();


                        if (option.equalsIgnoreCase("0")) {
                            loop = 0;
                        }
                        switch (option) {
                            case "open":
                                if (!objRemoto.getIsOpen()) {
                                    System.out.print("Insira a senha: ");
                                    objRemoto.checkPassword(in.next());
                                } else {
                                    System.out.println("\t ===== A porta já esta aberta");
                                }
                                break;
                            case "close":
                                if (objRemoto.getIsOpen()) {
                                    objRemoto.closeDoor();
                                } else {
                                    System.out.println("\t ===== A porta já está fechada");
                                }
                                break;
                            case "0":
                                System.out.println("Lampada Desconectada");
                                break;
                            default:
                                System.out.println("Opcao Invalida");
                                break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                    System.out.println("Servidor não Criado");
                }
            }
//        }.start();
//    }
}
