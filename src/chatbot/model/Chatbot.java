package chatbot.model;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	
	/**
	 * Creates a Chatbot object with a specified name.  Initializes the total chats to 0.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		//this. means talk to the current class
	}
	
	/**
	 * Gets the name of the Chatbot.
	 * @return The current name of the chatbot as a String.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the number of chats for this Chatbot.
	 * @return The current number of chats.
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
	
	/**
	 * Sets the name of the chatbot.
	 * @param name The new name for the Chatbot
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void incrementChats()
	{
		numberOfChats++;
	}
	
	
	/**
	 * Checks for the input "au revoir" to close the app.
	 * @param input The supplied String value.
	 * @return Whether or not it is OK to quit.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equals("au revoir"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}

}
