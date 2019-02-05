package ejercicios;

import java.util.Scanner;

public class TestBinaryNumber {

	public static void main(String[] args) {

		System.out.println("Enter a binary number");
		Scanner sc = new Scanner(System.in);
		String binaryNumber = sc.next();
		sc.close();
		try {
			BinaryNumber bNumber = new BinaryNumber(binaryNumber);
			System.out.printf("number value: %s%n", bNumber.getBinaryValue());
			bNumber.setBinaryValue("1000");
			System.out.printf("number value: %s%n", bNumber.getBinaryValue());
			System.out.printf("Decimal value of %s is %d%n", bNumber.getBinaryValue(), 
					BinaryNumber.convertBinaryToDecimal(bNumber.getBinaryValue()));
		} catch (IlegalFormatNumberBinaryException e) {
//			e.printStackTrace();
			System.out.println("Bad Number");
		}
		
		String anotherNumber = "1111";
		try {
			System.out.printf("Decimal value of %s is %d%n", anotherNumber, 
					BinaryNumber.convertBinaryToDecimal(anotherNumber));
		} catch (IlegalFormatNumberBinaryException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("That's all friends");
	}

}
