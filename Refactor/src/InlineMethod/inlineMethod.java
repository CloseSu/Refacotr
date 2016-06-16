package InlineMethod;

public class inlineMethod {
	private int _numberOfLateDeliveries;
	int rating(){
		return  _numberOfLateDeliveries > 5 ? 2:1;
	}
}
