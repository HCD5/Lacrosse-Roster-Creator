/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates object Player which extends Member
 */

import java.util.ArrayList;

public class Player extends Member
{
	public int num;
	public enum year {Fr, So, Jr, Sr, Gr, NA};
	public year playerYear;
	public enum pPosition {Attack, Midfield, Defense, Goalie, NA};
	public pPosition playerPosition;
	public String playerYearString;
	public String playerPositionString;
	public static PlayersRoster playerRoster;
	
	//Constructors
	/**
	 * No argument constructor
	 */
	public Player()
	{
		num = -1;
		playerYear = year.NA;
		playerPosition = pPosition.NA;
		playerYearString = "Nothing was entered";
		playerPositionString = "Nothing was entered";
	}
	
	/**
	 * Parameterized constructor 
	 * @param n - Players number
	 * @param y - Players year
	 * @param p - Players position
	 */
	public Player(int n, String y, String p)
	{
		num = n;
		playerYearString = y;
		playerPositionString = p;
	}
	
	//Mutators
	/**
	 * Sets the players number
	 * @param n - Players number
	 */
	public void setNum(int n)
	{
		num = n;
	}
	
	/**
	 * Sets the players year
	 * @param y - Players year
	 */
	public void setYear(String y)
	{
		playerYearString = y;
		
		if (playerYearString == "Fr.")
		{
			playerYear = year.Fr;
		}
		else if (playerYearString == "So.")
		{
			playerYear = year.So;
		}
		else if (playerYearString == "Jr.")
		{
			playerYear = year.Jr;
		}
		else if (playerYearString == "Sr.")
		{
			playerYear = year.Sr;
		}
		else if (playerYearString == "Gr.")
		{
			playerYear = year.Gr;
		}
	}
	
	/**
	 * Sets the players position
	 * @param p - Players position
	 */
	public void setPlayerPosition(String p)
	{
		playerPositionString = p;
		
		if (playerPositionString == "Attack")
		{
			playerPosition = pPosition.Attack;
		}
		else if (playerPositionString == "Midfield")
		{
			playerPosition = pPosition.Midfield;
		}
		else if (playerPositionString == "Defense")
		{
			playerPosition = pPosition.Defense;
		}
		else if (playerPositionString == "Goalie")
		{
			playerPosition = pPosition.Goalie;
		}
	}
	
	/**
	 * Adds player to the roster arraylist
	 * @param p - Player being added to arraylist
	 */
	public static void addPlayer(Player p)
	{
		playerRoster.addPlayerToRoster(p);
	}
	
	//Accessors 
	/**
	 * Returns the players number
	 * @return num - Players number
	 */
	public int getNum()
	{
		return num;
	}
	
	/**
	 * Returns the players year
	 * @return playerYear - Players year
	 */
	public String getYear()
	{
		return playerYearString;
	}
	
	/**
	 * Returns the players position
	 * @return currPosition - Players position
	 */
	public String getPlayerPosition()
	{
		return playerPositionString;
	}
	
	/**
	 * returns the roster arraylist
	 * @return pRoster - roster arraylist
	 */
	public static ArrayList<Player> getPlayers()
	{
		ArrayList<Player> pRoster = playerRoster.getPlayerRoster();
		return pRoster;
	}
	
	public String toString()
	{
		return num + " " + name + " " + playerPositionString + " " + playerYearString ;
	}
	

}
