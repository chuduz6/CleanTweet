import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Tweet {
	
	public static void main(String[] args)
		{
			cleantweet("tweet.txt", "tweetClean.txt");
			System.out.println("DONE!!");
			
		}
		
		public static void cleantweet(String s, String s2)
		{
			String temp;
			String temp2="";
			File inputFile = new File(s);
			File outputFile = new File(s2);
			try
			{
				Scanner sc = new Scanner (inputFile);
				while(sc.hasNextLine())
				{
					temp=sc.nextLine();
					if(temp.contains(": '"))
					{
						int a = temp.indexOf(": '");
						temp2 = temp.substring(a+3, temp.length());					
						
						FileWriter fw = new FileWriter(outputFile, true);
						fw.write(temp2 + "\n");
						fw.close();
					}
						
					
				}
				
				sc.close();
			}
			catch (Exception e){
				System.out.println(e.getMessage());
				System.exit(1);			
			}
			
		}
}