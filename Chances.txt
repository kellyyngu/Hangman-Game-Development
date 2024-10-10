package hangman;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class chances3
{
	private ArrayList<vocab> WordList;
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_BLACK = "\u001B[30m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_WHITE = "\u001B[37m";
	
	    public void chances()
		{		  
	     Record r1 = new Record();
	     chances3 c1 = new chances3();
	     gallowsdesign g1 = new gallowsdesign();
	     vocab v1 = new vocab();
	     int chances = 6;
	     Scanner scanner = new Scanner(System.in);
	     Random random = new Random();

		 String myWordList[] = {"cookie", "bakery", "addicted", "bottle","laptop","and","car","take",
						               "it","dont","break","mouse","fearless","tomboy","next", "level", "too","hot",
					                   "you", "like","me"};
		 String randomword;
	     char hiddenWord [];
		 int chance = 0;
		 char missed = 0;
		 boolean foundTheLetter = false;
		 boolean solved = false;
		 String Continue;
		    	
		 randomword = myWordList [random.nextInt(myWordList.length)];
		 hiddenWord = new char[randomword.length()];
		    	
		 for (int i=0; i<randomword.length(); i++)
		 {
		    hiddenWord[i] = '*';
		 }
		    	
		 while (chance < 7 && !solved)
		 {
		   System.out.println("------------------------------------------");
		   System.out.println("Chances available: " + (6-chance));
		    		
		   System.out.print("Word: ");
		   for(int i = 0; i < randomword.length(); i++)
		   {
		    System.out.print(hiddenWord[i] + " ");
		   }
		    		
		    if (chance == 6)
					  
			g1.round6();
					  
			else if (chance ==5)
					  
			g1.round5();
					  
			else if (chance == 4)
		    {
			 g1.round4();
			}
		    
			else if (chance == 3)
			{
			 g1.round3();
			}
		    
			else if (chance == 2)
			{
			 g1.round2();
			} 
		    
			else if (chance == 1)
			{
			 g1.round1();
			}
		    		    		
		    System.out.println("\n");
		    System.out.println("GUESS ANY CHARACTER: ");
		    String guess = scanner.next();
		    foundTheLetter = false;
		    			
		    for(int i=0; i<randomword.length(); i++)
		    {
		     if (guess.charAt(0) == randomword.charAt(i))
		      {
		       hiddenWord[i] = randomword.charAt(i);
		       foundTheLetter = true;
		      }
		    }
		    				    		
		     if(!foundTheLetter)
		     {
		       chance++; 
		     }
		    		
		     int hidden_count = 0;
		     for (int i=0; i<randomword.length(); i++)
		     {
		       if('*' == hiddenWord[i])
		       {
		    	hidden_count++;
		       }
		     }
		    		
		     if(hidden_count > 0)
		     {
		       solved = false;
		     }
		     
		     else
		     {
		       solved = true;
		     }
		  }
	    	
		 System.out.println("your word was : " + ANSI_YELLOW+ randomword +ANSI_RESET);
		 
		      if (solved)
		      {
		    	System.out.println("You did it!");
		      }
		    	
              else
		      {
		    	System.out.println("You are Wrong, try again" + "\n" + "You Lost! Game Over..... ");
		    	System.out.print("Time finished : " );
		    	r1.localtime(); 
				System.out.println("Continue again? Y/y");
				Continue = scanner.nextLine();
		      }	
		}
}