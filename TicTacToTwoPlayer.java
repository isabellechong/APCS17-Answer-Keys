import java.util.Scanner;
public class TicTacToTwoPlayer {

	public static void main(String[] args) {
		Scanner scans = new Scanner(System.in);
		boolean won = false;
		Board tttb = new Board();
		int row1;
		int row2;
		int col1; 
		int col2;
		while (won == false)
		{
			System.out.println("Let's play Tic Tac To!");
			System.out.println("Player 1's Turn");
			System.out.println("Row?");
			row1 = scans.nextInt()-1;
			System.out.println("Column?");
			col1 = scans.nextInt()-1;
			tttb.addToBoard(row1, col1, "X");
			tttb.printBoard();
			won = tttb.winner();
			if (won == true)
				break;
			System.out.println("Player 2's Turn");
			System.out.println("Row?");
			row2 = scans.nextInt()-1;
			System.out.println("Column?");
			col2 = scans.nextInt()-1;
			tttb.addToBoard(row2, col2, "O");
			tttb.printBoard();
			won = tttb.winner();
			if (won == true)
				break;
		}
	}

}
