import javax.swing.*;
import BreezySwing.*;

public class InputField extends GBDialog {
	
	Person[] data = new Person[10];
	
	
	public InputField(JFrame parent, Person[] database) {
		super (parent);
		setTitle("New Book");
		setSize(500,500);
		
		idLabel.setVisible(false);
		idField.setVisible(false);
		gradeLabel.setVisible(false);
		gradeCombo.setVisible(false);
		majorLabel.setVisible(false);
		majorField.setVisible(false);
		
		
		gradeCombo.addItem("Freshman");
		gradeCombo.addItem("Sophomore");
		gradeCombo.addItem("Junior");
		gradeCombo.addItem("Senior");
		
		
		this.data = database;
	
	}
	
	JButton personButton = addButton("Person",1,1,1,1);
	JButton studentButton = addButton("Student",1,2,1,1);
	JButton undergradButton = addButton("Undergraduate",1,3,1,1);
	JButton gradButton = addButton("Graduate",1,4,1,1);
	JButton addButton = addButton("Add",4,1,1,1);
	
	
	JLabel nameLabel = addLabel("Name:",2,1,1,1);
	JTextField nameField = addTextField("",2,2,1,1);
	JLabel idLabel = addLabel("Student ID number:",2,3,1,1);
	IntegerField idField = addIntegerField(0,2,4,1,1);
	JLabel gradeLabel = addLabel("Grade level:",3,1,1,1);
	JComboBox gradeCombo = addComboBox(3,2,1,1);
	JLabel majorLabel = addLabel("Major:",3,3,1,1);
	JTextField majorField = addTextField("",3,4,1,1);
	
	
	
	char inputtype = 'p';
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == personButton) {
			inputtype = 'p';
			
			idLabel.setVisible(false);
			idField.setVisible(false);
			gradeLabel.setVisible(false);
			gradeCombo.setVisible(false);
			majorLabel.setVisible(false);
			majorField.setVisible(false);
			
			nameField.setText("");
			
			
		}
		
		if (buttonObj == studentButton) {
			idLabel.setVisible(true);
			idField.setVisible(true);
			gradeLabel.setVisible(false);
			gradeCombo.setVisible(false);
			majorLabel.setVisible(false);
			majorField.setVisible(false);
			
			inputtype = 's';
			
			nameField.setText("");
			idField.setNumber(0);
		}
		
		if (buttonObj == undergradButton) {
			idLabel.setVisible(true);
			idField.setVisible(true);
			gradeLabel.setVisible(true);
			gradeCombo.setVisible(true);
			majorLabel.setVisible(false);
			majorField.setVisible(false);
			
			inputtype = 'u';
			
			nameField.setText("");
			idField.setNumber(0);
			
		}
		
		if (buttonObj == gradButton) {
			idLabel.setVisible(true);
			idField.setVisible(true);
			gradeLabel.setVisible(false);
			gradeCombo.setVisible(false);
			majorLabel.setVisible(true);
			majorField.setVisible(true);
			
			inputtype = 'g';
			
			nameField.setText("");
			idField.setNumber(0);
			majorField.setText("");
		}
		
		if (buttonObj == addButton) {
			if (inputtype == 'p') {
				String name = nameField.getText();
				
				if (name.isEmpty() || isWhitespace(name)) {
					messageBox("Please enter a name");
					return;
				}
				
				data[DatabaseGUI.counter] = new Person(name);
				DatabaseGUI.counter++;
				messageBox("You have added a person named " + nameField.getText());
				
			} else if (inputtype == 's') {
				String name = nameField.getText();
				
				
				if (name.isEmpty() || isWhitespace(name)) {
					messageBox("Please enter a name");
					return;
				}
				
				if (!idField.isValidNumber()) {
					messageBox("Invalid id number");
					return;
				}
				
				int id = idField.getNumber();
				
				data[DatabaseGUI.counter] = new Student(name, id);
				DatabaseGUI.counter++;
				messageBox("You have added a student named " + nameField.getText());
				
			} else if (inputtype == 'u') {
				String name = nameField.getText();
				String grade = (String) gradeCombo.getSelectedItem();
				
				if (name.isEmpty() || isWhitespace(name)) {
					messageBox("Please enter a name");
					return;
				}
				
				if (!idField.isValidNumber()) {
					messageBox("Invalid id number");
					return;
				}
				
				int id = idField.getNumber();
				
				data[DatabaseGUI.counter] = new Undergraduate(name, id, grade);
				DatabaseGUI.counter++;
				messageBox("You have added an undergraduate named " + nameField.getText());
				
			} else if (inputtype == 'g') {
				String name = nameField.getText();
				String major = majorField.getText();
				
				if (name.isEmpty() || isWhitespace(name)) {
					messageBox("Please enter a name");
					return;
				}
				
				if (major.isEmpty() || isWhitespace(major)) {
					messageBox("Please enter a major");
					return;
				}
				
				if (!idField.isValidNumber()) {
					messageBox("Invalid id number");
					return;
				}
				
				int id = idField.getNumber();
				
				data[DatabaseGUI.counter] = new Graduate(name, id, major);
				DatabaseGUI.counter++;
				messageBox("You have added a graduate named " + nameField.getText());

			}
			
			if (DatabaseGUI.counter == 10) {
				messageBox("Max number of people reached: 10");
				dispose();
			}
			
		}
	}
	
	public boolean isWhitespace(String s) {
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				return false;
		}
		return true;
	}
	
}
