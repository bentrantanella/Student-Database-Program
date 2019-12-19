import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class InputField extends GBDialog {
	
	public InputField(JFrame parent) {
		super (parent);
		setTitle("New Book");
		setSize(250,250);
		
		inputType.add(personButton);
		inputType.add(studentButton);
		inputType.add(undergradButton);
		inputType.add(gradButton);
	}

	ButtonGroup inputType = new ButtonGroup();
	
	JRadioButton personButton = addRadioButton("Person",1,1,1,1);
	JRadioButton studentButton = addRadioButton("Student",2,1,1,1);
	JRadioButton undergradButton = addRadioButton("Undergraduate",3,1,1,1);
	JRadioButton gradButton = addRadioButton("Graduate",4,1,1,1);
	JButton addButton = addButton("Add",5,1,1,1);
	
	
	
	public void buttonClicked(JButton buttonObj) {
		if (personButton.isSelected()) {
			
		}
		
		if (studentButton.isSelected()) {
			
		}
		
		if (undergradButton.isSelected()) {
			
		}
		
		if (gradButton.isSelected()) {
			
		}
		
		if (buttonObj == addButton) {
			
		}
	}
	
}
