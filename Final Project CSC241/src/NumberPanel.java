/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JPanel used to get a players number 
 */

import javax.swing.*;
import java.awt.*;


public class NumberPanel extends JPanel
{
	public JLabel NumberLabel;
	public JTextField NumberField;
	
	public NumberPanel()
	{
		//Formatting
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		
		//New label and field
		NumberLabel = new JLabel("Number:");
		NumberField = new JTextField(4);
		NumberField.setEditable(true);
				
		//Add label and field
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(NumberLabel, layout);
				
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(NumberField, layout);
				
		setVisible(true);
	}
	
	
}
