
public class CrapsPlayer {

	
	public static void main(String[] args) {
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int diceTotal = 0;
		int reDoDice = 0;
		diceTotal = die1.rollDice() + die2.rollDice();
		System.out.println("You rolled a " + diceTotal);
		if (diceTotal == 7 || diceTotal == 11)
			System.out.println("You win!");
		else if (diceTotal == 2 || diceTotal == 3 || diceTotal == 12)
			System.out.println("Craps! You lose!");
		else
		{
			reDoDice = diceTotal;
			reDoDice = die1.rollDice() + die2.rollDice();
			System.out.println("You rolled a " + reDoDice);
			while ((reDoDice != 7) && (reDoDice != diceTotal))
			{
				reDoDice = die1.rollDice() + die2.rollDice();
				System.out.println("You rolled a " + reDoDice);
			}
			if (reDoDice == 7)
				System.out.println("You lose!");
			else if (reDoDice == diceTotal)
				System.out.println("You win!");
		}

	}

}
