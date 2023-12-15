package mpack;
import mypack2.Employee;


public class AccessModifersEx extends Employee  {
	int a=1;
	public int b=2;
	private int c=3;
	protected int d=4;
	void display1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(eid3);
//		System.out.println(eid2);
		
	}
	

	
	public static void main(String[] args) {
		AccessModifersEx obj= new AccessModifersEx();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		obj.display1();
		
		Employee emp= new Employee();
//		System.out.println(emp.eid3);
	    emp.display();
		
		
		
		
		
		

	}

}
