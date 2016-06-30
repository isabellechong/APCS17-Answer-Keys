
public class ArmstrongNumberFinder {

	public ArmstrongNumberFinder()
	{
		
	}
	
	public void findNumbers(int upto)
	{
		for (int i = 0; i<upto; i++)
		{
			int sum = 0;
			int numPlaces = 0;
			int inputPlaceFinder = i;
			int place = 0;
			while (inputPlaceFinder>=1)
			{
				inputPlaceFinder/=10;
				numPlaces++;
			}
			
			inputPlaceFinder = i;
			
			for (int j = 0; j<numPlaces; j++)
			{
				place = inputPlaceFinder%10;
				inputPlaceFinder/=10;
				sum += place*place*place;
			}
			
			if (sum==i)
				System.out.println(sum);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArmstrongNumberFinder jeff = new ArmstrongNumberFinder();
		jeff.findNumbers(999);

	}

}
