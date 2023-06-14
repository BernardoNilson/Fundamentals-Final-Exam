package source;

/**
 * Undertanding the problem: README.md
 * 
 * @author: Bernardo Nilson
 * @version: 14/06/2023
 */

public class Patient {

    // Pacient attributes
    private String name, id, number, diagnosis;
    private int medicine, medicineBox;

    // Constructor method, used to create the new project
    public Patient(String name, String id, String number, String diagnosis, int medicine, int medicineBox) {

        this.name = name;
        this.id = id;
        this.number = number;
        this.diagnosis = diagnosis;
        this.medicine = medicine;
        this.medicineBox = medicineBox;

    }

    // Method to get the attributes. when requested - ChatGPT
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getMedicine() {
        return medicine;
    }

    public int getMedicineBox() {
        return medicineBox;
    }

    // Method to set new values to attributes, when requested - ChatGPT
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public void setMedicineBox(int medicineBox) {
        this.medicineBox = medicineBox;
    }

    // Method to show all medicine information, summary
    public String toString() {
        return "Pacient summary:\n- Name: " + name + "\n- ID: " + id + "\nPhone Number: " + number
                + "\nDiagnosis: " + diagnosis + "\nMedicine (Number): " + medicine
                + "\nQuantity of medicine boxes: " + medicineBox;
    }
}