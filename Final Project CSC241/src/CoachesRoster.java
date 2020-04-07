/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates CoachesRoster object that holds the list of all coaches
 */

import java.util.ArrayList;

public class CoachesRoster {

	public static ArrayList<Coach> coaches = new ArrayList<Coach>();
	
	//Constructor
	public CoachesRoster()
	{
		coaches = new ArrayList<Coach>();
	}

	//Adds coach to roster
	public static void addCoachToRoster(Coach c)
	{
		coaches.add(c);
	}
	
	//Returns complete roster
	public static ArrayList<Coach> getCoachRoster()
	{
		return coaches;
	}
	
}
