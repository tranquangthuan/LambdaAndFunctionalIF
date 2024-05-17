package thuan.demo.javacore.functional_interface;

@FunctionalInterface
public interface Greeting {

	public abstract void greeting(String name);

	default void hello(String name) {
		System.out.println("Hello " + name);
	}
}
