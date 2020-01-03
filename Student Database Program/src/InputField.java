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
				data[DatabaseGUI.counter] = new Person(nameField.getText());
				DatabaseGUI.counter++;
				System.out.println(DatabaseGUI.counter);
				messageBox("You have added a person named " + nameField.getText());
				
			} else if (inputtype == 's') {
				data[DatabaseGUI.counter] = new Student(nameField.getText(), idField.getNumber());
				DatabaseGUI.counter++;
				messageBox("You have added a student named " + nameField.getText());
				
			} else if (inputtype == 'u') {
				data[DatabaseGUI.counter] = new Undergraduate(nameField.getText(), idField.getNumber(), (String) gradeCombo.getSelectedItem());
				DatabaseGUI.counter++;
				messageBox("You have added an undergraduate named " + nameField.getText());
				
			} else if (inputtype == 'g') {
				data[DatabaseGUI.counter] = new Graduate(nameField.getText(), idField.getNumber(), majorField.getText());
				DatabaseGUI.counter++;
				messageBox("You have added a graduate named " + nameField.getText());

			}
			
		}
	}
	
}
