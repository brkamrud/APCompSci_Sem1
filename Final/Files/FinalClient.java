import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FinalClient extends JFrame
{
	private JTextField userInput;
	private JTextArea chatArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	private final JPanel p = new JPanel();
	private final JPanel subP = new JPanel();
	private JFrame f = new JFrame();
	private JFrame f2 = new JFrame();
	
	//constructor
	public FinalClient(String host)
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
	
	public void startRunning()
	{
		try{
			connectToServer();
			setupStreams();
			whileChatting();
		}catch(EOFException eofException){
			showMessage("\n Client ended connection");
		}catch(IOException ioException){
			ioException.printStackTrace();
		}finally{
			closeSnS();
		}
	}
	
	//connect to server
	private void connectToServer() throws IOException
	{
		showMessage("Attempting connection... \n");
		connection = new Socket(InetAddress.getByName(serverIP), 7777);
		showMessage("Connected to: " + connection.getInetAddress().getHostName());
	}
	
	//set up streams to send and receive messages
	private void setupStreams() throws IOException
	{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Connected");
	}
	
	//while chatting with server
	private void whileChatting() throws IOException
	{
		ableToType(true);
		do{
			try{
				message = (String) input.readObject();
				showMessage("\n" + message);
			}catch(ClassNotFoundException classNotfoundException){
				showMessage("\n CAN'T DISPLAY MESSAGE");
			}
		}while(!message.equals("SERVER - END"));
	}
	
	//close the streams and sockets
	private void closeSnS()
	{
		showMessage("\n Closing connection...\n");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
	//send messages to server
	private void sendMessage(String message){
		try{
			output.writeObject("CLIENT - " + message);
			output.flush();
			showMessage("\nCLIENT - " + message);
		}catch(IOException ioException){
			chatArea.append("\nMESSAGE FAILED TO SEND");
		}
	}
	
	//update chatWindow
	private void showMessage(final String message)
	{
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run(){
					chatArea.append(message);
				}
			}
		);
	}
	
	//allows user to type
	private void ableToType(final boolean tof)
	{
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run(){
					userInput.setEditable(tof);
				}
			}
		);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	