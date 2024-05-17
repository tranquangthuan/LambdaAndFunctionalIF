package thuan.demo.javacore.Lambda.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import thuan.demo.javacore.Lambda.comparator.StudentNameComparator;
import thuan.demo.javacore.Lambda.model.Student;

public class DemoLambdaWithList {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("SV03", "Binh", 20, "Da  Nang"));
		list.add(new Student("SV04", "Bac", 18, "Hue"));
		list.add(new Student("SV06", "Anh", 18, "Hue"));
		list.add(new Student("SV01", "Nam", 21, "Quang Nam"));
		list.add(new Student("SV02", "Binh", 22, "Quang Tri"));
		list.add(new Student("SV05", "Canh", 20, "Hue"));
		list.add(new Student("SV019", "Y", 19, "Da  Nang"));
		list.add(new Student("SV020", "Long", 19, "Da  Nang"));
		// sortWithComparator(list);

		// Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());
//		Collections.sort(list, (o1, o2) -> {
//			int ageCompare = o1.getAge() - o2.getAge();
//			if (ageCompare != 0) {
//				return ageCompare;
//			}
//			return o1.getName().compareTo(o2.getName());
//		});
		print(list);

		System.out.println("-----------------");
		// list.removeIf(st -> st.getAge() == 19);

		list.replaceAll(t -> new Student(t.getId(), t.getName() + " Upate", t.getAge(), t.getAddress()));

		print(list);
	}

	public static void sortWithComparator(List<Student> list) {
		Collections.sort(list, new StudentNameComparator());
	}

	public static void print(List<Student> list) {
		list.forEach(sv -> System.out.println(sv));
	}

}
