public class Card {
	private String rank;
	private String suit;
	public Card()
	{
		
	}
	public Card(String r, String s)
	{
		rank = r;
		suit = s;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public void setRank(String r)
	{
		rank = r;
	}
	
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public String nameCard()
	{
		return getRank() + " of " + getSuit();
	}
	
}
