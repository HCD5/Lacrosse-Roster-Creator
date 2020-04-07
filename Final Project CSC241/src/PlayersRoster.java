/* Author: Jack Dickinson
 * Date: 4/30/2019
 * Class: CSC241
 * Purpose: Creates the object PlayersRoster that holds the list of all players
 */

import java.util.ArrayList;

public class PlayersRoster {

	public static ArrayList<Player> players = new ArrayList<Player>();
	
	//Constructor
	public PlayersRoster()
	{
		players = new ArrayList<Player>();
	}
	
	//Adds player to roster
	public static void addPlayerToRoster(Player p)
	{
		players.add(p);
	}
	
	//Returns complete roster
	public static ArrayList<Player> getPlayerRoster()
	{
		return players;
	}
}
