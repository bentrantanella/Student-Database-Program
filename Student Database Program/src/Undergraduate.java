
public class Undergraduate extends Student{
	
	String gradeLevel = "";
	
	public Undergraduate(String nm, int ID, String grade) {
		super(nm, ID);
		gradeLevel = grade;
	}
	
	public void setGradeLevel(String grade) {
		gradeLevel = grade;
	}
	
	public String getGradeLevel() {
		return gradeLevel;
	}
	
	public String print() {
		String output = "Name: " + name + "\n" + "ID Number: " + studentID + "\n" + "Grade Level: " + gradeLevel + "\n" + "\n";
		return output;
	}
	
	public boolean Equals(String grade) {
		if (gradeLevel.equalsIgnoreCase(grade))
			return true;
		else return false;
	}
	
}
