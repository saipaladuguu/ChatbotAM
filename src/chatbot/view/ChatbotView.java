package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

/**
 * The GUI for the Chatbot project.  This is the View component.
 * @author Cody Henrichsen
 * @version 1.2 10/2/14 Cleaned up methods to provide display and dialog options.
 */
public class ChatbotView
{
	/**
	 * The internal reference to the AppController.
	 */
	private ChatbotAppController baseController;
	
	/**
	 * Constructor for the ChatbotView. It is passed a reference to the AppController for referencing the chatbot model.
	 * @param baseController The reference to the controller.
	 */
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Displays the supplied String parameter to the user via popup and returns the users response to the controller.
	 * @param input The supplied text to be displayed.
	 * @return The users input.
	 */
	public String displayChatbotConversations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + " " + input );
		
		return output;
	}
	
	/**
	 * Displays the supplied input via a popup window.
	 * @param input The text to be displayed.
	 */
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, baseController.getNotSoCleverBot().getName() + " " + input);
	}
}
