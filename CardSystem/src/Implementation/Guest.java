package Implementation;
import java.util.Calendar;
import java.util.GregorianCalendar;

import abstractClasses.Card;


public class Guest extends Card{
	Calendar expirationDate = new GregorianCalendar();
	
	public Guest(String firstName, String lastName, int CardNumber) {
		super(9999);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		expirationDate.add(GregorianCalendar.DAY_OF_YEAR, 7);
	}

	@Override
	public boolean checkPinCode(int pin) {
		if(super.isSuspended()==false){
			if(getValidTermGuest(expirationDate)){
				if(pin==9999){
					return true;
				}
			}else{
				super.setSuspended(true);
				return false;
			}
		}else{
			return false;
		}
		return false;
	}
	
	public String getFullName(){
		return getFirstName()+ " "+ getLastName();
	}
}