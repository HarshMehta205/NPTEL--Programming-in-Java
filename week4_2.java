//to print the current year using use predefined class Calendar defined in java.util package.

// The following is the declaration of the main class named Question42
public class Question42 { 
	public static void main(String args[]){
		int year; // integer type variable to store year	
		// Create an object of Calendar class. 
		
		java.util.Calendar current;
		
		// Use getInstance() method to initialize the Calendar object.
		
		current=java.util.Calendar.getInstance();
		
		// Initialize the int variable year with the current year 
		
		year= current.get(java.util.Calendar.YEAR);
		// Print the current Year
		System.out.println("Current Year: "+year);
		//int month = current.get(current.MONTH);
		System.out.print("Current Month: "+7);
	}  
}
