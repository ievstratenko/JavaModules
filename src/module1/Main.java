package module1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		firstTask();
		secondTask();
		thirdTask();
		fourthTask();
		fifthTask_a();
		fifthTask_b();
		fifthTask_c();
		fifthTask_d();
		fifthTask_e();
		fifthTask_f();
		fifthTask_j();
		fifthTask_k();
		fifthTask_l();
		fifthTask_m();
		fifthTask_n();
		fifthTask_o();
		fifthTask_p();
		fifthTask_q();
		fifthTask_r();
		fifthTask_h();		
		Task_6a();
		Task_6b();
		Task_7();
		Task_8();
		Task_9();
		Task_10();
		Task_11();
		Task_12();
		Task_13a();
		Task_13b();
		Task_13d();
		Task_13c();
		Task_14a();
		Task_14b();
		Task_14c();
		Task_15();
	}
	
	public static void firstTask(){
		int integerNumber = 2147483647;

		double doubleNumber = 54738765399.5685F;
		long longNumber = 9254758056784685L;

		
		float floatVar = integerNumber; // widening int to float
		System.out.println(floatVar);
		int intVar = (int)longNumber;
		System.out.println(intVar);
		long longVar = (long)doubleNumber;
		System.out.println(longVar);
	}
	
	public static void secondTask(){
		final int integerNumber = 2147483647;
		
		final long longNumber = 9254758056784685L;
		
		
		float floatVar = integerNumber; // widening int to float
		System.out.println(floatVar);
		int intVar = (int)longNumber;
		System.out.println(intVar);
	}
	
	public static void thirdTask(){
		int integerNumber = 214747;
		float floatingNumber = 3625.35f;
		double doubleNumber = 54738765399.5685F;
		long longNumber = 9254758056784685L;
		byte byteNumber = 101;
		short shortNumber = 32;
		boolean boolVar = true;	
		
		long a = longNumber + (long)doubleNumber;
		long b = (long)integerNumber * shortNumber;
		int c = byteNumber + 5;
		float d = floatingNumber / 2;
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(shortNumber + ++shortNumber);
		System.out.println(shortNumber + --shortNumber);
		System.out.println(shortNumber > 0);
		System.out.println(boolVar == true);
		
	}
	
	public static void fourthTask(){
		short a = 45;
		short b = 56;
		
		double sum = Math.PI + Math.E;
		double power = Math.pow(a, 3);
		int maxVal = Math.max(a, b);
		
		System.out.println(sum);
		System.out.println(power);
		System.out.println(maxVal);
	}
	
	public static void fifthTask_a(){
		String a = "Anastasiia";
		String b = "Ostapova";
		String c = " ";
		String resultStringA = a.concat(c.concat(b));
		System.out.println(resultStringA);
		String resultStringB = a + c + b;
		System.out.println(resultStringB);
		String resultStringC = new StringBuilder().append(a).append(c).append(b).toString();
		System.out.println(resultStringC);
	}
	
	public static void fifthTask_b(){
		String a = "Anastasiia";
		char symbol = a.charAt(3);
		System.out.println(symbol);	
	}

	public static void fifthTask_c(){
		String a = "Anastasiia";
		String b = "Ostapova";
		System.out.println(a.compareTo(b));
	}

	public static void fifthTask_d(){
		String a = "Anastasiia";
		String b = "ast";
		String c = "Ostapova";
		System.out.println(a.contains(b));
		System.out.println(a.contains(c));
	}

	public static void fifthTask_e(){
		String a = "Anastasiia";
		String begin = "Ana";
		String end = "iia";
		String c = "a";
		System.out.println(a.startsWith(begin)); // true
		System.out.println(a.startsWith(c)); // false
		System.out.println(a.endsWith(end)); // true
	}
	
	public static void fifthTask_f(){
		String a = "Anastasiia";
		String b = "Ostapova";
		String c = "Anastasiia";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
	
	public static void fifthTask_g(){
		
	}
	
	public static void fifthTask_h(){
		String a = "Anastasiia";
		String b = "";
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
	}
	
	public static void fifthTask_i(){
		String a = "Anastasiia";
		System.out.println(a.length());
	}
	
	public static void fifthTask_j(){
		String a = "Anastasiia";
		String b = "11467";
		System.out.println(a.matches("[0-9](.*)"));
		System.out.println(b.matches("[0-9](.*)"));
	}
	
	public static void fifthTask_k(){
		String a = "Anastasiia, goodbye";
		String b = "hello";
		System.out.println(a.replace("goodbye", b));
		
	}
	
	public static void fifthTask_l(){
		String string = "This is a good day";	
		String [] resultString = string.split(" ");
		for (String result : resultString){
			System.out.println(result);
		}
	}
	
	public static void fifthTask_m(){
		String string = "This is a good day";
		System.out.println(string.substring(5)); // result must be "is a good day"
		System.out.println(string.substring(10, 18)); // result must be "good day"
	}
	
	public static void fifthTask_n(){
		String string = "This is a good day";
		char [] charArray = string.toCharArray();
		for (char character : charArray){
			System.out.println(character); 
		}
	}
	
	public static void fifthTask_o(){
		String lowerCaseString = "upper case srting";
		String upperCaseString = "LOWER CASE STRING";
		System.out.println(lowerCaseString.toUpperCase());
		System.out.println(upperCaseString.toLowerCase());
	}
	
	public static void fifthTask_p(){
		String string = "        This is a good day     ";
		System.out.println(string.trim());
	}
	
	public static void fifthTask_q(){
		String firstName;
		String lastName;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		firstName = scan.next();
		System.out.print("Enter your last name: ");
		lastName = scan.next();
		System.out.printf("Hello, %s, your last name is %s", firstName, lastName);
	}
	
	public static void fifthTask_r(){
		int integerVar = 765443;
		float floatVar = 355.233f;
		double doubleVar = 9841565.61;
		boolean boolVar = true;
		
		String integerVarToString = Integer.toString(integerVar);
		String floatVarToString = Float.toString(floatVar);
		String doubleVarToString = Double.toString(doubleVar);
		String boolVarToString = Boolean.toString(boolVar);
		System.out.println(integerVarToString + " " + floatVarToString + " " + doubleVarToString + " " + boolVarToString);
		
	}
	
	public static void Task_6a(){
		String firstName;
		String lastName;
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		firstName = scan.nextLine();
		System.out.print("Enter your last name: ");
		lastName = scan.nextLine();
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		System.out.println(firstName + " " + lastName + " " + age);
	}
	
	public static void Task_6b(){
		String firstName;
		char upperCase;
		String resultString;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		firstName = scan.nextLine();
		upperCase = firstName.substring(0, 1).toUpperCase().charAt(0);
		resultString = upperCase + firstName.substring(1);
		System.out.println("Before: " + firstName + "\n" + "After: " + resultString);
	}
	
	public static void Task_7() throws FileNotFoundException{
		String firstName;
		String lastName;
		int age;
		Scanner scan = new Scanner (new File("src/module1/inputFile.txt"));
		firstName = scan.nextLine();
		lastName = scan.nextLine();
		age = scan.nextInt();
		scan.close();
		System.out.println(firstName + " " + lastName + " " + age);
		
		PrintWriter writer = new PrintWriter("src/module1/outputFile.txt");
		writer.println(firstName);
		writer.println(lastName);
		writer.println(age);
		writer.close();
	}
	
	public static void Task_8(){
		int a;
		int b;
		String str1;
		String str2;		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number a: ");
		a = scan.nextInt();
		System.out.print("Enter number b: ");
		b = scan.nextInt();
		if (a > b){
			System.out.println("a greater than b");
		}
		else {
			System.out.println("b greater than a");
		}
		
		System.out.println("Enter string a: ");
		str1 = scan.next();
		System.out.println("Enter string b: ");
		str2 = scan.next();
		if (str1.length() > str2.length()){
			System.out.println("String a greater than string b");
		}
		else {
			System.out.println("String b greater than string a");
		}
		
		
		scan.close();
	}
	
	public static void Task_9(){
		int a;
		int b;
		String str1;
		String str2;		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number a: ");
		a = scan.nextInt();
		System.out.print("Enter number b: ");
		b = scan.nextInt();
		String resultStringInt = (a > b) ? "a greater than b" : "b greater than a";
		System.out.println(resultStringInt);
		
		System.out.println("Enter string a: ");
		str1 = scan.next();
		System.out.println("Enter string b: ");
		str2 = scan.next();
		
		String resultString = (str1.length() > str2.length()) ? "String a greater than string b" : "String b greater than string a";
		System.out.println(resultString);
		scan.close();
	}
	
	public static void Task_10(){
		int switchNumber;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of a month: ");
		switchNumber = scan.nextInt();
		switch (switchNumber){
			case 12:
			case 1:
			case 2: System.out.println("This is winter");
					break;
			case 3:
			case 4:
			case 5: System.out.println("This is spring");
					break;
			case 6:
			case 7:
			case 8: System.out.println("This is summer");
					break;
			case 9:
			case 10:
			case 11: System.out.println("This is autumn");
					 break;
			default: System.out.println("This is not a season");
			 		 break;
		}
		scan.close();
	}
	
	public static void Task_11(){
		for (int i = 0; i < 101; i++){
			System.out.println(i);
		}
		
		int j = 0;
		do{
			System.out.println(j++);
		}
		while (j < 101);
		
		int k = 0;
		while (k < 101){
			System.out.println(k++);
		}
	}
	
	public static void Task_12(){
		int sum = 0;
		for (int i = 101; i < 500; i += 2){
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	public static void Task_13a(){
		String [] array = {"one", "two", "three", "four", "five", "six", "seven"};
		for (String item : array){
			System.out.println(item);
		}	
	}
	
	public static void Task_13b(){
		String [] array = {"one", "two", "three", "four", "five", "six", "seven"};
		Arrays.sort(array);
		for (String item : array){
			System.out.println(item);
		}
	}
	
	public static void Task_13c(){
		String [] array = {"one", "two", "three", "four", "five", "six", "seven"};
		String temp;
		for (int i = 0; i < array.length; i++){
			for (int j = i + 1; j < array.length; j++){
				if (array[j].compareTo(array[i]) < 0){
					temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
		
	}
	
	public static void Task_13d(){
		String [] array = {"one", "two", "three", "four", "five", "six", "seven"};
		String resultString = "";
		for (String item : array){
			resultString = resultString + item + " ";			
		}
		System.out.println(resultString);
	}
	
	public static void Task_14a(){
		double [][] array = {{534.326, 746.07, 25446.12}, {9456.12, 6848.151, 8465}, {14161.21, 9815.5, 74161.2}};
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j] + " ");			
			}
			System.out.println();
		}
	}
	
	public static void Task_14b(){
		double [][] array = {{534.326, 746.07, 25446.12}, {9456.12, 6848.151, 8465}, {14161.21, 9815.5, 74161.2}};
		double sum = 0;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				sum = sum + array[i][j];			
			}			
		}
		System.out.println(sum); // sum = 149633.697
	}
	
	public static void Task_14c(){
		double [][] array = {{534.326, 1}, {9456.12, 6848.151, 8465}, {14161.21, 9815.5}};		
		for (int i = 0; i < array.length; i++){
			for (int j = i + 1; j < array[i].length; j++){
				if (array[i].length > array[j].length){
					double [] temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}					
			}				
		}
		int flag = 0;
		for (int i = 0; i < array.length; i++){		
			for (int j = i + 1; j < array[i].length; j++){
				if (array[i].length > array[j].length){
					flag = 1;
					continue;
				}	
				else {
					System.out.println("This array is not ragged");
					break;
				}
			}
		}		
		if (flag == 1)
			System.out.println("This array is ragged");
	}
		
	public static void Task_15(){
		int [][] matrix = new int [4][4];
		System.out.println("Matrix before transposing:");
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = (int)((Math.random() * (100)));
				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++){
			for (int j = i+1; j < matrix[i].length; j++){				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;;				
			}			
		}
		System.out.println("Matrix after transposing:");
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
