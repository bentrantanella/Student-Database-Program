
public class Person {
	String name = "";
	
	public Person(String nm) {
		name = nm;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public String getName() {
		return name;
	}
	
	public String print() {
		String output = "Name: " + name + "\n";
		return output;
	}
}
