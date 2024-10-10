package hangman;
import java.time.LocalTime;  
import java.util.Scanner;

public class Record 
{
   private String studentId;
   private String studentName; 
   private int time;
   Scanner scanner = new Scanner(System.in);

		public void setName() 
		{
			System.out.println("Enter your name : ");
			studentName = scanner.nextLine(); 
		}
		
		public String getName()
		{
			return studentName;
		}
		
		public void setId()
		{
			System.out.println("Enter your student Id : ");
			studentId = scanner.next();
		} 
		
		public String getId()
		{
			return studentId;
		}
		
		public void localtime()
		{
			LocalTime time = LocalTime.now();
			System.out.println(time); 
		}
		
		public static void main(String[] args)
		{
			Record r1= new Record();
			r1.setName();
			r1.setId(); 
			System.out.println(r1.getName()+ " " + r1.getId());
			System.out.println("Time: " );
			r1.localtime();
		}
}