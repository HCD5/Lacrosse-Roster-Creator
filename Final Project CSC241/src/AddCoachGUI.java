/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates JFrame used to collect coaches data 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCoachGUI extends JFrame
{
	public JButton add;
	public JButton done;
	public JLabel header;
	public NamePanel NPanel = new NamePanel();
	public CoachPositionPanel CPP = new CoachPositionPanel();
	
	public AddCoachGUI()
	{
		setTitle("Lacrosse Roster Creator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		setSize(600, 300);
		setLocationRelativeTo(null);
		
		//Add header, buttons, and action listeners
		header = new JLabel("Enter coach information and press add");
		add = new JButton("Add");
		add.addActionListener(new AddButtonListener());
		done = new JButton("Print Roster");
		done.addActionListener(new DoneButtonListener());
		
		//Add panels and their formatting
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 10, 5, 5);
		add(header, layout);
				
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);
		add(NPanel, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);
		add(CPP, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 4;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);
		add(add, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 4;
		layout.gridy = 4;
		layout.insets = new Insets(120, 5, 5, 5);
		add(done, layout);
		
		
		setVisible(true);
		
	}
	
	//Action listener that adds coach to roster
		private class AddButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				Coach coach = new Coach();
				
				//Retrieve info from panels
				String name = NPanel.nameField.getText();
				String pos = (String)CPP.CoachPositionComboBox.getSelectedItem();
				
				//Add info to coach and add to roster
				coach.setName(name);
				coach.setCoachPosition(pos);
				Coach.addCoach(coach);
				
				JOptionPane.showMessageDialog(null, (name + " has been added as a coach"));
				
				setVisible(false);
				
				new AddCoachGUI();
			}
		}
		
		//Action listener that moves user on to print roster
		private class DoneButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Printing Roster");
				
				setVisible(false);
				
				new PrintRoster();
				
			}
		}
}
