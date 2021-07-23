package partida;

import boardgame.Board;

public class Check {
	
	private Character turn;
	private boolean   draw;
	
	public Check(Character turn, boolean draw) {
		this.turn = turn;
		this.draw = draw;
		
		result(turn, draw);
		
	}

	public void result(Character turn, boolean draw) {
		if(turn == 'O' && !draw) {
			System.out.println("\n\nPlayer 1 [X] Wins! Game Over!");
		}
		else if(turn == 'X' && !draw) {
			System.out.println("\nPlayer 2 [O] Wins! Game Over!");
		}
		else {
			
			new Board(0);
			System.out.println("\nIts a draw! Game Over!");
		}
	}

	public Character getTurn() {
		return turn;
	}

	public boolean getDraw() {
		return draw;
	}


	
	
	
}
