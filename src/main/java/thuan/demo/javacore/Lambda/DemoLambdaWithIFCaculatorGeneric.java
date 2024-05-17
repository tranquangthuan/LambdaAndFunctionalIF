package thuan.demo.javacore.Lambda;

public class DemoLambdaWithIFCaculatorGeneric {

	public static void main(String[] args) {
		IFCaculatorGeneric<Double> caDouble1 = (num1, num2) -> num1 + num2;
		System.out.println(caDouble1.accept(1d, 1d));

		IFCaculatorGeneric<Integer> caInteger2 = (num1, num2) -> 2 * (num1 + num2);
		System.out.println(caInteger2.accept(5, 10));

		// IFCaculatorGeneric<String> caInteger3 = (num1, num2) -> num1 + num2;
	}

}
