package hangman;
import java.util.Random;
public class vocab 
{
	public String myVocab()
	{
		String []array= {"cookie", "bakery", "addicted", "bottle","laptop","and","car","take",
						"it","dont","break","mouse","fearless","tomboy","next", "level", "too","hot",
						"you", "like","me"};
		
		Random r1= new Random();
		int randomnum = r1.nextInt(array.length);
		System.out.println(array[randomnum]);
		return null;
	}
} 