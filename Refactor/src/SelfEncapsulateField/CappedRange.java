package SelfEncapsulateField;

public class CappedRange extends IntRange{
	private int _cap;
	CappedRange(int low, int high, int cap){
		super(low,high);
		_cap = cap;
	}
	public int get_cap() {
		return _cap;
	}
	public void set_cap(int _cap) {
		this._cap = _cap;
	}
	int getCap(){
		return _cap;
	}
	int getHigh(){
		return Math.min(super.get_high(),getCap());
	}
}
