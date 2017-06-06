import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame
{
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	public Server()
	{
		super("IM");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					sendMessage(event.getActionCommand());
					userText.setText("");
				}
			}
		);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(600,300);
		setVisible(true);
		
	}
	
	public void startRunning()
	{
		try
		{
			server = new ServerSocket(6789, 100);
			while(true)
			{
				try
				{
					waitForConnection();
					setupStreams();
					whileChatting();
				}
				catch(EOFException eofException)
				{
					showMessage("\n Server ended the connection! ");
				}
				finally
				{
					closeCrap();
				}
				
			}
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
		
	}
	
	private void waitForConnection() throws IOException
	{
		showMessage("Waiting for someone to connect.. \n");
		connection = server.accept();
		showMessage(" Now connectied to " + connection.getInetAddress().getHostName());
		
	}
	
	private void setupStreams() throws IOException
	{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now setup! \n");

	}
	
	private void whileChatting() throws IOException
	{
		String message = "You are now connected! ";
		sendMessage(message);
		abletoType(true);
		do
		{
			try
			{
				message = (String) input.readObject();
				showMessage("\n" + message);
			}
			catch(ClassNotFoundException classNotFoundException)
			{
				showMessage(" \n Something went wrong. ");
			}
			
		}while(!message.equals("CLIENT - END"));
		
	}
	
	public void closeCrap()
	{
		showMessage("\n Closing connections... \n");
		abletoType(false);
		try
		{
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
		
		
	}
	
	private void sendMessage(String message)
	{
		try
		{
			output.writeObject("SERVER - " + message);
			output.flush();
			showMessage("\nSERVER - " + message);
		}
		catch(IOException ioException)
		{
			chatWindow.append("\n ERROR: Can't Send Message. ");
		}

		
	}
	
	private void showMessage(final String text)
	{
		SwingUtilities.invokeLater(
			new Runnable()
			{
				public void run()
				{
					chatWindow.append(text);
				}
			}
		);
		
	}
	
	private void abletoType(final boolean tof)
	{
		SwingUtilities.invokeLater(
			new Runnable()
			{
				public void run()
				{
					userText.setEditable(tof);
				}
			}
		);
	}
	
	
	
	
	
	
}