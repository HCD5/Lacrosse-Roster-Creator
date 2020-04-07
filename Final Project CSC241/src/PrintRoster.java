/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JFrame that is used to output the final roster of coaches and players
 */

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.*;

public class PrintRoster extends JFrame {

	public PlayerOutputPanel pOutput;
	public PlayerOutputPanel label1;
	public CoachOutputPanel label2;
	public CoachOutputPanel cOutput;
	public ArrayList<Player> pFinalRoster = new ArrayList<Player>();
	public ArrayList<Coach> cFinalRoster = new ArrayList<Coach>();
	public JTextField playerLabel;
	public JTextField coachLabel;
	public int i;
	public int count;
	
	
	public PrintRoster()
	{
		//Create JFrame to display roster
		setTitle("Lacrosse Roster Creator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
		setSize(600, 600);
		setLocationRelativeTo(null);
		
		//Import arraylist with player information
		ArrayList<Player> pFinalRoster = Player.getPlayers();
		
		//Create label for players
		playerLabel = new JTextField(49);
		playerLabel.setText("Mens Lacrosse Roster");
		playerLabel.setEditable(false);
		playerLabel.setForeground(Color.WHITE);
		playerLabel.setBackground(Color.BLACK);
		
		
		//Add label for players
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(playerLabel, layout);
		
		//Create labels for player information
		label1 = new PlayerOutputPanel();
		label1.numBox.setText("#");
		label1.nameBox.setText("Player Name");
		label1.posBox.setText("Player Position");
		label1.yearBox.setText("Year");
		
		//Add labels for player information
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);
		add(label1, layout);

		//For loop that prints player information
		for (i = 0; i < pFinalRoster.size(); i++)
		{
			//Create panel to display info
			pOutput = new PlayerOutputPanel();
		
			//Add info to the panel
			pOutput.numBox.setText(Integer.toString(pFinalRoster.get(i).getNum()));
			pOutput.nameBox.setText(pFinalRoster.get(i).getName());
			pOutput.posBox.setText(pFinalRoster.get(i).getPlayerPosition());
			pOutput.yearBox.setText(pFinalRoster.get(i).getYear());
			pOutput.numBox.setForeground(Color.BLACK);
			pOutput.nameBox.setForeground(Color.BLACK);
			pOutput.posBox.setForeground(Color.BLACK);
			pOutput.yearBox.setForeground(Color.BLACK);
			
			//Display panel
			layout = new GridBagConstraints();
			layout.gridx = 0;
			layout.gridy = (2 + i);
			layout.insets = new Insets(0, 0, 0, 0);
			add(pOutput, layout);
		}
		
		//Import arraylist with coach information
		ArrayList<Coach> cFinalRoster = Coach.getCoaches();

		//Create label for coaches
		coachLabel = new JTextField(49);
		coachLabel.setText("Mens Lacrosse Coaching Staff");
		coachLabel.setEditable(false);
		coachLabel.setForeground(Color.WHITE);
		coachLabel.setBackground(Color.BLACK);
		
		//Add label for coaches
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = (2 + i);
		layout.insets = new Insets(5, 5, 5, 5);
		add(coachLabel, layout);
		
		//Create labels for coaches information
		label2 = new CoachOutputPanel();
		label2.nameBox.setText("Coach Name");
		label2.posBox.setText("Coach Position");
		
		//Add labels for coaches information
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = (3 + i);
		layout.insets = new Insets(5, 5, 5, 5);
		add(label2, layout);
		
		//Count for coach arraylist
		count = 0;
		
		//For loop that prints coach information
		for (int c = i; c < (cFinalRoster.size() + i); c++)
		{
			cOutput = new CoachOutputPanel();
			
			cOutput.nameBox.setText(cFinalRoster.get(count).getName());
			cOutput.posBox.setText(cFinalRoster.get(count).getCoachPosition());
			cOutput.nameBox.setForeground(Color.BLACK);
			cOutput.posBox.setForeground(Color.BLACK);
			
			layout = new GridBagConstraints();
			layout.gridx = 0;
			layout.gridy = (4 + c);
			layout.insets = new Insets(0, 0, 0, 0);
			add(cOutput, layout);
			
			count ++;
		}
	
		setVisible(true);
	}
	
}
