/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates coach object which extends Member
 */

import java.util.ArrayList;

public class Coach extends Member 
{
	public enum cPosition{Head, Assistant, Graduate, NA};
	public cPosition coachPosition;
	public static CoachesRoster coachRoster;
	public String cPositionString;
	
	//Constructors 
	
	/**
	 * No argument constructor
	 */
	public Coach()
	{
		coachPosition = cPosition.NA;
		cPositionString = "Nothing was entered";
		
	}
	
	/**
	 * Parameterized constructor
	 * @param p - Coaches position
	 */
	public Coach(cPosition p)
	{
		coachPosition = p;
	}
	
	//Mutators
	
	/**
	 * Sets Coaches position
	 * @param p - Coaches position
	 */
	public void setCoachPosition(String p)
	{
		cPositionString = p;
		
		if (cPositionString == "Head")
		{
			coachPosition = cPosition.Head;
		}
		else if (cPositionString == "Assistant")
		{
			coachPosition = cPosition.Assistant;
		}
		else if (cPositionString == "Graduate Assistant")
		{
			coachPosition = cPosition.Graduate;
		}
	}
	
	/**
	 * Adds coach to the roster arraylist
	 * @param c - Coach being added to arraylist
	 */
	public static void addCoach(Coach c)
	{
		CoachesRoster.addCoachToRoster(c);
	}
	
	//Accessors
	/**
	 * Returns coaches position
	 * @return cPositionString - Coaches position
	 */
	public String getCoachPosition()
	{
		return cPositionString;
	}
	
	/**
	 * Returns the coaches arraylist
	 * @return coachRoster - coach arraylist
	 */
	public static ArrayList<Coach> getCoaches()
	{
		ArrayList<Coach> coachRoster = CoachesRoster.getCoachRoster();
		return coachRoster;
	}
	
	public String toString()
	{
		return cPositionString + " " + name;
	}
	
	
	
}
