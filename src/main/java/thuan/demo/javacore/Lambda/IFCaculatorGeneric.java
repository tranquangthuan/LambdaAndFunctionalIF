package thuan.demo.javacore.Lambda;

@FunctionalInterface
public interface IFCaculatorGeneric<T extends Number> {
	T accept(T a, T b);
}
