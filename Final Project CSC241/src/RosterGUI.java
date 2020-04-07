/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JFrame used to collect player information
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class RosterGUI extends JFrame
{
	public JButton add;
	public JButton done;
	public JLabel header;
	public NamePanel NPanel = new NamePanel();
	public NumberPanel NumPanel = new NumberPanel();
	public YearPanel YPanel = new YearPanel();
	public PositionPanel PPanel = new PositionPanel();
	
	public RosterGUI()
	{
		//Formatting for JFrame
		setTitle("Lacrosse Roster Creator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		setSize(800, 300);
		setLocationRelativeTo(null);
		
		//Add header, buttons, and action listeners
		header = new JLabel("Enter player information and press add");
		add = new JButton("Add");
		add.addActionListener(new AddButtonListener());
		done = new JButton("Finished");
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
		add(NumPanel, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 2;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);
		add(YPanel, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 3;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);
		add(PPanel, layout);
		
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
	
	//Action listener that adds player to roster
	private class AddButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Try for data validation
			try 
			{
				Player player = new Player();
			
				//Retrieve info from panels
				String name = NPanel.nameField.getText();
				int num = Integer.parseInt(NumPanel.NumberField.getText());
				String year =(String)YPanel.yearComboBox.getSelectedItem();
				String pos = (String)PPanel.positionComboBox.getSelectedItem();
			
				//Add info to player and add to roster
				player.setName(name);
				player.setNum(num);
				player.setYear(year);
				player.setPlayerPosition(pos);
				Player.addPlayer(player);
			
				JOptionPane.showMessageDialog(null, ( name + " has been added to the roster"));
			
			}
			
			//Catch for data validation
			catch (Exception I)
			{
				JOptionPane.showMessageDialog(null, "Invalid input, please enter a name in the Name box and a number in the Number Box.");
			}
			
			setVisible(false);
			
			new RosterGUI();
		}
		
		
	
	}
	
	//Action listener that moves user on to adding coaches
	private class DoneButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Add Coaching Staff");
			
			setVisible(false);
			
			new AddCoachGUI();
		}
	}
	
	
}
