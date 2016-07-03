import java.util.ArrayList;
public class DeckBJ {
private ArrayList<CardBJ> deck;
	
	public DeckBJ()
	{
		deck = new ArrayList<CardBJ>();
	}
	
	public int deckSize()
	{
		return deck.size();
	}
	
	public void addToDeck(CardBJ c)
	{
		deck.add(c);
	}
	
	public CardBJ removeFromDeck(int c)
	{
		return deck.remove(c);
	}
	
	public void createDeck()
	{
		for (int i = 0; i<52; i++)
			{
				CardBJ card1 = new CardBJ();
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
			deck.get(i).setValue(1);
			deck.get(i+1).setRank("2");
			deck.get(i+1).setValue(2);
			deck.get(i+2).setRank("3");
			deck.get(i+2).setValue(3);
			deck.get(i+3).setRank("4");
			deck.get(i+3).setValue(4);
			deck.get(i+4).setRank("5");
			deck.get(i+4).setValue(5);
			deck.get(i+5).setRank("6");
			deck.get(i+5).setValue(6);
			deck.get(i+6).setRank("7");
			deck.get(i+6).setValue(7);
			deck.get(i+7).setRank("8");
			deck.get(i+7).setValue(8);
			deck.get(i+8).setRank("9");
			deck.get(i+8).setValue(9);
			deck.get(i+9).setRank("10");
			deck.get(i+9).setValue(10);
			deck.get(i+10).setRank("Jack");
			deck.get(i+10).setValue(10);
			deck.get(i+11).setRank("Queen");
			deck.get(i+11).setValue(10);
			deck.get(i+12).setRank("King");
			deck.get(i+12).setValue(10);
		}
		
		
	}
	
	public void readOut()
	{
		for (int i = 0; i<deck.size(); i++)
			System.out.println(deck.get(i).nameCard());
	}
	
	public void shuffle(int shuffleNumber)
	{
		for (int i = 0; i<shuffleNumber; i++)
		{
		ArrayList<CardBJ> firstHalf = new ArrayList<CardBJ>();
		ArrayList<CardBJ> secondHalf = new ArrayList<CardBJ>();
		ArrayList<CardBJ> totalDeck = new ArrayList<CardBJ>();
		
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
	
	
}

	

