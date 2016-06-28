import java.util.Scanner;
public class LoveCalc {

	public LoveCalc()
	{
		
	}
	
	public int lovePercent(String personA, String personB)
	{
		return (int) (Math.random()*100 + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stan = new Scanner(System.in);
		System.out.println("What is your name?");
		String yourName = stan.nextLine();
		System.out.println("What is the name of your significant other/crush/whatever?");
		String theirName = stan.nextLine();
		LoveCalc calculator = new LoveCalc();
		int lovePer = calculator.lovePercent(yourName, theirName);
		System.out.println("A match between " + yourName + " and " + theirName + " has a " + lovePer + "% chance of success");
	}

}
