import javax.swing.*;
import BreezySwing.*;

public class DatabaseGUI extends GBFrame {
	
	public static void main(String[] args) {
		JFrame frm = new DatabaseGUI();
		frm.setTitle("Ben's Library");
		frm.setSize(300, 300);
		frm.setVisible(true);
	}
	
	JButton newPersonButton = addButton("New Person",1,1,1,1);
	JButton printPeopleButton = addButton("Print All People",2,1,1,1);
	JButton printStudentsButton = addButton("Print All Students",3,1,1,1);
	JButton printUndergradsButton = addButton("Print All Undergraduates",4,1,1,1);
	JButton printGradsButton = addButton("Print All Graduates",5,1,1,1);
	JButton compareButton = addButton("Compare undergrad/grad",6,1,1,1);
	
	Person[] people = new Person[10];
	protected static Integer counter = 0;
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == newPersonButton) {
			InputField newperson = new InputField(this, people);
			newperson.setVisible(true);
			
			if (counter == 10)
				newPersonButton.setEnabled(false);
		}
		
		if (buttonObj == printPeopleButton) {
			Print p = new Print(people);
			
			messageBox(p.printPersons());
		}
		
		if (buttonObj == printStudentsButton) {
			Print p = new Print(people);
			
			messageBox(p.printStudents()); 
		}
		
		if(buttonObj == printUndergradsButton) {
			Print p = new Print(people);
			
			messageBox(p.printUndergrads());
		}
		
		if(buttonObj == printGradsButton) {
			Print p = new Print(people);
			
			messageBox(p.printGrads());
		}
		
		if(buttonObj == compareButton) {
			Compare c = new Compare(this,people);
			c.setVisible(true);
		}
	}
}
