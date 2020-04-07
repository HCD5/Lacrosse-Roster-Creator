/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JPanel used to get players year 
 */

import javax.swing.*;
import java.awt.*;

public class YearPanel extends JPanel
{
	public JLabel yearLabel;
	public JComboBox<String> yearComboBox;
	
	public YearPanel()
	{
		//Formatting
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		
		//New label and combo box
		yearLabel = new JLabel("Year:");
		String[] years = {"Fr.", "So.", "Jr.", "Sr.", "Gr."};
		yearComboBox = new JComboBox<String>(years);
		
		
		//Add label and combo box
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(yearLabel, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(yearComboBox, layout);
		
		setVisible(true);
		
	}
	
}

