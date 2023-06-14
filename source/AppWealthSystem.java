package source;

/**
 * Undertanding the problem: README.md
 * 
 * @author: Bernardo Nilson
 * @version: 14/06/2023
 */

import java.util.*;

public class AppWealthSystem {

    public static void main(String[] args) {

        // Creates the Scanner object
        Scanner scan = new Scanner(System.in);

        // Creating all the medicines
        Medicine medicineCovid = new Medicine("CovixUltra", 100);
        Medicine medicineZica = new Medicine("Zicox", 150);
        Medicine medicineChikungunya = new Medicine("ChikTop", 50);
        Medicine medicineDengue = new Medicine("Denguenit", 200);
        
        PacientRegistration registration = new PacientRegistration(10);

        System.out.println("\033\143");
        System.out.println("You're welcome to Wealth System!\n");
        
        do {
            
            // MENU TABLE
            System.out.println(" --------- MENU ---------");
            System.out.println(" ( 1 ) - ADD PACIENT");
            System.out.println(" ( 2 ) - REMOVE PACIENT");
            System.out.println(" ( 3 ) - MANAGE INVENTORY");
            System.out.println(" ( 4 ) - SEE PACIENT");
            System.out.println(" ( 5 ) - EXIT PROGRAM!");
            System.out.println(" ------------------------");

            // Menu selection
            System.out.print("Your reponse: ");
            int menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                
                case 1:
                    System.out.println("You select 'ADD PACIENT'!");

                    System.out.print("\nWhat's the name? ");
                    String name = scan.nextLine();

                    System.out.print("\nWhat's the ID (ex. 000.000.000-00)? ");
                    String id = scan.nextLine();

                    System.out.print("\nWhat's the number (ex. 00 00000-0000)? ");
                    String number = scan.nextLine();

                    System.out.println("\nWhat's the diagnosis? ");
                    System.out.println(" ( 1 ) - COVID");
                    System.out.println(" ( 2 ) - ZICA");
                    System.out.println(" ( 3 ) - CHIKUNGUNYA");
                    System.out.println(" ( 4 ) - DENGUE");
                    System.out.print("Your reponse: ");
                    int diagnosis = scan.nextInt();

                    System.out.print("\nHow much medicine is required (ex. 0)? ");
                    int medicine = scan.nextInt();

                    Patient patient = new Patient(name, id, number, diagnosis, diagnosis, medicine);

                    System.out.println(patient);
                    break;

                case 2:

                case 3:

                case 4:

                case 5:

                default:
                System.out.println("Something wrong happens! Try again...");
                break;
            }

        } while (false);

    }
}