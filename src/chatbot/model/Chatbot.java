package chatbot.model;

import java.util.ArrayList;

/**
 * Model class for the Chatbot project.  The chatbot has checker methods to direct the output messages for the chatbot.
 * @author Cody Henrichsen
 * @version 1.3 10/2/14
 */
public class Chatbot
{
	/**
	 * The name of the Chatbot.
	 */
	private String name;
	/**
	 * The programmer specified content area.  Used in the contentChecker(String input) method.
	 */
	private String contentArea;
	/**
	 * The current number of chats the Chatbot has participated in.
	 */
	private int numberOfChats;
	/**
	 * The list of memes that are used in the Chatbot.  Used in the memeChecker(String input).
	 */
	private ArrayList<String> memeList;
	
	/**
	 * Creates a Chatbot object with a specified name.  Initializes the total chats to 0. Creates and fills the memeList.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		contentArea = "";
		memeList = new ArrayList<String>();
		fillTheMemeList();
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
	
	/**
	 * Increments the chat count for the Chatbot.  Used for tracking the activity of the chatbot.
	 */
	private void incrementChats()
	{
		numberOfChats++;
	}
	
	/**
	 * Fills the contents of the memeList with internet memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("y u mad bro");
		memeList.add("doh!");
		memeList.add("one does not simply");
		memeList.add("hipster meme");
		memeList.add("toddler fist");
		memeList.add("kitties!");
	}
	
	/**
	 * Processed the supplied text from the user to provide a message from the Chatbot.
	 * @param userText The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		
		if(memeChecker(userText))
		{
			processedText = "hey, you found a meme: " + userText;
			processedText += " isn't that cool.";
		}
		else
		{
			processedText = "Boring, that wasn't a meme.";
		}
		
		return processedText;
	}
	
	/**
	 * Checks the length of a string based on its length.
	 * @param input The supplied String object.
	 * @return Whether the supplied String is greater than 20 characters.
	 */
	private boolean stringChecker(String input)
	{
		boolean isTooLong = false;
		
		if(input.length() >= 20)
		{
			isTooLong = true;
		}
		
		return isTooLong;
	}
	
	/**
	 * Checks if the supplied String contains the content area of the Chatbot.
	 * @param input The user supplied String.
	 * @return Whether the Chatbot's special content area is inside the input String.
	 */
	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;
		
		if(input.contains(contentArea))
		{
			hasMyContent = true;
		}
		
		return hasMyContent;
	}
	
	/**
	 * Checks to see if the supplied user text matches any of the memes in the Chatbot's meme list.
	 * @param currentText The user supplied text.
	 * @return Whether the String matched any of the built in memes.
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		for(int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if(memeList.get(loopCount).equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		return isAMeme;
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
