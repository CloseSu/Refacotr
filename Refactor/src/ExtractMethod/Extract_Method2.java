package ExtractMethod;
import java.util.Enumeration;

public class Extract_Method2 {
	private Order _orders;
	private String _name;
	
	void printOwing(double amount){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		//caculate outstanding
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		printBanner();
		//print details
		
		printDetails(amount);
	}
	
	void printBanner(){
		System.out.println("**********************");
		System.out.println("****Customer Owes*****");
		System.out.println("**********************");
		
	}
	
	void printDetails(double amount){
		System.out.println("name:"+ _name);
		System.out.println("amount" + amount);
	}
}
