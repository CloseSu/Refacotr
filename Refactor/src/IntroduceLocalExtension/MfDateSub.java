package IntroduceLocalExtension;

import java.util.Date;

public class MfDateSub extends Date{
	public MfDateSub (String dateString){
		super (dateString);
	}
	public MfDateSub (Date arg){
		super (arg.getTime());
	}
	Date nextDay(){
		return new Date(getYear(),getMonth(),getDate()+1);
	}
	
}
