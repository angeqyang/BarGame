import java.util.Scanner;

import Game.BarGame;


public class Main {
	
	public static void main(String[] a){
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the bar game, where you must get every combination of people into a bar without repeating!");
		while( true ){
		System.out.println("How many people do you want?");
		int num = in.nextInt();
		BarGame bg = new BarGame( num, in );
		bg.start();
		
		System.out.println("Do you want to play again? (Y/n)");
		if (in.next().equals("n"))
			System.exit(0);
		}
	}

}
