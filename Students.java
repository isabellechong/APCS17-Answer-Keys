
public class Students {

	private String name;
	private double grade;
	public Students(String nam, double gra)
	{
		name = nam;
		grade = gra;
	}
	public String getName()
	{
		return name;
	}
	
	public double getGrade()
	{
		return grade;
	}
	
	public String getLetterGrade()
	{
		if (grade>=96)
			return "A+";
		else if (grade>=90)
			return "A";
		else if (grade>=86)
			return "B+";
		else if (grade>=80)
			return "B";
		else if (grade>=70)
			return "C";
		else if (grade>=65)
			return "D";
		else
			return "F";
	}
}
