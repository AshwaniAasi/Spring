package lifeCycle_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Service {
	
	private String total;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Service [total=" + total + "]";
	}
	@PostConstruct
	public void suruwat()
	{
		System.out.println("I am in init method");
	}
	@PreDestroy
	public void khatm()
	{
		System.out.println("I am in destroy method");
	}
	

}
