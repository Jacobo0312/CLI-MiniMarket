package ui;

import java.util.Scanner;

import model.MiniMarket;


public class Main {

    private static MiniMarket miniMarket;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        miniMarket= new MiniMarket();

        showMenu();
        int option = sc.nextInt();
        // Corregir exepcion de entrada si es un string

        while (option != 3) {
            if (option > 0 && option < 3) {
                choice(option);
                System.out.println("X");
            } else {
                System.out.println("Seleccione una opcion correcta");
            }
            showMenu();
            option = sc.nextInt();

        }
        System.out.println("Bye!");
    }





    private static void choice(int option) {

        switch (option) {
        case 1:

            break;
        case 2:

            break;

        default:
            break;
        }
    }

    private static void showMenu() {
        System.out.println(
                "1.Registar ingreso de una nueva persona\n2.Cantidad de personas que han intentado ingresar\n3.Salir de la aplicacion");
    }






}
