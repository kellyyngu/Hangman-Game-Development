package hangman;
import java.util.ArrayList;
import java.util.Random;

public class AnsiColour
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

		public AnsiColour() {
			
			WordList = new ArrayList<vocab>();
		}
		
		 public void addword(String title)
	     {
	   		  	vocab v1=new vocab();
	   		  	
	   		  	WordList.add(v1);
	     }
		 
		 public void randomWords() {
			 
			 AnsiColour random = new AnsiColour();
			 
			 random.addword(ANSI_BLACK+"cookie"+ANSI_RESET);
			 random.addword(ANSI_GREEN+"bakery"+ANSI_RESET);
			 random.addword(ANSI_CYAN+"addicted"+ANSI_RESET);
			 random.addword(ANSI_WHITE+"bottle"+ANSI_RESET);
			 random.addword(ANSI_RED+"laptop"+ANSI_RESET);
			 random.addword(ANSI_PURPLE+"and"+ANSI_RESET);
			 random.addword(ANSI_WHITE+"car"+ANSI_RESET);
			 random.addword(ANSI_BLACK+"take"+ANSI_RESET);
			 random.addword(ANSI_CYAN+"it"+ANSI_RESET);
			 random.addword(ANSI_BLUE+"dont"+ANSI_RESET);
			 random.addword(ANSI_RED+"break"+ANSI_RESET);
			 random.addword(ANSI_YELLOW+"mouse"+ANSI_RESET);
			 random.addword(ANSI_PURPLE+"fearless"+ANSI_RESET);
		 }
		 
		 public ArrayList<vocab> takeList(){
			 
			 return WordList;
		 }
		 
		
		 public vocab wordOutput() {
			 
			 Random random = new Random();
			 randomWords();
			 return takeList().get(random.nextInt(WordList.size()));
			 
		 }
	}