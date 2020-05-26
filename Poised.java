import java.util.Scanner;
public class Poised {
	
	public static void main(String []args) {
		
		Scanner s = new Scanner (System.in); //Creates Scanner to get input for project details
		System.out.println("What is the project number?");
		int projectNumber = s.nextInt();
		
		System.out.println("\nWhat is the projects name?");
		String projectName = s.next();
		
		System.out.println("\nWhat type of building is being designed?");
		String building = s.next();
		
		System.out.println("\nWhat is the physical address for the project?");
		String address = s.next();
		
		System.out.println("\nWhat is the ERF number");
		String erf = s.next();
		
		System.out.println("\nWhat is the total fee being charged for the project R");
		int totalCost = s.nextInt();
		
		System.out.println("\nWhat is the total amount paid to date R");
		int debit = s.nextInt();
		
		System.out.println("\nWhat is the deadline for the project");
		String dueDate = s.next();
		
		/*System.out.println("What is the projects name?");
		String projectName = s.next();
		*/
		//String x =  customerName.toLowerCase();
		
		Project display= new Project(projectNumber, projectName, building, address, erf, totalCost, debit, dueDate );//inputs data to be displayed for Project class
		
		System.out.println("******Project*******");
		System.out.println(display);// prints the data for Project class
		
		System.out.println("Would you like to change the due date of the project?");//Allows user to update the due date
		String answer = s.next();
		if (answer == "YES" || answer == "yes" || answer == "Yes" ) {
			System.out.println("Enter the new due date of the project?");
			String newDate = s.next();
			dueDate = newDate;//updates the due date
		}
		else {
			dueDate =dueDate;
		}
		
		System.out.println("Would you like to change the total amount of the fee paid to date?");//Allows user to update fee paid to date
		String answerDebit = s.next();
		if (answerDebit == "YES" || answerDebit == "yes" || answerDebit == "Yes" ) {
			System.out.println("Enter the new total amount of the fee paid to date");
			int newFee = s.nextInt();
			debit = newFee;//updates fee to date
		}
		else {
			debit = debit;
		}
		
		System.out.println("*******Updated Project******");
		Project updateDisplay = display;
		System.out.println(updateDisplay);//Prints the updated Project class
		
		
		// for Contractors class 
		
		Scanner c = new Scanner (System.in);//Creates Scanner to get input for Contractors details
		
		System.out.println("What is the contractors name?");
		String nameC =c.next();
		
		System.out.println("What is the contractors telephone number?");
		String telephoneC =c.next();
		
		System.out.println("What is the contractors email adress?");
		String emailC =c.next();
		
		System.out.println("What is the contractors physical address?");
		String addressC =c.next();
		
		
		Contractor contractor = new Contractor(nameC, telephoneC, emailC,addressC);//inputs data to be displayed for Project Contractor
		
		System.out.println("*******Contractor******");
		System.out.println(contractor); // prints the data for Project Contractor
		
		System.out.println("Would you like to update the contractors details?");
		String updateC =c.next();
		String answerC = updateC;
		if (answerC == "yes"|| answerC == "YES" || answerC == "Yes") {
			System.out.println("What is the updated contractors name?");
			String updateNameC =c.next();
			
			System.out.println("What is the updated contractors telephone number?");
			String updateTelephoneC =c.next();
			
			System.out.println("What is the updated contractors email adress?");
			String updateEmailC =c.next();
			
			System.out.println("What is the updated contractors physical address?");
			String updateAddressC =c.next();
			
			Contractor updateContractor = new Contractor(updateNameC, updateTelephoneC, updateEmailC,updateEmailC);//inputs data to be displayed for Project Contractor after an update
			System.out.println("*******Updated Contractors details******");
			System.out.println(updateAddressC);// prints the data for  Contractor class after updating
			
		}
		
		// for Customers class 
			
		Scanner cus = new Scanner (System.in);//Creates Scanner to get input for Customers details
			
		System.out.println("What is the customers name?");
		String nameCustomer =cus.next();
			
		System.out.println("What is the customers telephone number?");
		String telephoneCustomer =cus.next();
			
		System.out.println("What is the customers email adress?");
		String emailCustomer =cus.next();
			
		System.out.println("What is the customers physical address?");
		String addressCustomer =cus.next();
		
		System.out.println("********Customer*******");
		Customer customer = new Customer (nameCustomer, telephoneCustomer, emailCustomer, addressCustomer);//inputs data to be displayed for Project class
		System.out.println(customer);//prints the data for Customer class after updating
		
		
		if (debit < totalCost) {
			System.out.print("*******Invoice*******");
			System.out.print("Customer Details");
			System.out.print(customer);
			int balanceDue = totalCost - debit ;
			System.out.println(balanceDue);
		}
		
	}

}
