package connection;

import controller.ACControllerInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class ACConnection {
    public void Connect() {
//        new Thread() {
//            @Override
//            public void run() {

        System.out.println("Caregando o cliente.");

        try {
            ACControllerInterface objRemoto =
                    (ACControllerInterface) Naming.lookup("rmi://LOCALHOST:1102/ac");

            String option = null;
            Scanner in = new Scanner(System.in);

            int loop = 1;
            while (loop != 0) {
                System.out.println();
                System.out.println("======================");
                System.out.println("\tIsPower: " + objRemoto.getIsPower());
                System.out.println("\tIsWind: " + objRemoto.getIsWind());
                System.out.println("\tTemperatura: " + objRemoto.getTemperature());
                System.out.println("======================");
                System.out.println();
                System.out.println("===========================================");
                System.out.println("\tO que deseja fazer com Ar Condicionado?");
                System.out.println("on = Ligar Ar Condionado");
                System.out.println("off = Desligar Ar Condicionado");
                System.out.println("won = Ligar Wind");
                System.out.println("woff wind = Desligar Wind");
                System.out.println("up = Aumentar Temperatura");
                System.out.println("down = Diminuir Temperatura");
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
                            System.out.println("\t ===== Ar Condicionado já está ligado");
                        }
                        break;
                    case "off":
                        if (objRemoto.getIsPower()) {
                            objRemoto.turnOffOn();
                        } else {
                            System.out.println("\t ===== Ar Condicionado já esta desligado");
                        }
                        break;
                    case "won":
                        if (!objRemoto.getIsWind()) {
                            objRemoto.turnWindOffOn();
                        } else {
                            System.out.println("\t ===== Wind já está ligado");
                        }
                        break;
                    case "woff":
                        if (objRemoto.getIsWind()) {
                            objRemoto.turnWindOffOn();
                        } else {
                            System.out.println("\t ===== Wind já esta desligado");
                        }
                        break;
                    case "up":
                        objRemoto.changeTemperature(objRemoto.getTemperature() + 5);
                        System.out.println("A Termperatura foi aumentada em 5: " + objRemoto.getTemperature());
                        break;
                    case "down":
                        objRemoto.changeTemperature(objRemoto.getTemperature() - 5);
                        System.out.println("A Termperatura foi diminuida em 5: " + objRemoto.getTemperature());
                        break;
                    case "0":
                        System.out.println("Ar Condicionado Desconectado");
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
