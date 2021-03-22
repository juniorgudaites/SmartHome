package connection;

import controller.AAControllerInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class AAConnection {
    public void Connect() {
//        new Thread() {
//            @Override
//            public void run() {

        System.out.println("Caregando o cliente.");

        try {
            AAControllerInterface objRemoto =
                    (AAControllerInterface) Naming.lookup("rmi://LOCALHOST:1101/aa");

            String option = null;
            Scanner in = new Scanner(System.in);

            int loop = 1;
            while (loop != 0) {
                System.out.println();
                System.out.println("======================");
                System.out.println("\tIsPower: " + objRemoto.getIsPower());
                System.out.println("\tTemperatura: " + objRemoto.getTemperature());
                System.out.println("======================");
                System.out.println();
                System.out.println("===========================================");
                System.out.println("\tO que deseja fazer com Aquecedor?");
                System.out.println("on = Ligar");
                System.out.println("off = Desligar");
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
                            System.out.println("\t ===== Luz já está ligada");
                        }
                        break;
                    case "off":
                        if (objRemoto.getIsPower()) {
                            objRemoto.turnOffOn();
                        } else {
                            System.out.println("\t ===== Luz já esta desligada");
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
                        System.out.println("Aquecedor Desconectado");
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
