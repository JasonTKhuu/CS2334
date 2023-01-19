import java.util.Arrays;

/** This class collects together three data element: a student's name, their student ID,
 * and the name of the assignment that they request to have excused into an immutable object.
 * @author Deborah A. Trytten
 * @version 1.0
 *
 */
public class ExcusedAssignment 
{
	//TODO Put the data elements here
	private String name; 
	private String id; 
	private String assignment; 
	/** Construct an ExcusedAssignment from the given data.
	 * 
	 * @param name The student's name, stored as it should be presented.
	 * @param id The student's identification number. There is no error checking done on this number.
	 * @param assignment The name of the assignment.
	 */
	public ExcusedAssignment(String name, String id, String assignment)
	{
		this.name = name;
		this.id = id;
		this.assignment = assignment; 
	}
	
	/** Construct an ExcusedAssignment from data that has been joined together using commas. 
	 * 
	 * @param line The format required is Name,id,assignment. Notice that there are no spaces around
	 * the commas. All three fields can contain spaces as necessary, for example to separate first, middle, and last names. No assumptions are made about the
	 * number of parts that a name or assignment has.
	 */
	public ExcusedAssignment(String line)
	{
		//TODO Implement the constructor. Use the split(",") method from the String class
		// to break the line apart using commas as separators
		String[] lineString = line.split(","); 
		
		name = lineString[0];
		id = lineString[1];
		assignment = lineString[2]; 
	}
	
	/** Access the name field in this object.
	 * 
	 * @return The name of the student who requested this assignment to be excused.
	 */
	public String getName()
	{
		//TODO Implement this method
		return name; // stub
	}
	
	/** Access the student identification number field in this object.
	 * 
	 * @return The identification number of the student who requested this assignment to be excused.
	 */
	public String getID()
	{
		//TODO Implement this method
		return id; //stub
	}
	
	/** Access the assignment name field in this object.
	 * 
	 * @return The name of assignment to be excused.
	 */
	public String getAssignment()
	{
		//TODO Implement this method
		return assignment; // stub
	}
	
	/** Return a single String that contains the student's name, followed by a space,
	 * followed by the student's identification number, followed by a space, followed by
	 * the name of the assignment. Do not put a newline after this String.
	 */
	public String toString()
	{
		//TODO Implement this method
		return name + " " + id + " " + assignment; // stub
	}
}
