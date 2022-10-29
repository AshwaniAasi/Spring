package lifeCycle_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Service implements InitializingBean ,DisposableBean
{
	private long rate;

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Service [rate=" + rate + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("I am in init method");
		
	}

	public void destroy() throws Exception {
		System.out.println("I am in destroy method");
		
	}
	
	

}
