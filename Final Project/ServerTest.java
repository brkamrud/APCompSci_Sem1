import javax.swing.JFrame;

public class ServerTest
{
	public static void main(String[]args)
	{
		Server x = new Server();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.startRunning();
	}
}