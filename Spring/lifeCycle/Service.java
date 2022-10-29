package lifeCycle;

public class Service 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Service [name=" + name + "]";
	}
	
	public void suruwat()
	{
		System.out.println("i am in init method....");
	}
	
	public void barbad()
	{
		System.out.println("I am in destroy method....");
	}
}
