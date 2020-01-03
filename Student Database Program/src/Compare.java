import javax.swing.*;
import BreezySwing.*;

public class Compare extends GBDialog {

	Person[] data = new Person[10];
	
	public Compare(JFrame parent, Person[] database) {
		super (parent);
		setTitle("New Book");
		setSize(500,500);
		
		this.data = database;
	}
	
	JButton undergradButton = addButton("Undergraduate",1,1,1,1);
	JButton gradButton = addButton("Graduate",1,2,1,1);
	JLabel nameLabel = addLabel("Name",2,1,1,1);
	JTextField nameField = addTextField("",2,2,1,1);
	

}
