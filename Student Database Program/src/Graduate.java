
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
}
