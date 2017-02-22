public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random() * ((9999999 - 1000000) + 1)) + 1000000;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}