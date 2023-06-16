package source;

/**
 * Undertanding the problem: README.md
 * 
 * @author: Bernardo Nilson
 * @version: 15.06.2023
 */

public class PatientRegistration {

    // Pacient attributes
    private Patient[] patient;
    private int length;

    // Constructor method, used to create the new project
    public PatientRegistration(int length) {

        patient = new Patient[length];
        this.length = length;

    }

    // Method to ADD a new patient in this vector
    public void addPatient(Patient newPatient) {

        boolean check = false;
        for (int i = 0; i < length; i++) {

            if (this.patient[i] == null) {
                this.patient[i] = newPatient;

                newPatient.medicine.subtractStorage(newPatient.getMedicineBox());
                
                check = true;
                break;
            }

        }

        if (!check) {
            System.out.println(newPatient.getName() + " wasn't added! There was no space left");
        } else {
            System.out.println(newPatient.getName() + " was added! ");
        }

    }

    // Method to REMOVE a patient in this vector
    public void removePatient(int patientPosition) {

        if (patient[patientPosition - 1] == null) {
            System.out.println("There is nobody in this position...");
        } else {
            System.out.println("Removing... " + patient[patientPosition - 1].getName());
            patient[patientPosition - 1].medicine.addStorage(patient[patientPosition - 1].getMedicineBox());
            this.patient[patientPosition - 1] = null;

        }

    }

    // Code adapted from @Lucia Giraffa and @GeekForGeeks to write all the patients
    // names in order
    public void showPatientsName() {

        // Creates a new array with all the names to make the manipulation easier
        String[] names = new String[length];
        for (int i = 0; i < length; i++) {

            if (patient[i] != null) {
                names[i] = patient[i].getName();
            } else {
                names[i] = "";
            }

        }

        // Organize all the names in order
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {

                // To compare one name with other
                if (names[i].compareTo(names[j]) > 0) {
                    // Swapping positions
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // Exibes the informations
        System.out.println("As requested, PATIENTS NAMES:");
        for (int i = 0; i < length; i++) {
            if (!("".equals(names[i]))) {
                System.out.println(" - " + names[i]);
            }
        }

    }

    // This method is used to write all the registration informations, including the
    // null positions
    public void summaryRegistration() {

        System.out.println("As requested, REGISTRATION SUMMARY:");
        for (int i = 0; i < length; i++) {
            System.out.println("Position ( " + (i + 1) + " ):");
            System.out.println(patient[i]);
        }
    }

    // This method is used to show only the occupied positions in the registration,
    // including the name
    public void occupiedPositions() {

        System.out.println("As requested, OCCUPIED POSITIONS:");
        for (int i = 0; i < length; i++) {
            if (patient[i] != null) {
                System.out.println("Position ( " + (i + 1) + " ) with " + patient[i].getName());
            }
        }
    }

    // This method is used to show the percentage of diseases the patients have
    public void showDiseasePercentage() {

        double total = 0, covid = 0, zika = 0, chikungunya = 0, dengue = 0;

        for (int i = 0; i < length; i++) {
            if (patient[i] != null) {
                int diag = patient[i].getDiagnosis();
                switch (diag) {
                    case 1:
                        covid++; total++;
                        break;
                    case 2:
                        zika++; total++;
                        break;
                    case 3:
                        chikungunya++; total++;
                        break;
                    case 4:
                        dengue++; total++;
                        break;
                    default:
                }
            }
        }

        System.out.println("As requested, DISEASE PERCENTAGE:");
        System.out.printf(" - Patient with COVID: %.2f %% %n", (covid/total)*100);
        System.out.printf(" - Patient with ZIKA: %.2f %% %n", (zika/total)*100);
        System.out.printf(" - Patient with CHIKUNGUNYA: %.2f %% %n", (chikungunya/total)*100);
        System.out.printf(" - Patient with DENGUE: %.2f %% %n", (dengue/total)*100);

    }
}