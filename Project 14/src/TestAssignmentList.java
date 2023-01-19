import java.io.FileNotFoundException;
import java.util.*; 
import java.util.ArrayList; 
public class TestAssignmentList 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		AssignmentList list = new AssignmentList(); 
		
		list.readFile("Data2.txt");
//		list.findAssignmentsByID("111222333");
//		list.findNamesByAssignment("Homework 1");
//		list.findAssignmentsByID("222333444");
//		list.findNamesByAssignment("Homework 1");
//		list.findAssignmentsByID("333444555");
//		list.findNamesByAssignment("Homework 2");
//		list.findAssignmentsByID("222333444");
//		list.findNamesByAssignment("Homework 2");
//		list.findAssignmentsByID("222333444");
//		list.findNamesByAssignment("Homework 3");
		list.readFile("Rice.txt");
		System.out.println(list); 
	}

}
