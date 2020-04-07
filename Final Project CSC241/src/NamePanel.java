/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JPanel used to get a player or coaches name
 */

import javax.swing.*;
import java.awt.*;

public class NamePanel extends JPanel 
{
	public JLabel nameLabel;
	public JTextField nameField;
	
	public NamePanel()
	{
		//Formatting
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		
		//New label and field
		nameLabel = new JLabel("Name:");
		nameField = new JTextField(15);
		nameField.setEditable(true);
		
		//Add label and field
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(nameLabel, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(nameField, layout);
		
		setVisible(true);
	}
}
