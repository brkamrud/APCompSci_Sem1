public class PC extends GameSystem
{
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: PC\nSerial #: " + getSerialNo() + "\nSystem Input: " + systemInput();
	}
}