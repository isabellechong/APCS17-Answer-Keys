
public class Board {
String[][] board;
int row = 3;
int col = 3;
String winningString;
	public Board()
	{
		board = new String[row][col];
		for (int i = 0; i<row; i++)
		{
			for (int j = 0; j<col; j++)
			{
				board[i][j] = "*";
			}
		}
	}
	
	public void addToBoard(int r, int c, String move)
	{
		board[r][c] = move;
	}
	
	public void printBoard()
	{
		for (int i = 0; i<board.length; i++)
		{
			for (int j  = 0; j<board[0].length; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean checkRows()
	{
		for (int i = 0; i<row; i++)
		{
			if ((board[i][0]==board[i][1])&&(board[i][1]==board[i][2])&&(board[i][0]==board[i][2]))
			{
				winningString = board[i][0];
				return true;
			}
		}
		return false;
	}
	
	public boolean checkCols()
	{
		for (int i = 0; i<row; i++)
		{
			if ((board[0][i]==board[1][i])&&(board[1][i]==board[2][i])&&(board[0][i]==board[2][i]))
			{
				winningString = board[0][i];
				return true;
			}
		}
		return false;
	}

	
	public boolean checkDiagonals()
	{
			if ((board[0][0]==board[1][1])&&(board[1][1]==board[2][2])&&(board[0][0]==board[2][2]))
			{
				winningString = board[0][0];
				return true;
			}
			
			if ((board[0][2]==board[1][1])&&(board[1][1]==board[2][0])&&(board[2][0]==board[0][2]))
			{
				winningString = board[0][0];
				return true;
			}
			return false;
	}
	
	public boolean allSpotsFull()
	{
		boolean allFull = true;
		for (int i = 0; i<row; i++)
		{
			for (int j = 0; j<col; j++)
			{
				if (board[i][j]=="*")
				{
					allFull = false;
					break;
				}
			}
		}
		return allFull;
	}
	
	public boolean winner()
	{
		if ((checkRows()==true||checkCols()==true||checkDiagonals()==true) && winningString!="*")
		{
			System.out.println(winningString + " is the winner!");
			return true;
		}
		else if (allSpotsFull()==true)
		{
			System.out.println("It's a Tie!");
			return true;
		}
		else
		return false;
	}
	
	
	
}
