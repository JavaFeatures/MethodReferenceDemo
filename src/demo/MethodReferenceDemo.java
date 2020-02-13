package demo;

public class MethodReferenceDemo {
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		Calculator cal1 = (num1, num2) -> num1 + num2;
		int additionResult = cal1.calculate(4, 6);
		System.out.println("Result of addition: " + additionResult);
		Calculator cal2 = MethodReferenceDemo::multiply;
		int multiplicationResult = cal2.calculate(4, 6);
		System.out.println("Result of multiplication: " + multiplicationResult);
	}

}
