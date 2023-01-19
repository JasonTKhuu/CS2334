
public class TestExcusedAssignment 
{

	public static void main(String[] args) 
	{
		ExcusedAssignment student = new ExcusedAssignment("Bob Howard,190212,Homework 12");
		
		System.out.println(student);
		
		student = new ExcusedAssignment("Bob Howard", "190212", "Homework 12");
		
		System.out.println(student);
		
	}

}
