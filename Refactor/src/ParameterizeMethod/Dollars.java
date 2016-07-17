package ParameterizeMethod;

public class Dollars {
	public Dollars(double result) {
		// TODO Auto-generated constructor stub
	}

	Dollars baseCharge(){
		double result = usageIntRange(0,100) * 0.03;
		if(lastUsage() > 100){
			result += usageIntRange(100,200)  * 0.05;
		}
		if(lastUsage() > 200){
			result += usageIntRange(200,Integer.MAX_VALUE) * 0.07;
		}
		return new Dollars (result);
	}

	private int lastUsage() {
		// TODO Auto-generated method stub
		return 0;
	}
	int usageIntRange(int start,int end){
		if(lastUsage() > start)
			return Math.min(lastUsage(),end) -start;
		else return 0;
	}
}
