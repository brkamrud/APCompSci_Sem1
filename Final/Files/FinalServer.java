import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinalServer extends JFrame
{
	
	private JTextField userInput;
	private JTextArea chatArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket serverPort;
	private Socket connection;
	private final JPanel p = new JPanel();
	private final JPanel subP = new JPanel();
	private JFrame f = new JFrame();
	private JFrame f2 = new JFrame();
	
	//create text box, setsize and setvisible
	//listen for actions
	public FinalServer()
	{
		chatArea = new JTextArea();
		f.setLayout(new BorderLayout());
		f.setTitle("Font");
		p.add(new JLabel("What Font would you like to use?"));
		
		JButton TNR = new JButton("Times New Roman");
		TNR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chatArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				f.setVisible(false);
				f2.setVisible(true);
			}
		});
		
		JButton arial = new JButton("Arial");
		arial.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chatArea.setFont(new Font("Elephant", Font.PLAIN, 16));
				f.setVisible(false);
				f2.setVisible(true);
			}
		});
		
		JButton comicSans = new JButton("Comic Sans");
		comicSans.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chatArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
				f.setVisible(false);
				f2.setVisible(true);
			}
		});
		
		subP.add(TNR);
		subP.add(arial);
		subP.add(comicSans);
		
		f.add(p, BorderLayout.CENTER);
		f.add(subP, BorderLayout.SOUTH);
		f.setSize(600, 150);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setVisible(false);
		
		
		f2.setTitle("AP Compsci Messenger");
		userInput = new JTextField();
		userInput.setEditable(false);
		userInput.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					sendMessage(event.getActionCommand());
					userInput.setText("");
				}
			}
		);
		
		//adds a border the size of userInput
		f2.add(userInput, BorderLayout.SOUTH);
		//makes chat box, sets pixels, makes it scrollable
		//chatArea.setFont(new Font("Serif", Font.BOLD, 18));
		f2.add(new JScrollPane(chatArea));
		f2.setSize(600,300);
		f2.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	public void Start()
	{
		
		//left number is port, right is # of people on server
		try
		{
			
			serverPort = new ServerSocket(7777, 10);
			while(true)
			{
				try
				{
			
			
					Waiting();
					setupConnection();
					Typing();
			
				}
				catch(EOFException end)
				{
					Display("\nServer was closed.");
				}
				finally
				{
					closeProgram();
				}
			}
			
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
		
	}
	
	//waits for a connection attempt
	public void Waiting() throws IOException
	{
		
		Display("Waiting for a connection...");
		//.accept waits for a connection to be given, makes new socket
		connection = serverPort.accept();
		//gets IP and converts it to a string
		Display("\nConnecting to " + connection.getInetAddress().getHostName());
		
	}
	
	//establishes streams
	public void setupConnection() throws IOException
	{
		
		//establishes streams using ports/sockets given
		//input takes in what they say, output gives what we say
		
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		Display("Setup Complete.");
		
	}
	
	//need method for connection while typing
	public void Typing() throws IOException
	{
		//tests streams
		userInput.setEditable(true);
		String message = "\n Test";
		sendMessage(message);
		
		do
		{
			try
			{
				//recieves object from client, turns it into a string and displays it
				message = (String) input.readObject();
				Display("\n" + message);
			}
			catch(ClassNotFoundException classNotFoundException)
			{
				Display("Can't recieve message.");
			}
			
			
			//typing "end" will end the connection
		}while(!message.equals("CLIENT - END"));
		
		closeProgram();
		
	}
	
	public void sendMessage(String message)
	{
		
		try
		{
			//sends message
			output.writeObject("SERVER - " + message);
			output.flush();
			Display("\nSERVER - " + message);
		}
		catch(IOException ioException)
		{
			chatArea.append("Can't send message.");
		}

	}
	
	public void Display(String message)
	{
		SwingUtilities.invokeLater(
			new Runnable()
			{
				public void run()
				{
					chatArea.append(message);
				}
			}
		);
		
	}
	
	public void closeProgram()
	{
		Display("\n Closing connections... \n");
		userInput.setEditable(false);
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
	
}