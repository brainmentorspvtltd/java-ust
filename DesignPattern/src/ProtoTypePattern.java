
class Person implements Cloneable {
	public int id;
	public String name;
	public String address;
	Person(int id , String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//this clone method is coming from the Object class
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString(){
		return " id " +id+ " Name "+name+" Address "+address;
	}
	
}
class Emp extends Person{
	double salary;
	Emp(int id , String name, String address, double salary){
		super(id ,name, address);
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+" Emp [salary=" + salary + "]";
	}
	
}
class Student extends Person{
	double fees;
     Student(int id , String name, String address, double fees){
		super(id ,name, address);
		this.fees = fees;
	}
	@Override
	public String toString() {
		
		return super.toString() + "Student [fees=" + fees + "]";
	}
     
}
public class ProtoTypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person person = new Person(1001,"Amit","Delhi");
		Person person2 = (Person)person.clone(); //Downcasting // Byte by Byte Copy of Object into a Different Object.
		System.out.println(person==person2);
		System.out.println(person); // Object print will call toString()
		System.out.println(person2);
		Student student = new Student(1001,"Ram","Mumbai",90000);
		System.out.println(student);
		Student student2 = (Student)student.clone();
		student2.id=1009;
		System.out.println(student2);
		Emp emp = new Emp(1002, "Shyam", "Pune", 100000);
		System.out.println(emp);
		Emp emp2 = (Emp)emp.clone();
		emp2.salary = 88888;
		System.out.println(emp2);
		
		
	}

}
