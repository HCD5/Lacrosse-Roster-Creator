/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates Member object which is the superclass for Coach and Player
 */

public class Member 
{
	public String name;
	
	/**
	 * No argument constructor
	 */
	public Member()
	{
		name = "Nothing was entered";
	}
	
	/**
	 * Parameterized constructor
	 * @param n - Team members name
	 */
	public Member(String n)
	{
		name = n;
	}
	
	/**
	 * Sets name of team member 
	 * @param n - Team members name
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * Returns the name of the team member
	 * @return name - Team members name 
	 */
	public String getName()
	{
		return name;
	}
	
}
