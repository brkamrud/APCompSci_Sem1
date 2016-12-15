import java.util.Scanner;

public class GameGun
{
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int bulletCount = 96;
		int CLIPSIZE = 16;
		int shotCount = 0;
		String[] clip = new String[16];
		resetClip(clip);
		
		String action = "";
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action:");
			action = kb.next();
			if (action.equals("r") || action.equals("R"))
			{
				reload(clip, bulletCount, CLIPSIZE, shotCount);
			}
			else if (action.equals("s") || action.equals("S"))
			{
				System.out.println(shoot(shotCount, clip));
			}
			System.out.println(printClip(clip, CLIPSIZE, bulletCount));
		}
		
		System.out.println("Out of Bullets!!!");
		
	}
	
	public static void resetClip(String[] clip)
	{
		for (int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot(int shotCount, String[] clip)
	{
		if (shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount -= 1;
			return "Boom!!";
		}
		else
			return "Reload!!";
	}
	
	public static void reload(String[] clip, int bulletCount, int CLIPSIZE, int shotCount)
	{
		if (bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		
		resetClip(clip);
		for (int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
		
	}
	
	public static String printClip(String[] clip, int CLIPSIZE, int bulletCount)
	{
		String output = "Bullets:\t" + bulletCount +"\nClip:\t";
		for (int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		return output;
	}
}