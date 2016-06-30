import java.util.Scanner;
import java.util.Random;
public class GoFishTester {

	public static void main(String[] args)
	{
		Scanner scans = new Scanner(System.in);
		Random rando = new Random();
		System.out.println("Let's Play Go Fish!");
		Player user = new Player();
		Player computer = new Player("Computer"); 
		Deck deck1 = new Deck();
		deck1.createDeck();
		deck1.setCards();
		deck1.shuffle();
		System.out.println("What is your name?");
		String nameInput = scans.next();
		user.setName(nameInput);
		deck1.deal(user, computer);
		System.out.println();
		System.out.println("Here is your Hand: ");
		user.readHand();
		String bestPrevious = "";
		String computerRank = "";
		
		while ((deck1.deckSize()>0) || ((user.handSize()>0)||(computer.handSize()>0)))
		{
			boolean againOrNot = true;
			boolean againOrNotC = true;
			while (againOrNot==true)
			{
				System.out.println("Your turn!");
				System.out.println("Rank? (enter as numerals unless asking for an Ace, Jack, Queen or King)");
				String userRank = scans.next();
				int numMatch = 0;
				numMatch = computer.removeFromHand(userRank, user);
				if (numMatch == 0)
				{
					System.out.println("No Matches! Go fish!");
					user.draw(deck1);
					System.out.println("Your new hand is:");
					user.readHand();
					againOrNot = false;
				}
				else
				{
					System.out.println("Your new hand is:");
					user.readHand();
					againOrNot = user.setTypePresent();
					if (againOrNot == true)
					{
						System.out.println("Your score is " + user.readSetNumber());
					}
				}
				System.out.println();
			}
			 int random = 0;
			while (againOrNotC == true)
			{
				System.out.println("Computer's turn!");
				computerRank = computer.bestMoveC();
				random = rando.nextInt(computer.handSize());
				if (computerRank.equals(bestPrevious))
				{
					computerRank = computer.readRank(random);
				}
				System.out.println("Computer has asked for " + computerRank);
				int numMatch = 0;
				numMatch = user.removeFromHand(computerRank, computer);
				if (numMatch == 0)
				{
					System.out.println("No Matches for Computer! Go fish!");
					computer.draw(deck1);
					againOrNotC = false;
				}
				else
				{
					System.out.println("Computer takes your cards.");
					againOrNot = computer.setTypePresent();
					if (againOrNot==true)
						System.out.println("Computer's score is " + computer.readSetNumber());
					else
					{
						bestPrevious = computerRank;
						break;
					}
				}
				System.out.println();
				bestPrevious = computerRank;
			}
			
			System.out.println();
		}
		
		if (computer.readSetNumber()>user.readSetNumber())
		{
			System.out.println("Computer Wins");
		}
		else if (user.readSetNumber()>computer.readSetNumber())
		{
			System.out.println("You Win");
		}
		else
			System.out.println("Tie");
			
	}

}
