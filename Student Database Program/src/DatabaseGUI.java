import javax.swing.*;
import BreezySwing.*;

public class DatabaseGUI extends GBFrame {
	
	public static void main(String[] args) {
		JFrame frm = new DatabaseGUI();
		frm.setTitle("Ben's Library");
		frm.setSize(300, 300);
		frm.setVisible(true);
	}
	
	JButton newPersonButton = addButton("New person",1,1,1,1);
	JButton printAllButton = addButton("Print all people",2,1,1,1);
	JButton printStudentsButton = addButton("Print all students",3,1,1,1);
	JButton printUndergradsButton = addButton("Print all undergraduates",4,1,1,1);
	JButton printGradsButton = addButton("Print all graduate students",5,1,1,1);
	
	Person[] people = new Person[10];
	int counter = 0;
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == newPersonButton) {
			InputField newperson = new InputField(this, people, counter);
		}
		
		if (buttonObj == printAllButton) {
			
		}
		
		if (buttonObj == printStudentsButton) {
			
		}
		
		if(buttonObj == printUndergradsButton) {
			
		}
		
		if(buttonObj == printGradsButton) {
			
		}
	}
}
