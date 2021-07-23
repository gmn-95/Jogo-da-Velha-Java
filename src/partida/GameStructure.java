package partida;

import java.util.Scanner;

import boardgame.Board;

public class GameStructure {
	Scanner sc = new Scanner(System.in);
	private int choice;
	private char turn;
	private int row			 = 0;
	private int column		 = 0;
	private char[][] board	 = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
	private Board board2	 = new Board(0);
	private boolean draw;

	public GameStructure() {
	}

	public GameStructure(Character turn) {
		this.turn = turn;
		draw = false;

	}

	public char getTurn() {
		return turn;
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
	
	public boolean getDraw() {
		return draw;
	}
	
	public Integer getChoice() {
		return choice;
	}

	public void turn() {
		char x = 'X';
		char o = 'O';
		if (turn == x) {
			System.out.print("Player 1 turn [X]: ");
		} else if (turn == o) {
			System.out.print("Player 2 turn [O]: ");
		}
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			row 	= 0;
			column 	= 0;
			break;
		case 2:
			row 	= 0;
			column 	= 1;
			break;
		case 3:
			row 	= 0;
			column 	= 2;
			break;
		case 4:
			row 	= 1;
			column 	= 0;
			break;
		case 5:
			row		= 1;
			column 	= 1;
			break;
		case 6:
			row		= 1;
			column 	= 2;
			break;
		case 7:
			row 	= 2;
			column 	= 0;
			break;
		case 8:
			row 	= 2;
			column 	= 1;
			break;
		case 9:
			row 	= 2;
			column 	= 2;
			break;
		default:
			System.out.println("You didn't enter a correct number! Try again");
			getTurn();
		}

		if (turn == x && board[row][column] != x && board[row][column] != o) {
			board[row][column] = x;
			board2.setBoard(board);
			new Board(board);
			turn = o;
			
		} else if (turn == o && board[row][column] != x && board[row][column] != o) {
			board[row][column] = o;
			board2.setBoard(board);
			new Board(board);
			turn = x;
		} else {
			System.out.println("The cell you chose is used! Try again");
			getTurn();
		}

	}

	public boolean gameOver() {

		for (int i = 0; i < 3; i++) {
			if ((board[i][0] == board[i][1] && board[i][1] == board[i][2])
					|| (board[0][i] == board[1][i] && board[1][i] == board[2][i])
					|| (board[0][0] == board[1][1] && board[1][1] == board[2][2])
					|| (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
				return true;
			}
		
		}

		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != 'X' && board[i][j] != 'O') {
					return false;
				}
			}
		}
		draw = true;
		return true;
	}

}
