import java.util.Scanner;
public class BlackJackPlayer {

	public static void main(String[] args) {
		
		Scanner scans = new Scanner(System.in);
		DeckBJ deck1 = new DeckBJ();
		PlayerBJ dealer = new PlayerBJ("Dealer");
		PlayerBJ user = new PlayerBJ();
		System.out.println("What's your name?");
		String userName = scans.next();
		user.setName(userName);
		deck1.createDeck();
		deck1.setCards();
		int shuffler = (int) (Math.random()*100) + 7;
		deck1.shuffle(shuffler);
		
		dealer.draw(deck1);
		dealer.draw(deck1);
		user.draw(deck1);
		user.draw(deck1);
		
		boolean hit = true;
		boolean actuallyWinning = true;
		boolean dealerWinning = true;
		int userTotal = 0;
		int dealerTotal = 0;
		
		System.out.println("Your turn!");
		System.out.println("Your hand is:");
		user.readHand();
		userTotal = user.getSumVal();
		if (user.getSumVal()==21 && (user.revealCard() == 10 || user.revealCard() == 1))
		{
			System.out.println("Blackjack");
			userTotal = 21;
			hit = false;
		}
		else
		{
			System.out.println("Your current total is: " + userTotal);
			
		}
		System.out.println("One of the dealer's cards is:");
		dealer.revealCard();
		

		while (hit == true)
		{
			System.out.println("Hit or Stay?");
			if (scans.next().toLowerCase().equals("hit"))
			{
				user.draw(deck1);
				System.out.println("Your new hand is:");
				user.readHand();
				userTotal = user.getSumVal();
				System.out.println("Your current total is: " + userTotal);
			}
			else
				hit = false;

			if (userTotal>21)
			{
				System.out.println("Bust! You lose.");
				actuallyWinning = false;
				hit = false;
			}
		}
		
		System.out.println("Dealer's Turn!");
		while (dealerTotal<17)
		{
			dealer.draw(deck1);
			dealerTotal = dealer.getSumVal();
			if (dealerTotal>21)
			{
				System.out.println("Dealer Loses!");
				dealerWinning = false;
			}
		}
		
		System.out.println("Dealer's Final Hand Is:");
		dealer.readHand();
		System.out.println("Total: " + dealerTotal);
		
		if((userTotal>dealerTotal && actuallyWinning == true) || dealerWinning == false)
			System.out.println(userName + " Wins!");
		else if ((dealerTotal>userTotal && dealerWinning == true) || actuallyWinning == false)
			System.out.println("Dealer Wins!");
		else
			System.out.println("It's a tie!");
		
	}

}
