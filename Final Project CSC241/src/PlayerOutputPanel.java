/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JPanel used to output Player information
 */

import javax.swing.*;
import java.awt.*;

public class PlayerOutputPanel extends JPanel{

	public JTextField numBox;
	public JTextField nameBox;
	public JTextField posBox;
	public JTextField yearBox;
	
	public PlayerOutputPanel()
	{
		//Create text fields to display information
		numBox = new JTextField(3);
		numBox.setEditable(false);
		nameBox = new JTextField(30);
		nameBox.setEditable(false);
		posBox = new JTextField(8);
		posBox.setEditable(false);
		yearBox = new JTextField(4);
		yearBox.setEditable(false);
		numBox.setForeground(Color.RED);
		numBox.setBackground(Color.WHITE);
		nameBox.setForeground(Color.RED);
		nameBox.setBackground(Color.WHITE);
		posBox.setForeground(Color.RED);
		posBox.setBackground(Color.WHITE);
		yearBox.setForeground(Color.RED);
		yearBox.setBackground(Color.WHITE);
		
		//Formatting
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		
		//Add text fields
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(1, 5, 1, 5);
		add(numBox, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(1, 5, 1, 5);
		add(nameBox, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 2;
		layout.gridy = 0;
		layout.insets = new Insets(1, 5, 1, 5);
		add(posBox, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 3;
		layout.gridy = 0;
		layout.insets = new Insets(1, 5, 1, 5);
		add(yearBox, layout);
		
		setVisible(true);
	}
}
