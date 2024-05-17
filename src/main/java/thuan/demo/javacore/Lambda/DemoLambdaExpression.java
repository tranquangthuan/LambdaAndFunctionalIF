package thuan.demo.javacore.Lambda;

import thuan.demo.javacore.Lambda.impl.IFTest1Impl;

public class DemoLambdaExpression {

	public static void main(String[] args) {
		// zero argument
		IFTest1 a = () -> System.out.println("abc");
		a.print();

		IFTest1 ifTestImpl1 = new IFTest1Impl();
		ifTestImpl1.print();

		IFTest1 a2 = () -> System.out.println("IFTest2 Impl");
		a2.print();

		// one argument
		IFTest2 b = (message) -> System.out.println(message);
		b.print("This is a message");

		// one argument
		IFTest2 c = message -> System.out.println("One Argument " + message);
		c.print("This is a message");

		// one argument with many statement in body
		IFTest2 d = message -> {
			System.out.println("Statement 1 " + message);
			System.out.println("Statement 2 " + message);
			System.out.println("Statement 3 " + message);
		};
		d.print("This is a message");
	}
}
