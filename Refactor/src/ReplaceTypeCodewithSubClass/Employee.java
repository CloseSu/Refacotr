package ReplaceTypeCodewithSubClass;

public class Employee {
	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	private Employee(int type){
		_type = type;
	}

	static Employee create(int type){
		switch(type){
		case ENGINEER:
			return new Engineer();
		}
		return null;
	}
	public int get_type() {
		return _type;
	}

	public void set_type(int _type) {
		this._type = _type;
	}
	
}
