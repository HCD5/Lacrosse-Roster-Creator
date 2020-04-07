/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JPanel used for outputting coaches information
 */

import javax.swing.*;
import java.awt.*;

public class CoachOutputPanel extends JPanel {

	public JTextField nameBox;
	public JTextField posBox;
	
	public CoachOutputPanel()
	{
		//Create text fields to display information
		nameBox = new JTextField(34);
		nameBox .setEditable(false);
		posBox = new JTextField(13);
		posBox.setEditable(false);
		nameBox.setForeground(Color.RED);
		posBox.setForeground(Color.RED);
		nameBox.setBackground(Color.WHITE);
		posBox.setBackground(Color.WHITE);
		
		//Formatting
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		
		//Add text fields
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(1, 5, 1, 7);
		add(nameBox, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(1, 5, 1, 5);
		add(posBox, layout);
		
		setVisible(true);	
		
	}
}
