package module2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
	String firstName;
	String lastName;
	String dateOfBirth; // better to change type to Date
	
	
	
	public Person(String firstName, String lastName, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() throws ParseException{
		DateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
		Date birthDay = formatter.parse(dateOfBirth);
		Calendar dayOfBirth = Calendar.getInstance();
		dayOfBirth.setTime(birthDay);
		int age;
		GregorianCalendar today = new GregorianCalendar();
		// it's not a number of full years
		age = today.get(GregorianCalendar.YEAR) - dayOfBirth.get(GregorianCalendar.YEAR); 
		return age;
	}
	
	public String getFullName(){
		String fullName;// unnecessary local variable
		fullName = firstName + " " + lastName;
		return fullName; // return firstName + " " + lastName would be enough here
	}
}
