package thuan.demo.javacore.functional_interface;

public class DemoUsingFunctionalIF {

	public static void main(String[] args) {
		DemoFunctionalInterface a = () -> System.out.println("abc");
		a.method1();

		// Error compilor, not functional interface=> can't using lambda
//		DemoIFWith2Method b = () -> System.out.println("DemoIFWith2Method");
//		b.method1();

		IFCountString count1 = message -> message.length();
		System.out.println(count1.count("ABC"));

		IFBiFunction<String, Integer> count2 = t -> t.length();
		System.out.println(count2.apply("ABC"));

		IFBiFunction<Integer, String> count3 = t -> {
			if (t > 9 && t <= 10) {
				return "A";
			}
			if (t > 8 && t <= 9) {
				return "B";
			}
			return "C";
		};
		String diemChu = count3.apply(10);
		System.out.println(diemChu);
	}

}
