import connection.*;

import java.util.Scanner;

public class SmartHomeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        int loop = 1;
        while (loop != 0) {
            System.out.println();
            System.out.println("======================");
            System.out.println("\tSmart Home");
            System.out.println("======================");
            System.out.println();
            System.out.println("===========================================");
            System.out.println("\tO que deseja fazer?");
            System.out.println("1 - LUZ");
            System.out.println("2 - SMART TV");
            System.out.println("3 - AR CONDICIONADO");
            System.out.println("4 - AQUECEDOR");
            System.out.println("5 - SMART DOOR");
            System.out.println("0 = Sair");
            System.out.println("===========================================");
            System.out.print("Insira Opção: ");
            option = in.nextInt();

            if (option==0) {
                loop = 0;
            }
            switch (option) {
                case 1:
                    new LightConnection().Connect();
                    break;
                case 2:
                    new SmartTVConnection().Connect();
                   break;
                case 3:
                    new ACConnection().Connect();
                    break;
                case 4:
                    new AAConnection().Connect();
                    break;
                case 5:
                    new SmartDoorConnection().Connect();
                    break;
                case 0:
                    System.out.println("Smart Home Desconectado");
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
        }

    }
}
