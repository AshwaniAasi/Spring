package autoWiring_byAutowired;

public class Address 
{
	private String state;
	private int Num;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", Num=" + Num + "]";
	}
}
