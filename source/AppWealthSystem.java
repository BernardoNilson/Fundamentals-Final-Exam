package source;

/**
 * Undertanding the problem: README.md
 * 
 * @author: Bernardo Nilson
 * @version: 15.06.2023
 */

import java.util.*;

public class AppWealthSystem {

    public static void main(String[] args) {

        // Creates the Scanner object
        Scanner scan = new Scanner(System.in);

        // Creating all the medicines
        Medicine medicineCovid = new Medicine("CovixUltra", 100);
        Medicine medicineZika = new Medicine("Zicox", 150);
        Medicine medicineChikungunya = new Medicine("ChikTop", 50);
        Medicine medicineDengue = new Medicine("Denguenit", 200);
    
        Medicine [] inventory = {medicineCovid, medicineZika, medicineChikungunya, medicineDengue};


        PatientRegistration registration = new PatientRegistration(10);
        
        boolean exit = false;

        System.out.println("\033\143");
        System.out.println("You're welcome to Wealth System!\n");

        do {

            // MENU TABLE
            System.out.println("\n --------- MENU ---------");
            System.out.println(" ( 1 ) - ADD PACIENT");
            System.out.println(" ( 2 ) - REMOVE PACIENT");
            System.out.println(" ( 3 ) - MANAGE REGISTRATION");
            System.out.println(" ( 4 ) - MANAGE MEDICINE");
            System.out.println(" ( 5 ) - SEE PACIENTS");
            System.out.println(" ( 6 ) - EXIT PROGRAM!");
            System.out.println(" ------------------------");

            // Menu selection
            System.out.print("Your response: ");
            int menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {

                case 1:
                    System.out.println("\nYou select 'ADD PACIENT'!");

                    System.out.print("\nWhat's the name? ");
                    String name = scan.nextLine();

                    System.out.print("\nWhat's the ID (ex. 000.000.000-00)? ");
                    String id = scan.nextLine();

                    System.out.print("\nWhat's the number (ex. 00 00000-0000)? ");
                    String number = scan.nextLine();

                    System.out.println("\nWhat's the diagnosis? ");
                    System.out.println(" ( 1 ) - COVID");
                    System.out.println(" ( 2 ) - ZIKA");
                    System.out.println(" ( 3 ) - CHIKUNGUNYA");
                    System.out.println(" ( 4 ) - DENGUE");
                    System.out.print("Your response: ");
                    int diagnosis = scan.nextInt();
                    Medicine medicine = convertMedicine(diagnosis, medicineCovid, medicineZika, medicineChikungunya,
                            medicineDengue);

                    System.out.print("\nHow much medicine is required (ex. 0)? ");
                    int medicineBox = scan.nextInt();

                    Patient newPatient = new Patient(name, id, number, diagnosis, medicine, medicineBox);

                    registration.addPatient(newPatient);

                    break;

                case 2:
                    System.out.println("You select 'REMOVE PACIENT'!");

                    System.out.println("\nWhich position do you want to remove? ");
                    registration.occupiedPositions();

                    System.out.print("Your response: ");
                    int position = scan.nextInt();

                    registration.removePatient(position);
                    break;
                case 3:
                    System.out.println("You select 'MANAGE REGISTRATION'!\n");

                    registration.summaryRegistration();
                    break;
                case 4:
                    System.out.println("You select 'MANAGE MEDICINE'!\n");
                    
                    System.out.println("As requested, MEDICINE SUMMARY:");
                    for (int i = 0; i < inventory.length; i++) {
                        System.out.println(inventory[i].toString());
                    }

                    break;
                case 5:
                    System.out.println("\nYou select 'SEE PACIENTS'!\n");
                    registration.showPatientsName();
                    registration.showDiseasePercentage();
                    break;
                case 6:
                    System.out.println("You select 'EXIT PROGRAM'!\nSee you next time :)");
                    exit = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Something wrong happens! Try again...");
                    break;
            }

        } while (!exit);

        scan.close();
    }

    // Converts diagnosis number into medicine String to enter the patient
    // information
    public static Medicine convertMedicine(int medicine, Medicine covid, Medicine zika, Medicine chikungunya,
            Medicine dengue) {
        switch (medicine) {
            case 1:
                return covid;
            case 2:
                return zika;
            case 3:
                return chikungunya;
            case 4:
                return dengue;
            default:
                System.out.println("Something wrong happens! Try again...");
                return null;
        }
    }
}