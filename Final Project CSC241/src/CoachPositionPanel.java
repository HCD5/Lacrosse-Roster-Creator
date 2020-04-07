/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the JPanel used to get a coaches position
 */
import javax.swing.*;
import java.awt.*;

public class CoachPositionPanel extends JPanel
{
	public JLabel CoachPositionLabel;
	public JComboBox CoachPositionComboBox;
	
	public CoachPositionPanel()
	{
		//Formatting
		GridBagConstraints layout = null;
		setLayout(new GridBagLayout());
				
		//New label and combo box
		CoachPositionLabel = new JLabel("Position:");
		String[] positions = {"Head", "Assistant", "Graduate Assistant"};
		CoachPositionComboBox = new JComboBox<String>(positions);
						
		//Add label and combo box
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(CoachPositionLabel, layout);
						
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(CoachPositionComboBox, layout);
						
		setVisible(true);
	}
}
