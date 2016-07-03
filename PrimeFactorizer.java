
public class PrimeFactorizer {

	public PrimeFactorizer()
	{
		
	}
	
	public boolean isPrime(int factor)
	{
		boolean prime = true;
		for (int i = 2; i<factor; i++)
		{
			if (factor%i == 0 && factor != 2)
				prime = false;
		}
		return prime;
	}
	
	public void factor(int num)
	{
		for (int i = 2; i<=num; i++)
		{
			if (num%i == 0 && isPrime(i) == true)
			{
				System.out.println(i);
				num/=i;
				--i;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeFactorizer jane = new PrimeFactorizer();
		jane.factor(12);
		
	}

}
