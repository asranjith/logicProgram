package stringpro;

public class Employee {
 int roll;
 String name;
public Employee(int roll, String name) {
	this.roll = roll;
	this.name = name;
}
public boolean equals(Employee ob) {
//	if(this.name==ob.name && this.roll.equals(ob.roll)) {
//	
//		
//	}
	if(this.name.equals(ob.name)&& this.roll==ob.roll)
	{
		return true;
	}
	else
		return false;
}
public static void main(String[] args) {
	Employee e1=new Employee(21,"asr");
	Employee e2=new Employee(21,"asr");
	System.out.println(e1.equals(e2));
}

}

