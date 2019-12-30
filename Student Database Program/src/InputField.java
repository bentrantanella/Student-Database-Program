import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class InputField extends GBDialog {
	
	Person[] data = new Person[10];
	int numofpeople = 0;
	
	public InputField(JFrame parent, Person[] database, int count) {
		super (parent);
		setTitle("New Book");
		setSize(250,250);
		
		idLabel.setVisible(false);
		idField.setVisible(false);
		gradeLabel.setVisible(false);
		gradeField.setVisible(false);
		majorLabel.setVisible(false);
		majorField.setVisible(false);
		
		addButton.setEnabled(false);
		
		this.data = database;
		this.numofpeople = count;
	}
	
	JButton personButton = addButton("Person",1,1,1,1);
	JButton studentButton = addButton("Student",1,2,1,1);
	JButton undergradButton = addButton("Undergraduate",1,3,1,1);
	JButton gradButton = addButton("Graduate",1,4,1,1);
	JButton addButton = addButton("Add",1,1,1,1);
	
	JLabel nameLabel = addLabel("Name:",2,1,1,1);
	JTextField nameField = addTextField("",2,2,1,1);
	JLabel idLabel = addLabel("Student ID number:",2,3,1,1);
	JTextField idField = addTextField("",2,4,1,1);
	JLabel gradeLabel = addLabel("Grade level:",3,1,1,1);
	JTextField gradeField = addTextField("",3,2,1,1);
	JLabel majorLabel = addLabel("Major:",3,3,1,1);
	JTextField majorField = addTextField("",3,4,1,1);
	
	char inputtype = 'p';
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == personButton) {
			inputtype = 'p';
		}
		
		if (buttonObj == studentButton) {
			idLabel.setVisible(true);
			idField.setVisible(true);
			gradeLabel.setVisible(false);
			gradeField.setVisible(false);
			majorLabel.setVisible(false);
			majorField.setVisible(false);
			
			inputtype = 's';
		}
		
		if (buttonObj == undergradButton) {
			idLabel.setVisible(true);
			idField.setVisible(true);
			gradeLabel.setVisible(true);
			gradeField.setVisible(true);
			majorLabel.setVisible(false);
			majorField.setVisible(false);
			
			inputtype = 'u';
		}
		
		if (buttonObj == gradButton) {
			idLabel.setVisible(true);
			idField.setVisible(true);
			gradeLabel.setVisible(false);
			gradeField.setVisible(false);
			majorLabel.setVisible(true);
			majorField.setVisible(true);
			
			inputtype = 'g';
		}
		
		if (buttonObj == addButton) {
			if (inputtype == 'p') {
				
			} else if (inputtype == 's') {
				
			} else if (inputtype == 'u') {
				
			} else if (inputtype == 'g') {
				
			}
		}
	}
	
}
