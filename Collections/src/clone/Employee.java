package clone;

public class Employee implements Cloneable {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(1, "mahesh", 35208.25);
		Employee e2 = (Employee) e1.clone();
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
	}
}
