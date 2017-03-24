import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};
	   
       String printout = "\n\n" + "==========================";


       // for (Location l : locate)
       // {
           // printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       // }
	   

       //printout += "\n\n" + "==========================" + "\nDistance from home..."; 

	   System.out.println(printout);
	   
	   for (Location l : locate)
	   {
		   double one = (double)(Math.random() * 100) + 1;
		   double two = (double)(Math.random() * 100) + 1;
		   
		   Car object = new Car();
		   object.move(one, two);
		   
		   System.out.println("After " + object.getID() + " Moved (" + one + ", " + two + ")\nNew Location: " + object.getLoc() + "\n");
	   }
	   
	   System.out.print("Distance from home...");
	   
       for (Location l : locate)
       {
           System.out.print("\n\tDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")");
       }

   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}