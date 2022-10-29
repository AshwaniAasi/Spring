package standAlone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> name;
	private Map<String, Integer> feeStru;
	private Properties property;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}
	
	public Map<String, Integer> getFeeStru() {
		return feeStru;
	}

	public void setFeeStru(Map<String, Integer> feeStru) {
		this.feeStru = feeStru;
	}
	
	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", feeStru=" + feeStru + ", property=" + property + "]";
	}

	

	
	
	
	

}
