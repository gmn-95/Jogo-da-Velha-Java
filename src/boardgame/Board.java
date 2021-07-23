package boardgame;

public class Board {
	
	private char[][] board = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
	
	public Board(int i){
	}

	public Board(char[][] board) {
		this.board = board;
		setBoard(board);
		clearScreen();
		exibirBoard();
	}

	public Board() {
		exibirBoard();
	}
	
	public void exibirBoard() {
		System.out.println("---------------------\n");
		System.out.println("   |   | ");
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("___|___|___");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("___|___|___");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		System.out.println("   |   | ");
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	
	
}	
