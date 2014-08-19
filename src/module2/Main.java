package module2;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ParseException {
//		Task1.task_1();
//		Task2.task_2();
//		Task3.classDate();
//		Task3.classCalendar();
//		Task3.classFile();
		
		Person first = new Person("Nataliia", "Tumovska", "12.06.1995");
		Person second = new Person("Dmytriy", "Ivanov", "05.05.1990");
		Person third = new Person("Ivan", "Petrenko", "26.08.1983");
		Person fourth = new Person("Helena", "Musich", "17.06.1980");
		Person fifth = new Person("Vladimir", "Isaev", "11.02.1989");
		Person sixth = new Person("Anastasiia", "Smolcova", "23.11.1991");
		Person seventh = new Person("Irina", "Popovich", "15.03.1992");
		
		ArrayList<Person> array = new ArrayList<>();
		array.add(seventh);
		array.add(second);
		array.add(sixth);
		array.add(fifth);
		array.add(fourth);
		array.add(third);
		array.add(first);
		

		
		
		
	}
}
