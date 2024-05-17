package thuan.demo.javacore.Lambda.comparator;

import java.util.Comparator;

import thuan.demo.javacore.Lambda.model.Student;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
