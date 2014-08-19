package module2;

public class Task1 {
	
	public static void task_1(){
		Byte byteVar1 = 33;
		byte byteVar2 = new Byte("33");
		System.out.println("Autboxing byte value: " + byteVar1 + "\n" + "Unboxing byte value: " + byteVar2);
		
		Short shortVar1 = 4567;
		short shortVar2 = new Short("4567");
		System.out.println("Autboxing short value: " + shortVar1 + "\n" + "Unboxing short value: " + shortVar2);
		
		Integer intVar1 = 6785466;
		int intVar2 = new Integer(6785466);
		System.out.println("Autboxing integer value: " + intVar1 + "\n" + "Unboxing integer value: " + intVar2);
		
		Double doubleVar1 = 577687375.56;
		double doubleVar2 = new Double(577687375.56);
		System.out.println("Autboxing double value: " + doubleVar1 + "\n" + "Unboxing double value: " + doubleVar2);
	} 
}
