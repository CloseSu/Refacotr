package ExtractMethod;
public class Extract_Method {
	String _name;
	Double amount;
	void printOwing(double amount){
		printBanner();
		//print details
		printDetails(amount);
	}
	
	void printBanner(){
		System.out.println("banner");
	}
	
	void printDetails(double amount){
		System.out.println("name:"+ _name);
		System.out.println("amount" + amount);
	}
}
