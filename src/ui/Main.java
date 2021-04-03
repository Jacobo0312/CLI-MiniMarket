package ui;

import java.util.Scanner;

import model.MiniMarket;

public class Main {

    private static MiniMarket miniMarket;
    private static Scanner sc;

    public Main() {
        sc = new Scanner(System.in);

        miniMarket = new MiniMarket();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("******** Starting  *********");

        Main ppal = new Main();
        int option = 0;

        do {
            option = ppal.showMenu();
            ppal.choice(option);

        } while (option != 3);

    }

    private int showMenu() {
        int option = 0;
        System.out.println(
                "1.Registar ingreso de una nueva persona\n2.Cantidad de personas que han intentado ingresar\n3.Salir de la aplicacion");

        option = Integer.parseInt(sc.nextLine());
        return option;

    }

    private void choice(int option) {

        switch (option) {
        case 1:
            verifyInput();
            break;
        case 2:getCount();

            break;
            case 3:System.out.println("Bye!");
            break;

        default:System.out.println("Seleccione una opcion correcta");
            break;
        }
    }

    private void getCount() {
        System.out.println("Cantidad total de personas que intentaron ingresar: "+miniMarket.getCount());
    }

    private void verifyInput() {
        System.out.println("Ingrese su documento de identidad:");
        System.out.println("Presione \n1.TI\n2.CC\n3.PA\n4.CE");

        try {
            int idOption = Integer.parseInt(sc.nextLine());
            String id = "";

            switch (idOption) {
            case 1:
                id = "TI";
                break;
            case 2:
                id = "CC";
                break;
            case 3:
                id = "PA";
                break;
            case 4:
                id = "CE";
                break;

            default:throw new Exception();
            }

            System.out.println("Digite el numero de su documento");
            String number=sc.nextLine();
            miniMarket.verifyInput(id, number);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Seleccione una respuesta correcta");
        }

    }


 

}
