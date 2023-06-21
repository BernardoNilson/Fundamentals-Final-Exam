package source;

/**
 * @author: Bernardo Nilson
 * @version: 18.06.2023
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

        // It was created to help the program organize the medicine summary
        Medicine[] inventory = { medicineCovid, medicineZika, medicineChikungunya, medicineDengue };

        // Creates the registration objetion, the main object of this application
        PatientRegistration registration = new PatientRegistration(10);

        // Variables to keep the program in loop
        boolean exit = false;

        // Introduction to the program
        System.out.println("\033\143"); // Cleans the terminal
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
            scan.nextLine(); // Receive the 'enter' that continues in the Scanner

            // MENU
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
                    // Converts the diagnosis in the necessary medicine for that disease
                    Medicine medicine = convertMedicine(diagnosis, medicineCovid, medicineZika, medicineChikungunya,
                            medicineDengue);

                    System.out.print("\nHow much medicine is required (ex. 0)? ");
                    int medicineBox = scan.nextInt();

                    // Creates the new patient
                    Patient newPatient = new Patient(name, id, number, diagnosis, medicine, medicineBox);
                    // Storage the patient in the registration
                    if (medicineBox < medicine.getMedicineBox()) {
                        registration.addPatient(newPatient);
                    } else {
                        System.out.println(newPatient.getName() + " wasn't added! There was no medicine left");
                    }
                    

                    break;

                case 2:
                    System.out.println("You select 'REMOVE PACIENT'!");

                    System.out.println("\nWhich position do you want to remove? ");
                    // Show all occupied positions to the user choose
                    registration.occupiedPositions();

                    System.out.print("Your response: ");
                    int position = scan.nextInt();

                    // Remove the patient of that position
                    registration.removePatient(position);
                    break;
                case 3:
                    System.out.println("You select 'MANAGE REGISTRATION'!\n");

                    // That registration method is used to show all the informations, without
                    // exceptions
                    registration.summaryRegistration();

                    break;
                case 4:
                    System.out.println("You select 'MANAGE MEDICINE'!\n");

                    // Loop to show all medicine storage informations
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

                    break;
                default:
                    System.out.println("Something wrong happens! Try again...");
                    break;
            }

        } while (!exit);

        scan.close();
    }

    // Converts diagnosis number into medicine object
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