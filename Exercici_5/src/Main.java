//llibreria que utilitzarem per llegir el número demanat a l'usuari
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int preuCotxe = 0;

        System.out.println("Benvingut al programa!");

        do {

            //menú del programa
            System.out.println("Quin valor de mercat vols calcular? ");
            System.out.println("[1] Volkswagen Grand California");
            System.out.println("[2] Volkswagen Camper Full Equip");
            option = input.nextInt();

            //fer un switch pel menú
            switch (option) {
                case 1:
                    preuCotxe = 73490;
                    break;
                case 2:
                    preuCotxe = 73490 + 20000;
                    break;
                default:
                    System.out.println("Moltes gràcies!");
                    break;
            }

            if ((option == 1) || (option == 2)) {
                //preguntar quants km ha fet el cotxe
                System.out.println("Quants km ha fet el cotxe: ");
                double km = input.nextDouble();

                //calcular el preu final
                double preuFinal = (preuCotxe * (1 - (km * 0.0000001)));
                System.out.println("El preu final del cotxe és: " + preuFinal + "€");
            }

        } while ((option < 1) || (option > 2));
    }
}