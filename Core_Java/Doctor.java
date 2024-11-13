// Base class
class Doctor {
    // Method to display the role of the doctor
    public void displayRole() {
        System.out.println("I am a Doctor.");
    }
}

// Subclass of Doctor for Surgeon
class Surgeon extends Doctor {
    // Overriding the displayRole method
    @Override
    public void displayRole() {
        System.out.println("I am a Surgeon, a specialized type of Doctor.");
    }

    // Method specific to Surgeon
    public void performSurgery() {
        System.out.println("Performing surgery...");
    }
}

// Subclass of Doctor for Nurse (Hierarchical Inheritance)
class Nurse extends Doctor {
    // Overriding the displayRole method
    @Override
    public void displayRole() {
        System.out.println("I am a Nurse, assisting Doctors.");
    }

    // Method specific to Nurse
    public void administerMedication() {
        System.out.println("Administering medication...");
    }
}

// Main class to test the inheritance and method overriding
public class MedicalProfession {
    public static void main(String[] args) {
        // Creating objects of Surgeon and Nurse
        Surgeon surgeon = new Surgeon();
        Nurse nurse = new Nurse();

        // Calling methods on Surgeon object
        surgeon.displayRole();  // Calls the overridden method in Surgeon
        surgeon.performSurgery(); // Calls the specific method for Surgeon

        System.out.println(); // Just for better output formatting

        // Calling methods on Nurse object
        nurse.displayRole();  // Calls the overridden method in Nurse
        nurse.administerMedication(); // Calls the specific method for Nurse
    }
}