package ejercicios;

public class HexadecimalNumber {

	private String hexadecimalValue;

	public HexadecimalNumber(String hexadecimalValue) throws IlegalFormatNumberHexadecimalException {
		if (!hexadecimalValue.toUpperCase().matches("^[A-F,\\d]+$"))
			throw new IlegalFormatNumberHexadecimalException("Incorrect format binary number");
		this.hexadecimalValue = hexadecimalValue;
	}

	public String getHexadecimalValue() {
		return hexadecimalValue;
	}

	public void setHexadecimalValue(String hexadecimalValue) throws IlegalFormatNumberHexadecimalException {
		if (!hexadecimalValue.toUpperCase().matches("^[A-F,\\d]+$"))
			throw new IlegalFormatNumberHexadecimalException("Incorrect format binary number");
		this.hexadecimalValue = hexadecimalValue;
	}

	@Override
	public String toString() {
		return "HexadecimalNumber [hexadecimalValue=" + hexadecimalValue + "]";
	}
	
	public static int convertHexadecimalToDecimal(String hexadecimalString) throws IlegalFormatNumberHexadecimalException {
		if (!hexadecimalString.toUpperCase().matches("^[A-F,\\d]+$"))
			throw new IlegalFormatNumberHexadecimalException("Incorrect format binary number");
		StringBuilder sBuilder = new StringBuilder(hexadecimalString);
		String hexadecimalStringReverse = sBuilder.reverse().toString();
//		int sum = 0;
//		for (int i = 0; i < hexadecimalStringReverse.length(); i++) {
//			char charValue = hexadecimalStringReverse.toUpperCase().charAt(i);
//			switch (charValue) {
//			case 'A':
//				sum += Math.pow(16, i) * 10;
//				break;
//			case 'B':
//				sum += Math.pow(16, i) * 11;
//				break;
//			case 'C':
//				sum += Math.pow(16, i) * 12;
//				break;
//			case 'D':
//				sum += Math.pow(16, i) * 13;
//				break;
//			case 'E':
//				sum += Math.pow(16, i) * 14;
//				break;
//			case 'F':
//				sum += Math.pow(16, i) * 15;
//				break;
//
//			default:
//				sum += Math.pow(16, i) * Character.getNumericValue(charValue);
//				break;
//			}
//		}
//		
//		return sum;
		return Integer.parseInt(hexadecimalStringReverse, 16);
	}
}
