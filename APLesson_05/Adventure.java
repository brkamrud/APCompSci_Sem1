import java.util.Scanner;

public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("<<<<<<<<<< Welcome to the adventure game >>>>>>>>>> \nAs you check to make sure you still have your letter, the path you're following splits in two. \nThe path on the left leads to a marshy landscape. \nThe path on the right leads to a spooky forrest. \nWhich do you take? \na for left \nb for right");
		String choice = kb.next();
		
		if (choice.equals("a"))
		{
			System.out.println("<<<<<<<<<<>>>>>>>>> \nYou decide that the forrest is too scary and you've heard horror stories of people getting lost in the woods and being found dead a few days later. \nYou head down the path that leads to the marshy landscape. \nAs you're walking through the humid, wet land, you notice an angry alligator headed our way! \nWhat do you do? \na for charge it head on \nb for sprint in to the nearby woods");
			choice = kb.next();
			
			if (choice.equals("a"))
			{
				System.out.println("<<<<<<<<<<>>>>>>>>> \nYou yell and courageosly charge the alligator head on! \nUnfortunately you're not near as strong and dangerous as an alligaor. \nThe alligator tears you to shreds. \nWhat were you thinking was going to happen? \n<<<<<<<<<< GAME OVER >>>>>>>>>>");
				
			}
			else
			{
				if (choice.equals("b"))
				{
					System.out.println("<<<<<<<<<<>>>>>>>>>> \nYou realize that you are no match for the mighty reptile so you run to the woods close by hoping you lose it. \nAfter running for a while, the alligator fortunatley loses you. \nYou let out a sigh of relief and continue walking through the woods until you come across a giant moat filled with alligators surrounding a stone castle. \nWhat do you do? \na for swim through it \nb for yell to let the bridge down");
					choice = kb.next();
					
					if (choice.equals("a"))
					{
						System.out.println("<<<<<<<<<<>>>>>>>>>> \nFor some reason you decide swimming through the alligator infested moat is the best idea. \nYou dive into the water and start swimming towards the castle hoping that no alligator is feeling hungry or irritated. \nYou start to get close to the castle when you hear a splash. \nYou turn your head and notice a party of alligators speeding through the water towards. \nYou panic and pick up your pace. \nAfter what feels like forever, you make it onto the land unharmed. \nWondering why you weren't evicerated by the alligators, you turn and to look at the alligators that were following you. \nTo your surprise you find they weren't even going for you. \nThe castle groundskeeper luckily had been there to feed the alligators and had thrown meat into the water as you were swimming. \nYou thank the man for saving your life but he just looks at you weird and asks why you're so dumb. \nYou pay no attention to him and walk up to guards at the bridge controls. \n\"I have come to deliver this letter!\" you say as you pull out the now soaking envelope. \nYou hand them the ruined note and one of the guards takes it. \n\"This is completely unreadable...\" says the guard. But you don't care because you did your job and that's all that matters! \n<<<<<<<<<< YOU WIN >>>>>>>>>> ");
					}
					else
						if (choice.equals("b"))
						{
							System.out.println("<<<<<<<<<<>>>>>>>>>> \nYou think to yourself that you'd have to be an absolute mad man to swim through the moat. \nSo you decide that'd be easier to yell to the guards on the other side to let down the bridge. \nYou yell to the gurads to let down the bridge. \nThey yell back that it's coming down so you should stand back. \nBut, you're too busy thinking to yourself about how easy your mission was to hear their warning. \nThe bridge comes down and crushes you. \nWow, that was dumb... \n<<<<<<<<<< GAME OVER >>>>>>>>>>");
						}
				
				}
			}
		}
		else
			if (choice.equals("b"))
			{
				System.out.println("<<<<<<<<<<>>>>>>>>> \nYou figure that the forrest is just trees and should be the safer path. \nYou head down the forrest path cautiously. \nAfter a while of walking down the path you here a rustle in the bushes. \nYou stop and stare at the bushes for a second. \nNot noticing anything wrong, you shrug and turn to continue walking when out comes a giant bear from the bushes! \nIt looks like it hasn't eaten all day and is ready to eat whatever it can! \nWhat do you do? \na for confront the bear \nb for try to escape the bear");
				choice = kb.next();
				
				if (choice.equals("a"))
				{
					System.out.println("<<<<<<<<<<>>>>>>>>> \nYou turn to face the bear and stand firm. \nThe bear roars and is about to attack when you quickly pull out the smoked salmon you packed for the trip. \nThe bear stops and stares at the salmon. \nYou place the salmon on the ground and slowly back away. \nThe bear immediately starts eating the fish. \nYou use this chance to slip away while the bear is still distracted. \nYou continue down the path glad that your quick thinking saved you from becoming dinner for that bear. \nSoon you come across a moat filled with alligators surrounding a giant stone castle. \nWhat do you do? \na for swim through the moat \nb for yell to let down the bridge");
					choice = kb.next();
					if (choice.equals("a"))
					{
						System.out.println("<<<<<<<<<<>>>>>>>>>> \nFor some reason you decide swimming through the alligator infested moat is the best idea. \nYou dive into the water and start swimming towards the castle hoping that no alligator is feeling hungry or irritated. \nYou start to get close to the castle when you hear a splash. \nYou turn your head and notice a party of alligators speeding through the water towards. \nYou panic and pick up your pace. \nAfter what feels like forever, you make it onto the land unharmed. \nWondering why you weren't evicerated by the alligators, you turn and to look at the alligators that were following you. \nTo your surprise you find they weren't even going for you. \nThe castle groundskeeper luckily had been there to feed the alligators and had thrown meat into the water as you were swimming. \nYou thank the man for saving your life but he just looks at you weird and asks why you're so dumb. \nYou pay no attention to him and walk up to guards at the bridge controls. \n\"I have come to deliver this letter!\" you say as you pull out the now soaking envelope. \nYou hand them the ruined note and one of the guards takes it. \n\"This is completely unreadable...\" says the guard. But you don't care because you did your job and that's all that matters! \n<<<<<<<<<< YOU WIN >>>>>>>>>> ");
					}
					else
						if (choice.equals("b"))
						{
							System.out.println("<<<<<<<<<<>>>>>>>>>> \nYou think to yourself that you'd have to be an absolute mad man to swim through the moat. \nSo you decide that'd be easier to yell to the guards on the other side to let down the bridge. \nYou yell to the gurads to let down the bridge. \nThey yell back that it's coming down so you should stand back. \nBut, you're too busy thinking to yourself about how easy your mission was to hear their warning. \nThe bridge comes down and crushes you. \nWow, that was dumb... \n<<<<<<<<<< GAME OVER >>>>>>>>>>");
						}
				}
				else
					if (choice.equals("b"))
					{
						System.out.println("<<<<<<<<<<>>>>>>>>>> \nYou know you could never take on a bear so you turn and sprint down the path hoping you can outrun the bear. \nUnfortunately, you forgot how fast bears can be. \nThe bear easily catches up to you and tears you apart. \nMaybe you should've played dead? \n<<<<<<<<<< GAME OVER >>>>>>>>>>");
					}
			}
	}
}