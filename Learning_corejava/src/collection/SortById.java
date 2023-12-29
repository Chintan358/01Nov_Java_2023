package collection;

import java.util.Comparator;

public class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		
		int a = o2.id; //10 
		int b = o1.id; //11
		
		int i=0;
		if(b>a)
		{
			i = -1;
		}
		else if(b<a)
		{
			i = 1;
		}
		else
		{
			i=0;
		}
		
		return i;
	}

}
