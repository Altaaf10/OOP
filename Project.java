
public class Project {
	
	//Attributes
	int number;
	String name;
	String buidingDesign;
	String physicalAddress;
	String erfNumber;
	int fees;
	int amountPaidToDate;
	String deadline;
	
	//Methods
	
	public Project(int number, String name, String buidingDesign, String physicalAddress, String erfNumber, int fees, int amountPaidToDate,String deadline) {
		this.number = number;
		this.name =name;
		this.buidingDesign = buidingDesign;
		this.physicalAddress = physicalAddress;
		this.erfNumber = erfNumber;
		this.fees= fees;
		this.amountPaidToDate = amountPaidToDate;
		this.deadline = deadline;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBuidingDesign() {
		return buidingDesign;
	}
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	public String getErfNumber() {
		return erfNumber;
	}
	public String getDeadline() {
		return deadline;
	}
	
	public String toString() {
		String output = "Project Number: " + number;
		output+= "\nProject Name: " + name;
		output += "\nType of building  being designed: " + buidingDesign;
		output += "\nPhysical address for the project: " + physicalAddress;
		output +=  "\nERF number: " + erfNumber;
		output += "\nThe total fee being charged for the project: " + fees;
		output +=  "\nThe total amount paid to date: " + amountPaidToDate;
		output +=  "\nDeadline for the project " + deadline;
		
		return output;
	}

}
