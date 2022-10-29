package primitive_ci;

public class Student 
{
	private String name;
	private int age;
	private Certi certi;
	
	public Student(String name, int age, Certi certi) {
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student Name : "+name+" Age : "+age+" Certificate Name ; "+certi;
	}
	
	
	
	
	
}
