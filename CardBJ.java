
public class CardBJ {

	private String rank;
	private String suit;
	private int value;
	public CardBJ()
	{
		
	}
	
	public CardBJ(String r, String s, int v)
	{
		rank = r;
		suit = s;
		value = v;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setRank(String r)
	{
		rank = r;
	}
	
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public String nameCard()
	{
		return getRank() + " of " + getSuit();
	}
	
}
