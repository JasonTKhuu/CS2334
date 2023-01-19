import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/** The main program for this project. This program will repeatedly ask the user to
 * make a selection from a menu of choices, and implement the user's selections.
 * 
 * @author Deborah A Trytten
 * @version 1.0
 *
 */
public class Driver 
{
	//These constants are used to display the menu and control the program.
	private static int READ_FILE = 1;
	private static int ASMT_BY_ID = 2;
	private static int NAMES_BY_ASMT = 3;
	private static int SHOW_LIST = 4;
	private static int QUIT = 5;

	/** Run the main program by repeated asking the user to make a selection from a menu
	 * and implementing that selection.
	 * @param args There are no command line arguments.
	 * @throws FileNotFoundException If the user enters a file name that is not stored in the Project's
	 * main directory.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);
		AssignmentList list = new AssignmentList();
		
		int response = chooseFromMenu(keyboard);
		while (response != QUIT)
		{
			if (response == READ_FILE)
			{
				System.out.println("Enter file name");
				String fileName = keyboard.nextLine();
				//TODO Call a method in the AssignmentList class
				list.readFile(fileName);
			}
			else if (response == ASMT_BY_ID)
			{
				System.out.println("Enter the Student's ID");
				String id = keyboard.nextLine();
				//TODO Call a method in the AssignmentList class
				ArrayList<String> asmts = list.findAssignmentsByID(id);
				System.out.println(prettyPrint(asmts));
			}
			else if (response == NAMES_BY_ASMT)
			{
				System.out.println("Enter the assignment name");
				String asmt = keyboard.nextLine();
				//TODO Call a method in the AssognmentList class
				ArrayList<String> names = list.findNamesByAssignment(asmt);
				System.out.println(prettyPrint(names));
			}
			else if (response == SHOW_LIST)
			{
				System.out.println(list);
			}
			else
			{
				System.out.println("Unanticipated case");
			}
			
			System.out.println(); // give the user some space to breathe
			response = chooseFromMenu(keyboard);
		}
		keyboard.close();
	}

	/** Print out a menu of choices and let the user choose what they wish to do. 
	 * If the chosen value is out of range, allow the user to re-enter the data until it is 
	 * in the proper range.
	 * @param keyboard A Scanner that has previously been constructed and is connected to the console.
	 * @return The item on the menu that was selected.
	 */
	private static int chooseFromMenu(Scanner keyboard)
	{
		System.out.println("Make a choice from the menu");
		System.out.println(READ_FILE + ". Read Data From File");
		System.out.println(ASMT_BY_ID + ". Find Assignments By ID");
		System.out.println(NAMES_BY_ASMT + ". Find Names By Assignment");
		System.out.println(SHOW_LIST + ". Show the Current List");
		System.out.println(QUIT + ". Quit");
		
		int response = keyboard.nextInt();
		keyboard.nextLine();
		while (response < READ_FILE || response > QUIT)
		{
			System.out.println("That choice was not legal.");
			System.out.println("Please re-enter your choice");
			System.out.println(READ_FILE + ". Read Data From File");
			System.out.println(ASMT_BY_ID + ". Find Assignments By ID");
			System.out.println(NAMES_BY_ASMT + ". Find Names By Assignment");
			System.out.println(SHOW_LIST + ". Show the Current List");
			System.out.println(QUIT + ". Quit");
			response = keyboard.nextInt();
			keyboard.nextLine();
		}
		
		return response;
	}
	
	/** Return a String that contains a summary of the given ArrayList of String objects. The
	 * contents of the given ArrayList should be numbered and shown one to a line.
	 * @param strings The ArrayList to be pretty printed.
	 * @return A single String that contains all of the elements of the ArrayList, numbered,
	 * and shown one to a line.
	 */
	private static String prettyPrint(ArrayList<String> strings)
	{
		if (strings.isEmpty())
		{
			return "The list is empty";
		}
		
		String result = "";
		for (int index=0; index<strings.size(); ++index)
		{
			result += (index + 1) + ". " + strings.get(index) + "\n";
		}
		
		return result;
	}
}
