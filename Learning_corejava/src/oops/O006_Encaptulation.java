package oops;

public class O006_Encaptulation {
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("abc");
		
		System.out.println(emp.getId()+" "+emp.getName());
	}
}
