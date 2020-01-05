import javax.swing.*;
import BreezySwing.*;

public class Compare extends GBDialog {

	Person[] data = new Person[10];
	Undergraduate[] undergrads = new Undergraduate[10];
	Graduate[] grads = new Graduate[10];
	int gcount = 0;
	int ucount = 0;
	
	public Compare(JFrame parent, Person[] database) {
		super (parent);
		setTitle("New Book");
		setSize(500,500);
		
		this.data = database;
		
		gradeCombo.addItem("Freshman");
		gradeCombo.addItem("Sophomore");
		gradeCombo.addItem("Junior");
		gradeCombo.addItem("Senior");
		
		majorField.setVisible(false);
		
		for(Person p : data) {
			if (p instanceof Undergraduate) {
				undergrads[ucount] = (Undergraduate) p;
				ucount++;
			} else if (p instanceof Graduate) {
				grads[gcount] = (Graduate) p;
				gcount++;
			}
		}
		
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
			gradeCombo.setVisible(true);
			majorField.setVisible(false);
			
			type = 'u';
		}
		
		if (buttonObj == gradButton) {
			gradeCombo.setVisible(false);
			majorField.setVisible(true);
			
			type = 'g';
			
			majorField.setText("");
		}
		
		if (buttonObj == compareButton) {
			
			if (type == 'u') {
				String output = "Undergraduates with the same grade: " + "\n";
				String grade = (String) gradeCombo.getSelectedItem();
				
				for(Undergraduate u : undergrads) {
					if(u instanceof Undergraduate) {
						if (u.Equals(grade)) {
							output += u.print();
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
				
				for (Graduate g : grads) {
					if(g instanceof Graduate) {
						if (g.Equals(major)) {
							output += g.print();
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
