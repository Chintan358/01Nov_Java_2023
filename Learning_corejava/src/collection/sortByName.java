package collection;

import java.util.Comparator;

public class sortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		String s1 = o1.name;
		String s2 = o2.name;
		
		return -s1.compareTo(s2);
	}
	
}
