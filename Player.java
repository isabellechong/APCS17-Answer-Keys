import java.util.ArrayList;
public class Player {
private ArrayList<Card> hand = new ArrayList<Card>();
private int setNumber;
private String name;
	
	public Player()
	{
		setNumber = 0;
	}
	
	public Player(String n)
	{
		setNumber = 0;
		name = n;	
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void addToHand(Card c)
	{
		hand.add(c);
	}
	
	public int removeFromHand(String r, Player opp)
	{
		int numMatch = 0;
		for (int i = 0; i<hand.size(); i++)
			if (r.toLowerCase().equals(hand.get(i).getRank().toLowerCase()))
			{
				opp.addToHand(hand.remove(i));
				numMatch++;
				i--;
			}
		return numMatch;
	}
	
	public boolean matchHand(String r, int i)
	{
		if (r.toLowerCase().equals(hand.get(i).getRank()))
			return true;
		else
			return false;
	}
	
	public void readHand()
	{
		for (int i = 0; i<hand.size(); i++)
		{
			System.out.println(hand.get(i).nameCard());
		}
	}
	
	public String readRank(int i)
	{
		return hand.get(i).getRank();
	}
	
	public void draw(Deck de)
	{
		addToHand(de.removeFromDeck(0));
	}
	
	public void incrementSet()
	{
		setNumber++;
	}
	
	public int readSetNumber()
	{
		return setNumber;
	}
	
	public int handSize()
	{
		return hand.size();
	}
	
	public void discard(String r)
	{
		for (int i = 0; i<hand.size(); i++)
		{
			if (hand.get(i).getRank().equals(r))
			{
				hand.remove(i);
				i--;
			}
		}
	}
	
	public boolean setTypePresent()
	{
		String whatCard;
		for (int i = 0; i<hand.size(); i++)
		{
			int numCards = 0;
			whatCard = hand.get(i).getRank();
			for (int j = 0; j<hand.size(); j++)
			{
				if (hand.get(i).getRank().equals(hand.get(j).getRank()))
				{
					numCards++;	
				}
			}
			if (numCards==4)
			{
				System.out.println(getName() + " has a set of " + whatCard + "s");
				incrementSet();
				discard(whatCard);
				return true;
			}
		}
		System.out.println("There are no sets present");
		return false;
	}
	
	public String bestMoveC()
	{
		String chosenRank = "";
		int highest = 0;
		for (int i = 0; i<hand.size(); i++)
		{
			int count = 0;
			for (int j = 0; j<hand.size(); j++)
			{
				if (hand.get(i).getRank().equals(hand.get(j).getRank()))
				{
					count++;	
				}
			}
			if (count>highest)
			{
				highest = count;
				chosenRank = hand.get(i).getRank();
			}
		}
		return chosenRank;
	}
}
