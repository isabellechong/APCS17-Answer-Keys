import java.util.ArrayList;
public class AttendanceTester {

	public static void main(String[] args) {
		ArrayList<Students> computerScience = new ArrayList<Students>();
		Students Jenn = new Students("Jenn", 96);
		Students John = new Students("John", 92);
		Students Jessica = new Students ("Jessica",73);
		AttendanceList APCS = new AttendanceList(computerScience);
		APCS.addStudent(Jenn);
		APCS.addStudent(John);
		APCS.addStudent(Jessica);
		APCS.readOut();
		System.out.println("-----");
		APCS.deleteStudent("Jessica");
		APCS.readOut();
	
	}

}
