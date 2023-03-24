import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    //... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	

    public Physician(int id) {
        super(id);        

    }

    

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    @Override
    // if assignPin is GREATER than 1000 and LESS than 9999 return true, otherwise return false
    public boolean assignPin(int pin) {
        if(pin > 1000 && pin < 9999){
            return true;
        } else {
            return false;
        }
        
  
    }

    @Override
    // prints the confirmed auth ID and the current instance id
    public boolean accessAuthorized(Integer confirmedAuthID) {
        System.out.println(confirmedAuthID);
        System.out.println(this.id);
        return (this.id == confirmedAuthID);
        

    }
	
    // TO DO: Setters & Getters

    
}