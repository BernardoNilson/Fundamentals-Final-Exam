package source;

/**
 * Undertanding the problem: README.md
 * 
 * @author: Bernardo Nilson
 * @version: 15.06.2023
 */



public class Medicine {

    // Pacient attributes
    private String name;
    private int medicineBox;

    // Constructor method, used to create the new project
    public Medicine(String name, int medicineBox) {

        this.name = name;
        this.medicineBox = medicineBox;

    }

    // Method to get the attributes. when requested - ChatGPT
    public String getName() {
        return name;
    }

    public int getMedicineBox() {
        return medicineBox;
    }

    // Method to set new values to attributes, when requested - ChatGPT
    public void setName(String name) {
        this.name = name;
    }

    public void setMedicineBox(int medicineBox) {
        this.medicineBox = medicineBox;
    }

    // Increase the storage attribute with that variable
    public void addStorage(int medicineBox) {
        this.medicineBox += medicineBox;
    }

    // Decrease the storage attribute with that variable
    public void subtractStorage(int medicineBox) {
        this.medicineBox -= medicineBox;
    }

    // Method to show all medicine information, summary
    public String toString() {
        return "- Name: " + name + "\n- Quantity avaliable: " + medicineBox;
    }
}