package primitive_ci;

public class Student 
{
	private final String name;
	private final int age;
	private final Certi certi;
	
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
