package ejercicios;

import java.util.Scanner;

public class TestHexadecimalNumber {

	public static void main(String[] args) {
		System.out.println("Enter a hexadecimal number");
		Scanner sc = new Scanner(System.in);
		String hexadecimalNumber = sc.next();
		sc.close();
		try {
			HexadecimalNumber hNumber = new HexadecimalNumber(hexadecimalNumber);
			System.out.printf("number value: %s%n", hNumber.getHexadecimalValue());
			System.out.printf("Decimal value of %s is %d%n", hNumber.getHexadecimalValue(), 
					HexadecimalNumber.convertHexadecimalToDecimal(hNumber.getHexadecimalValue()));
		} catch (IlegalFormatNumberHexadecimalException e) {
//			e.printStackTrace();
			System.out.println("Bad Number");
		}
		

	}

}
