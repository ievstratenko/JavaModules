package module2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task2 {
	public static void task_2(){
		BigInteger integerValue1 = new BigInteger("8688964799954256573205468303440304530587654");
		BigInteger integerValue2 = new BigInteger("3353689687763893546378537485345745875747437");
		
		System.out.println("Sum of two big integer variables: " + integerValue1.add(integerValue2));
		System.out.println("Comparing of two big integer variables: " + integerValue1.compareTo(integerValue2));
		System.out.println("Dividing of two big integer variables: " + integerValue1.divide(integerValue2));
		
		BigDecimal decimalValue1 = new BigDecimal("-678467865466788477684678.764864");
		BigDecimal decimalValue2 = new BigDecimal("3156454548681520674060.0003464");
		
		System.out.println("Hash code of first value: " + decimalValue1.hashCode());
		System.out.println("The sign of first value: " + decimalValue1.signum());
		System.out.println("Sum of two decomal values: " + decimalValue2.add(decimalValue1));
		System.out.println("Equaling of two decimal values is " + decimalValue2.equals(decimalValue1));
		

	}
}
