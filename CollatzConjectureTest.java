
public class CollatzConjectureTest {

	public CollatzConjectureTest()
	{
		
	}
	
	public void ConjectureSolver(int input)
	{
		int answer = input;
		while (answer != 1)
		{
			if (answer%2 == 0)
				answer/=2;
			else
				answer = 3*answer + 1;
			System.out.println(answer);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollatzConjectureTest bill = new CollatzConjectureTest();
		bill.ConjectureSolver(1389489);
	}

}
