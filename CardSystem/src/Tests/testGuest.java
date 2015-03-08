package Tests;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import helperClasses.TimeHandler;
import Implementation.Guest;

public class testGuest {

	@Test
	public void boolean_CheckCardSuspended_default() {
		Guest guest = new Guest("micheal", "jensen", 3);
		assertFalse(guest.isSuspended());
	}
	
	@Test
	public void checkPinIsDefault(){
		Guest guest = new Guest("micheal", "jensen", 3);
		assertEquals(9999, guest.getPin());
	}
	
	@Test
	public void checkFalsePin_ShouldBeFalse(){
		Guest guest = new Guest("micheal", "jensen", 3);
		assertFalse(guest.checkPinCode(8999));
	}
	
	@Test
	public void checExpiredGuestCard(){
		TimeHandler handleTime = new TimeHandler();
		Calendar expire = new GregorianCalendar();
		expire.add(GregorianCalendar.DAY_OF_YEAR, 0);
		assertEquals(false, handleTime.guestValidTerm(expire));
	}
	
	@Test
	public void NewCardOk(){
		Guest guest = new Guest("micheal", "jensen", 3);
		assertTrue(guest.checkPinCode(9999));
	}
	
	@Test
	public void nameISCorrect(){
		Guest guest = new Guest("micheal", "jensen", 3);
		assertEquals("micheal jensen", guest.getFullName());
	}
}
