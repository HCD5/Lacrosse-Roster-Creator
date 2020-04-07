/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JPanel used to get a players position
 */

import javax.swing.*;
import java.awt.*;

public class PositionPanel extends JPanel
{
	public JLabel positionLabel;
	public static JComboBox<String> positionComboBox;
	
	public PositionPanel()
	{
		//Formatting
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
			
		//New label and combo box
		positionLabel = new JLabel("Position:");
		String[] positions = {"Attack", "Midfield", "Defense", "Goalie"};
		positionComboBox = new JComboBox<String> (positions);
		
		
		//Add label and combo box
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(positionLabel, layout);
				
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(positionComboBox, layout);
			
		setVisible(true);
	}
}
