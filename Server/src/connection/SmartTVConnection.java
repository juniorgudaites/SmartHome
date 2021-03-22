package connection;

import controller.LightControllerInterface;
import controller.SmartTVControllerInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class SmartTVConnection {
    public void Connect() {
//        new Thread() {
//            @Override
//            public void run() {

                System.out.println("Caregando o cliente.");

                try {
                    SmartTVControllerInterface objRemoto =
                            (SmartTVControllerInterface) Naming.lookup("rmi://LOCALHOST:1099/tv");

                    String option = null;
                    Scanner in = new Scanner(System.in);

                    int loop = 1;
                    while (loop != 0) {
                        System.out.println();
                        System.out.println("======================");
                        System.out.println("\tIsPower: " + objRemoto.getIsPower());
                        System.out.println("\tVolume: " + objRemoto.getVolume());
                        System.out.println("\tChannel: " + objRemoto.getChannel());
                        System.out.println("======================");
                        System.out.println();
                        System.out.println("===========================================");
                        System.out.println("\tO que deseja fazer com TV?");
                        System.out.println("on = Ligar");
                        System.out.println("off = Desligar");
                        System.out.println("up = Aumentar Volume");
                        System.out.println("down = Diminuir Volume");
                        System.out.println("channel = Alterar Canal");
                        System.out.println("0 = Sair");
                        System.out.println("===========================================");
                        System.out.print("Insira Opção: ");
                        option = in.next();

                        if (option.equalsIgnoreCase("0")) {
                            loop = 0;
                        }
                        switch (option) {
                            case "on":
                                if (!objRemoto.getIsPower()) {
                                    objRemoto.turnOffOn();
                                } else {
                                    System.out.println("\t ===== TV já está ligada");
                                }
                                break;
                            case "off":
                                if (objRemoto.getIsPower()) {
                                    objRemoto.turnOffOn();
                                } else {
                                    System.out.println("\t ===== TV já esta desligada");
                                }
                                break;
                            case "up":
                                objRemoto.changeVolume(objRemoto.getVolume() + 5);
                                System.out.println("A intensidade foi aumentada em 5: " + objRemoto.getVolume());
                                break;
                            case "down":
                                objRemoto.changeVolume(objRemoto.getVolume() - 5);
                                System.out.println("A intensidade foi diminuida em 5: " + objRemoto.getVolume());
                                break;
                            case "channel":
                                System.out.print("Insira o Canal: ");
                                objRemoto.changeChannel(in.nextInt());
                                break;
                            case "0":
                                System.out.println("TV Desconectada");
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
