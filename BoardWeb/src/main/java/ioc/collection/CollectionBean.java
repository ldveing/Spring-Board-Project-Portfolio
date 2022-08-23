package ioc.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// 컬렉션을 Setter Injection하는 방법
public class CollectionBean {

	// 1. List
	private List<String> list;
	// 1. setter, getter
	public void setList(List<String> list) {
		this.list = list;
	}
	public List<String> getList() {
		return list;
	}
	

	// 2. Set
	private Set<String> set;
	// 2. setter, getter
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Set<String> getSet() {
		return set;
	}
	
	
	// 3. Map
	private Map<String, Integer> map;
	// 3. setter, getter
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	

	// 4. Properties
	private Properties prop;
	// 4. setter, getter
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Properties getProp() {
		return prop;
	}
}
