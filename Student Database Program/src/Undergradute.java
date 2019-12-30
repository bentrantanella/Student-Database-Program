
public class Undergraduate extends Student{
	char gradeLevel = 'f';
	
	public Undergraduate(String nm, int ID, char grade) {
		super(nm, ID);
		gradeLevel = grade;
	}
}
