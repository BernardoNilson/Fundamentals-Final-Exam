package source;

/**
 * Undertanding the problem: README.md
 * 
 * @author: Bernardo Nilson
 * @version: 14/06/2023
 */
 
import java.util.*;
import java.text.DecimalFormat;

public class PacientRegistration {
    
    // Daniel's group
    // Pacient attributes
    private Patient[] patient;
    private int length;
    
    // Constructor method, used to create the new project
    public PacientRegistration (int length) {

        patient = new Patient [length];
                   
    }

    




    // Method to show all medicine information, summary
    public String toString() {
        return "Medicine summary:\n- Name: " + "\nQuantity of medicine boxes: " + medicineBox;
    }

}