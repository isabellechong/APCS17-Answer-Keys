
public class FibonacciSequence {

	public FibonacciSequence()
	{
		
	}
	
	public void findFibonacci(int howMany)
	{
		int first = 0;
		int second = 1;
		int sum;
		System.out.println(first);
		System.out.println(second);
		for (int i = 0; i<howMany-2; i++)
		{
			sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSequence frank = new FibonacciSequence();
		frank.findFibonacci(10);

	}

}
