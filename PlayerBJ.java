import java.util.ArrayList;
public class PlayerBJ {

	private ArrayList<CardBJ> hand = new ArrayList<CardBJ>();
	private String name;

	public PlayerBJ()
	{

	}


	public PlayerBJ(String n)
	{
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

	public void addToHand(CardBJ c)
	{
		hand.add(c);
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

	public void draw(DeckBJ de)
	{
		addToHand(de.removeFromDeck(0));
	}
	
	public int handSize()
	{
		return hand.size();
	}
	
	public int revealCard()
	{
		System.out.println(hand.get(0).nameCard());
		return hand.get(0).getValue();
	}
	
	private boolean acePresent()
	{
		boolean present = false;
		for (int i = 0; i<hand.size(); i++)
		{
			if (hand.get(i).getValue()==1)
				present = true;
		}
		return present;
	}
	
	public int getSumVal()
	{
		int sum = 0;
		for (int i = 0; i<hand.size(); i++)
		{
			sum = sum + hand.get(i).getValue();
		}
	
		if (acePresent()==true && sum<10)
		{
			sum+=10;
		}
		
		return sum;
	}
}

