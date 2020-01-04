
public class Student extends Person{
	
	int studentID = 0;
	
	public Student(String nm, int ID) {
		super(nm);
		studentID = ID;
	}
	
	public void setID(int ID) {
		studentID = ID;
	}
	
	public int getID() {
		return studentID;
	}
	
	public String print() {
		String output = "Name: " + name + "\n" + "ID Number: " + studentID + "\n" + "\n";
		return output;
	}
}
