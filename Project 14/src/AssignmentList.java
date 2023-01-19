import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/** A mutable class that manages a group of ExcusedAssignments.
 * 
 * @author Deborah A. Trytten
 * @version 1.0
 *
 */
public class AssignmentList 
{
	//TODO Put the data here
	private ArrayList<ExcusedAssignment> list;
	/** Construct an empty AssignmentList.
	 * 
	 */
	public AssignmentList()
	{
		//TODO Implement the constructor
		list = new ArrayList<ExcusedAssignment>(); 
	}
	
	/** Read the data for the list from a file with lines in the following format:
	 * student-name,student-id,assignment-name
	 * All three fields may contain embedded spaces. There should be no spaces before or after the comma
	 * @param fileName The name of the file to be read. This file is assumed to be in the Project home directory.
	 * @throws FileNotFoundException If the file is not found in the proper place.
	 */
	public void readFile(String fileName) throws FileNotFoundException
	{
		Scanner file = new Scanner (new File (fileName));
		
		//TODO Read in the file here
		while(file.hasNextLine()) {
			String data = file.nextLine();
			ExcusedAssignment excused = new ExcusedAssignment(data);
			list.add(excused); 
		}
		
		file.close();
	}
	
	/** Return an ArrayList<String> that contains the names of all assignments that are submitted by the student
	 *	with the given ID.
	 *	@param id The student ID used to identify the assignments.
	 *  @return The names of all assignments that were requested for that student id.
	*/
	public ArrayList<String> findAssignmentsByID(String id)
	{
		ArrayList<String> listForID = new ArrayList<String>(); 
		//TODO implement this method
		for (int count = 0; count < list.size(); ++count) {
			ExcusedAssignment ids = list.get(count); 
			String name = ids.getID(); 
			
			if (name.equals(id)) {
				listForID.add(ids.getAssignment()); 
			}
		}
		return listForID; // stub
	}
	
	/** Return an ArrayList<String> that contains the names of all of the students who requested that the given
	 * assignment be excused.
	 * @param asmt The name of the excused assignment. This is case sensitive.
	 * @return An ArrayList<String> with one element for each student who requested that assignment be excused.
	 */
	public ArrayList<String> findNamesByAssignment(String asmt)
	{
		ArrayList<String> listForName = new ArrayList<String>();
		//TODO implement this method
		for (int count = 0; count < list.size(); ++count) {
			ExcusedAssignment assign = list.get(count); 
			String paper = assign.getAssignment();
			
			if (asmt.equals(paper)) {
				listForName.add(assign.getName()); 
			}
		}
		return listForName; // stub
	}
	
	/** Return a String that shows the contents of the ArrayList which stores this data. The list should be numbered.
	 * Each item in the list should have the name, student id, and assignment name displayed and be followed by a newline.
	 * If the list is empty, A String containing "The list is empty" should be returned.
	 * 
	 * @return A String describing the elements in the list of ExcusedAssignments, as described above.
	 */
	public String toString()
	{
		//TODO Implement this method
		if (!list.isEmpty())
		{
			String displayNames = ""; 
			for (int count = 0; count < list.size(); ++count)
			{
				displayNames += (count + 1) + ". " + list.get(count) + "\n";
			}
			
			return displayNames;
		}
		
		return "The list is empty";
	}
}
