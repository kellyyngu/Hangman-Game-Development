package hangman;
import java.util.Scanner;
public class Main 
{
      public static void main (String[]args)
      {
    	  Scanner scanner = new Scanner (System.in);
    	  chances3 c1 = new chances3();
    	  gallowsdesign g1 = new gallowsdesign();
    	  Record r1 = new Record();
    	  AnsiColour n1 = new AnsiColour();  	  
    	  
    	  r1.setName();
    	  r1.setId();
    	  r1.getName();
    	  r1.getId();  
    	  
    	  System.out.println();
    	  System.out.println("WELCOME TO MYHANGMAN");
    	  g1.round1();
    	  String Continue;
    	  char decision;
    	  int chances = 6;
    	  
    	  c1.chances();
		  Continue = scanner.next();
		  Continue = Continue.toLowerCase();
		  decision = Continue.charAt(0);
		
    	  while (chances!=0)
		  {

			 if (chances ==5)
			  {
				  g1.round2();
			  }
			  else if (chances == 4)
			  {
				  g1.round3();
			  }
			  else if (chances == 3)
			  {
				  g1.round4();
			  }
			  else if (chances == 2)
			  {
				  g1.round5();
			  } 
			  else if (chances == 1)
			  {
				  g1.round6();
			  }

			  while ( decision == 'y' || decision == 'Y' )
			  {
				 c1.chances();
				 decision = Continue.charAt(0);
			  }
    	  }	 	  
      }
}