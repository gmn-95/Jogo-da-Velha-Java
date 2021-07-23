package partida;

import java.util.InputMismatchException;
import java.util.Scanner;

import boardgame.Board;

public class Game {
	Scanner sc = new Scanner(System.in);

	
	public Game() {
		System.out.println("Tic Tac Toe Game");
		
		System.out.print("Escolha X ou O --> ");
		Character turn = sc.nextLine().toUpperCase().charAt(0);
		if(turn != 'X' && turn != 'O') {
			throw new InputMismatchException("Erro!");
		}
		new Board();
		GameStructure gameStructure = new GameStructure(turn);
		
		while(!gameStructure.gameOver()) {
			
			new Board(0);
			gameStructure.turn();
			gameStructure.gameOver();
			
		}
		
		new Check(gameStructure.getTurn(), gameStructure.getDraw());
		
	}
	
	
}
