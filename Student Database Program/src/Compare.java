import javax.swing.*;
import BreezySwing.*;

public class Compare extends GBDialog {

	Person[] data = new Person[10];
	
	public Compare(JFrame parent, Person[] database) {
		super (parent);
		setTitle("New Book");
		setSize(500,500);
		
		this.data = database;
		
		gradeCombo.addItem("Freshman");
		gradeCombo.addItem("Sophomore");
		gradeCombo.addItem("Junior");
		gradeCombo.addItem("Senior");
		
		majorField.setEditable(false);
	}
	
	JButton undergradButton = addButton("Undergraduate",1,1,1,1);
	JButton gradButton = addButton("Graduate",1,2,1,1);
	JLabel nameLabel = addLabel("Name",2,1,1,1);
	JTextField nameField = addTextField("",2,2,1,1);
	JLabel majorLabel = addLabel("Major:",3,1,1,1);
	JTextField majorField = addTextField("",3,2,1,1);
	JLabel gradeLabel = addLabel("Grade:",4,1,1,1);
	JComboBox gradeCombo = addComboBox(4,2,1,1);
	JButton compareButton = addButton("Compare",5,1,1,1);
	
	char type = 'u';
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == undergradButton) {
			gradeCombo.setEditable(true);
			majorField.setEditable(false);
			
			type = 'u';
		}
		
		if (buttonObj == gradButton) {
			gradeCombo.setEditable(false);
			majorField.setEditable(true);
			
			type = 'g';
		}
		
		if (buttonObj == compareButton) {
			
			if (type == 'u') {
				String output = "Undergraduates with the same grade: " + "\n";
				String grade = (String) gradeCombo.getSelectedItem();
				
				for(Person p : data) {
					if(p instanceof Undergraduate) {
						if (p.equals(grade)) {
							output += p.print();
						}
					}
				}
				if (output.contentEquals("Undergraduates with the same grade: " + "\n"))
					output = "There are no undergraduates with the same grade";
				messageBox(output);
			}
			
			if (type == 'g') {
				String output = "Graduates with the same major: " + "\n";
				String major = majorField.getText();
				
				for (Person p : data) {
					if(p instanceof Graduate) {
						if (p.equals(major)) {
							output += p.print();
						}
					}
				}
				if (output.contentEquals("Graduates with the same major: " + "\n"))
					output = "There are no graduates with the same major";
				messageBox(output);
			}
		}
	}

}
