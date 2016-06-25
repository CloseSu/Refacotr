package ReplaceMagicNumberWithSymbolicConstant;

public class Number {
	static final double GRAVITATIONAL_CONSTANT = 9.81;
	double potienalEnergy(double mass, double height){
		return mass * GRAVITATIONAL_CONSTANT * height;
	}
}
