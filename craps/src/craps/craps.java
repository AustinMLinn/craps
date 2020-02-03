package craps;
import java.util.Scanner;
public class craps
	{
		static int roll1;
		static int roll2;
		static String fake;
		public static void main(String[] args)
			{
				boolean restart=true;
				System.out.println("Welcome to my Casino, press enter to contine.");
					while(restart)
						{
							boolean rolling2 = true;
				Scanner userStringInput = new Scanner (System.in);
				int die1 = (int) (Math.random() * 6) + 1;
				int die2 = (int) (Math.random() * 6) + 1;
				roll1 = (die1+die2);
				
				fake = userStringInput.nextLine();
				System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of "+ roll1+".");
				if(roll1== 7|| roll1== 11)
					{
						
						System.out.println("You win!!!");
						System.exit(0);
					}
				
				else if(roll1== 2|| roll1==12) 
					{
						
						 System.out.println("You lose.");
						 System.exit(0);
					}
				else 
					{
						 System.out.println( " the point is "+roll1+".");
					}
				
				
				while(rolling2)
				{
					int die3 = (int) (Math.random() * 6) + 1;
					int die4 = (int) (Math.random() * 6) + 1;
					roll2 = (die3+die4);
					System.out.println("You rolled a " + die4+ " and a " + die3 + " for a total of "+ roll2+".");
					if(roll2== 7)
						{
							System.out.println("You lose.");
							rolling2 = false;
							System.out.println("Do you want to play again?");
							String yes = userStringInput.nextLine();
							if(userStringInput.equals("yes"))
							{
								restart=false;
							}
							else 
							{
								
							}
						}
						
						else if(roll2==roll1) 
						{
							System.out.println("You win!!!.");
							rolling2 = false;
							System.out.println("Do you want to play again?");
							String yes = userStringInput.nextLine();
							if(userStringInput.equals("yes"))
							{
								restart=false;
							}
							else 
							{
								
							}
							
						}
						else 
						{
							
						}
					
				}
				
				

			}

	}
	}
