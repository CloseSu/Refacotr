package ExtractMethod;
import java.util.Enumeration;


public class Extract_Method3 {
	private Order _orders;
	private String _name;
	
	void printOwing(double previousAmout){
		printBanner();
		double outstanding = getOutstanding(previousAmout *1.2);
		printDetails(previousAmout);
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
	
	double getOutstanding(double initialValue){
		Enumeration e = _orders.elements();
		double result = initialValue;
		//caculate outstanding
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
}
