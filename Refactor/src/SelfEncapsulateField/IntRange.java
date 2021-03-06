package SelfEncapsulateField;

public class IntRange {
	private int _low,_high;
	
	IntRange(int low,int high){
		initialize(low,high);
	}
	
	boolean includes(int arg){
		return arg >= _low && arg <= _high;
	}
	void grow(int factor){
		_high = _high * factor;
	}
	
	private void initialize(int low,int high){
		_low = low;
		_high = high;
	}
	public int get_low() {
		return _low;
	}

	public void set_low(int _low) {
		this._low = _low;
	}

	public int get_high() {
		return _high;
	}

	public void set_high(int _high) {
		this._high = _high;
	}
	
}
