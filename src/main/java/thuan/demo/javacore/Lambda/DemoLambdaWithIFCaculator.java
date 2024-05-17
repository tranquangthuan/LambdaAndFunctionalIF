package thuan.demo.javacore.Lambda;

public class DemoLambdaWithIFCaculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IFCaculator ca1 = (int num1, int num2) -> num1 + num2;
		IFCaculator ca1 = (num1, num2) -> num1 + num2;
		int ca1Result = ca1.accept(1, 2);
		System.out.println(ca1Result);

		int ca1Result2 = ca1.accept(10, 20);
		System.out.println(ca1Result2);

		IFCaculator ca2 = (num1, num2) -> num1 * num1 + num2 * num2;
		int ca2Result2 = ca2.accept(1, 2);
		System.out.println(ca2Result2);

		// Demo Lambda with return statement
		IFCaculator ca3 = (num1, num2) -> {
			return num1 + num2;
		};
		System.out.println(ca3.accept(1, 2));

		// Demo Lambda with many statement and return statement
		IFCaculator ca4 = (num1, num2) -> {
			if (num1 <= 0) {
				num1 = 0;
			}
			if (num2 <= 0) {
				num2 = 0;
			}
			return num1 + num2;
		};
		System.out.println(ca4.accept(10, -2));
	}

}
