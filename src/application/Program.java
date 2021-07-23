package application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import boardgame.Board;
import partida.Game;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		boolean start = true;
		
		while(start)
		try {
			do {
				Board.clearScreen();
				System.out.println("MENU");
				System.out.println("1 - Jogar");
				System.out.println("2 - Sair");
				System.out.print("--> ");
				choice = sc.nextInt();

				Board.clearScreen();
				switch (choice) {
				case 1:
					new Game();
					System.out.println("\nPRESS ENTER...");
					System.in.read();

					break;

				default:
					start = false;
					break;
				}
			} while (choice == 1);
		} catch (IOException e) {
			continue;
		} catch (InputMismatchException e) {
			continue;
		}
	}

}
