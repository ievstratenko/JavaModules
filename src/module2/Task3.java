package module2;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Task3 {
	public static void classDate(){
		Date myDate = new Date();
		System.out.println("Today is: " + myDate);
		String todayStr = myDate.toString();
		System.out.println(todayStr);

		long milisec = myDate.getTime();
		System.out.println(milisec);
		
		Date today = myDate;
		
		System.out.println(myDate.after(today));
		
	}
	
	public static void classCalendar(){
		Calendar today = Calendar.getInstance();
		int numberWeekInThisYear = today.getWeeksInWeekYear();
		Calendar lastYear = Calendar.getInstance();
		lastYear.set(Calendar.YEAR, -1);
		int numberWeeksLastYear = lastYear.getWeeksInWeekYear();
		System.out.println("Number of weeks in 2014 year: " + numberWeekInThisYear + "\n" + 
						   "Number of weeks in 2013 year: " + numberWeeksLastYear);
		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("Today is " + dayOfWeek + " day of week.");
	}
	
	public static void classFile(){
		File file =  new File("src/module2/textFile.txt");
		boolean existing = file.exists();
		System.out.println("Existing of the file 'textFile' is: " + existing);
		long lastModified = file.lastModified();
		System.out.println("Last modified: " + lastModified);
		String absolutePath = file.getAbsolutePath();
		System.out.println("Absolute path of file: " + absolutePath);
		System.out.println("textFile is file: " + file.isFile() + "\n" + 
							"textFile is directory: " + file.isDirectory());
		;
	}
}
