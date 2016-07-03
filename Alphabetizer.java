import java.util.Arrays;
public class Alphabetizer {
String[] arr;
	public Alphabetizer(String[] a)
	{
		arr = a;
	}
	
	
	//note- the alphabetization algorithm used here is a select sort
	public String[] alphabetizeSelect()
	{
		String placeHolder = "";
		for (int i = 0; i<arr.length; i++)
		{
			for (int j = 0; j<arr.length; j++)
			{
				//switch if the array element comes before the index in the alphabet
				if (arr[i].compareTo(arr[j])<0)
				{
					placeHolder = arr[i];
					arr[i] = arr[j];
					arr[j] = placeHolder;
				}
				else
					continue;
			}
		}
		return arr;
	}
	
	public String[] alphabetizeBubble()
	{
		boolean swap = true;
		String placeHolder;
		while (swap == true)
		{
			swap = false;
			for (int i = 0; i<arr.length-1; i++)
			{
				if (arr[i].compareTo(arr[i+1])>0)
				{

					placeHolder = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = placeHolder;
					swap = true;
				}
			}
		}
		
		return arr;
	}
	
	public String[] alphabetizeQuick()
	{
		int left = 0;
		int right = arr.length-1;
		quickSort(left, right);
		return arr;
	}
	
	public void quickSort(int left, int right)
	{
		if(left>=right)
			return;
		String pivot = getMedian(left, right);
		int partition = partition(left, right, pivot);
		
		quickSort(0, partition-1);
		quickSort(partition+1, right);
	}
	
	public String getMedian(int left, int right)
	{
		String placeHolder;
		int center = (left+right)/2;
		if(arr[left].compareTo(arr[center])>0)
		{
			placeHolder = arr[left];
			arr[left] = arr[center];
			arr[center] = placeHolder;
		}
		if(arr[left].compareTo(arr[right])>0)
		{
			placeHolder = arr[left];
			arr[left] = arr[right];
			arr[right] = placeHolder;
		}
		if(arr[center].compareTo(arr[right])>0)
		{
			placeHolder = arr[center];
			arr[center] = arr[right];
			arr[right] = placeHolder;
		}
		
			placeHolder = arr[center];
			arr[center] = arr[right];
			arr[right] = placeHolder;

			return arr[right];
	}
	
	private int partition(int left, int right, String pivot)
	{
		int leftCursor = left-1;
		int rightCursor = right;
		String placeHolder = "";
		while (leftCursor<rightCursor)
		{
			while(arr[++leftCursor].compareTo(pivot)<0);
			while(rightCursor>0 && arr[--rightCursor].compareTo(pivot)>0);
					if (leftCursor>=rightCursor)
						break;
					else
					{
						placeHolder = arr[leftCursor];
						arr[leftCursor] = arr[rightCursor];
						arr[rightCursor] = placeHolder;
					}
				}

		placeHolder = arr[leftCursor];
		arr[leftCursor] = arr[right];
		arr[right] = placeHolder;
		
		return leftCursor;
	}
	
	public static void main (String[] args)
	{
		String[] test = {"Dog", "Cat", "Vulture", "Wombat", "Zebra", "Hamster", "Vole", "Werewolf", "Albatross", "Velociraptor"};
		Alphabetizer al = new Alphabetizer(test);
		//System.out.println(Arrays.toString(al.alphabetizeSelect(test)));
		System.out.println(Arrays.toString(al.alphabetizeQuick()));
	}
}
