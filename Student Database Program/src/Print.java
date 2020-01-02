
public class Print {
	
	String output = "";
	Person[] p = new Person[10];
	
	public Print(Person[] people) {
		output = "";
		p = people;
	}
	
	public String printStudents() {
		for(int i = 0; i < 10; i++) {
			if(p[i] instanceof Student)
				output += p[i].print();
		}
		
		return output;
	}
	
	public String printPersons() {
		for(int i = 0; i < 10; i++) {
			if(p[i] instanceof Person)
				output += p[i].print();
		}
		
		return output;
	}
	
	public String printUndergrads() {
		for(int i = 0; i < 10; i++) {
			if(p[i] instanceof Undergraduate)
				output += p[i].print();
		}
		
		return output;
	}
	
	public String printGrads() {
		for(int i = 0; i < 10; i++) {
			if(p[i] instanceof Graduate)
				output += p[i].print();
		}
		
		return output;
	}
}
