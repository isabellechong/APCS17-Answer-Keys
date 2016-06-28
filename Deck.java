import java.util.ArrayList;
public class Deck {
private ArrayList<Card> deck;
	
	public Deck()
	{
		deck = new ArrayList<Card>();
	}
	
	public int deckSize()
	{
		return deck.size();
	}
	
	public void addToDeck(Card c)
	{
		deck.add(c);
	}
	
	public Card removeFromDeck(int c)
	{
		return deck.remove(c);
	}
	
	public void createDeck()
	{
		for (int i = 0; i<52; i++)
			{
				Card card1 = new Card();
				deck.add(card1);
			}	
	}
	
	public void setCards()
	{
		for (int i = 0; i<52; i++)
		{
			if (i<13)
				deck.get(i).setSuit("Hearts");
			else if (i<26)
				deck.get(i).setSuit("Spades");
			else if (i<39)
				deck.get(i).setSuit("Clubs");
			else
				deck.get(i).setSuit("Diamonds");
		}
		for (int i = 0; i<52; i+=13)
		{
			deck.get(i).setRank("Ace");
			deck.get(i+1).setRank("2");
			deck.get(i+2).setRank("3");
			deck.get(i+3).setRank("4");
			deck.get(i+4).setRank("5");
			deck.get(i+5).setRank("6");
			deck.get(i+6).setRank("7");
			deck.get(i+7).setRank("8");
			deck.get(i+8).setRank("9");
			deck.get(i+9).setRank("10");
			deck.get(i+10).setRank("Jack");
			deck.get(i+11).setRank("Queen");
			deck.get(i+12).setRank("King");
		}
	}
	
	public void readOut()
	{
		for (int i = 0; i<deck.size(); i++)
			System.out.println(deck.get(i).nameCard());
	}
	
	public void shuffle()
	{
		for (int i = 0; i<7; i++)
		{
		ArrayList<Card> firstHalf = new ArrayList<Card>();
		ArrayList<Card> secondHalf = new ArrayList<Card>();
		ArrayList<Card> totalDeck = new ArrayList<Card>();
		
			for (int j = 0; j<deck.size(); j++)
			{
				if (j<(deck.size()/2))
					firstHalf.add(deck.get(j));
				else
					secondHalf.add(deck.get(j));
			}
			
			for (int k = 0; k<(deck.size()/2); k++)
			{
				totalDeck.add(firstHalf.get(k));
				totalDeck.add(secondHalf.get(k));
			}

			deck = totalDeck;
		
		}
				
	}
	
	public void deal(Player p1, Player p2)
	{
		for (int i = 0; i<14; i+=2)
		{
			p1.addToHand(removeFromDeck(i));
			p2.addToHand(removeFromDeck(i+1));
		}
	}
	
}
