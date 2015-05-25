package Game;

import java.util.Scanner;

public class BarGame {
	
	private int count;
	private int[] inbar;
	private int[] outbar;
	private Object neededcomb; //Combinations to be done-- You can figure out what data structure to use here

	public BarGame(int num, Scanner in) {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Runs the game, including all scanner prompts, until a gameover is reached
	 * Possible commands are help, status, in <id>, out <id>, solution, and quit.
	 */
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
	private void printHelp(){
		
	}
	
	/**
	 * Moves a person into or out of the bar and prints the move occurred
	 * @param id The person to be moved
	 * @param into whether the person is moved in or not
	 */
	protected void transition(int id, boolean into){
		//TODO
	}
	
	/**
	 * Prints combinations to be done and map of the current situation
	 */
	private void status(){
		
	}
	
	/**
	 * Generates every needed combination to win the game and stores it in the data structure
	 */
	private void generateCombinations(){
		
	}
	
	

}
