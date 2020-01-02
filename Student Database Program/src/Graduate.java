
public class Graduate extends Student{
	String major = "";
	
	public Graduate(String nm, int ID, String m) {
		super(nm, ID);
		major = m;
	}
	
	public void setMajor(String m) {
		major = m;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String print() {
		String output = "Name: " + name + "\n" + "ID Number: " + studentID + "\n" + "Major: " + major + "\n";
		return output;
	}
	
	public boolean equals(String m) {
		if (major.equalsIgnoreCase(m))
			return true;
		else return false;
	}
}
