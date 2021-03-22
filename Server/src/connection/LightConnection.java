package connection;

import controller.LightControllerInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class LightConnection {

    public void Connect() {
//        new Thread() {
//            @Override
//            public void run() {

                System.out.println("Caregando o cliente.");

                try {
                    LightControllerInterface objRemoto =
                            (LightControllerInterface) Naming.lookup("rmi://LOCALHOST:1100/light");

                    String option = null;
                    Scanner in = new Scanner(System.in);

                    int loop = 1;
                    while (loop != 0) {
                        System.out.println();
                        System.out.println("======================");
                        System.out.println("\tIsPower: " + objRemoto.getIsPowerButton());
                        System.out.println("\tIntensity: " + objRemoto.getIntensity());
                        System.out.println("======================");
                        System.out.println();
                        System.out.println("===========================================");
                        System.out.println("\tO que deseja fazer com Lampada?");
                        System.out.println("on = Ligar");
                        System.out.println("off = Desligar");
                        System.out.println("up = Aumentar Intensidade da Lampada");
                        System.out.println("down = Diminuir Intensidade da Lampada");
                        System.out.println("0 = Sair");
                        System.out.println("===========================================");
                        System.out.print("Insira Opção: ");
                        option = in.next();

                        if (option.equalsIgnoreCase("0")) {
                            loop = 0;
                        }
                        switch (option) {
                            case "on":
                                if (!objRemoto.getIsPowerButton()) {
                                    objRemoto.turnOffOn();
                                } else {
                                    System.out.println("\t ===== Luz já está ligada");
                                }
                                break;
                            case "off":
                                if (objRemoto.getIsPowerButton()) {
                                    objRemoto.turnOffOn();
                                } else {
                                    System.out.println("\t ===== Luz já esta desligada");
                                }
                                break;
                            case "up":
                                objRemoto.changeIntensity(objRemoto.getIntensity() + 5);
                                System.out.println("A intensidade foi aumentada em 5: " + objRemoto.getIntensity());
                                break;
                            case "down":
                                objRemoto.changeIntensity(objRemoto.getIntensity() - 5);
                                System.out.println("A intensidade foi diminuida em 5: " + objRemoto.getIntensity());
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
