import java.util.ArrayList;

public class AttendanceList {
	
	private ArrayList<Students> attendance = new ArrayList<Students>();
	
	public AttendanceList(ArrayList<Students> input)
	{
		attendance = input;
	}
	
	public int numStudents()
	{
		return attendance.size();
	}
	
	public void readOut()
	{
		for (int i = 0; i<attendance.size(); i++)
			System.out.println(attendance.get(i).getName());
	}
	
	public void addStudent(Students a)
	{
		attendance.add(a);
	}
	
	public void deleteStudent(String na)
	{
		for (int i = 0; i<attendance.size(); i++)
		{
			if (attendance.get(i).getName().equals(na))
				{
					attendance.remove(i);
					break;
				}
			
		}
	}
}
