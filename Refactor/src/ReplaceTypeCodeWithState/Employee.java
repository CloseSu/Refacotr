package ReplaceTypeCodeWithState;

public class Employee {
	private EmployeeType _type;
	int _monthlySalary;
	int _commossion;
	int _bonus;

	public int getType() {
		return _type.getTpyeCode();
	}

	public void setType(int arg) {
		_type = EmployeeType.newType(arg);
	}
	int PayAmount(){
		switch(getType()){
			case EmployeeType.ENGINEER:
				return _monthlySalary;
			case EmployeeType.SALESMAN:
				return _monthlySalary + _commossion;
			case EmployeeType.MANAGER:
				return _monthlySalary +_bonus ;
			default:
				throw new RuntimeException("Incorrect Employee");
		}
	}
}
