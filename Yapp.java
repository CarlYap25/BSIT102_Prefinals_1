import java.util.Scanner;

public class Yapp 
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		Boolean koTo = true;
		int enseTalaga;
		
		while(koTo = true)
		{
			System.out.print("\nEnter a number: ");
			System.out.print(enseTalaga = sc.nextInt());
			
			//I declared the tens and ones for word converting 
			String ones[] = {" ", " One ", " Two ", " Three ", " Four ", " Five ", " Six ", " Seven ", " Eight ", " Nine ", " Ten ",
			                 " Eleven ", " Twelve ", " Thirteen ", " Fourteen ", " Fifteen ", " Sixteen ", " Seventeen ", " Eighteen ", " Nineteen ",};
			
			String tens[] = {" ", "  ", " Twenty ", " Thirty ", " Fourty ", " Fifty ", " Sixty ", " Seventy ", " Eighty ", " Ninety ",};
			
			//This will read if the user entered zero
			if(enseTalaga == 0)
			{
				System.out.print("Zero");
			}
			//This is the digit position
			else if(enseTalaga <= 19)
			{
				System.out.print(ones[enseTalaga]);
			}
			//Also this
			else if (enseTalaga <= 99)
			{
				//i set 2 different integers
				int conNum = Integer.parseInt(Integer.toString(enseTalaga).substring(0,1));
				int conNum2 = Integer.parseInt(Integer.toString(enseTalaga).substring(1,2));
				
				System.out.print(tens[conNum] + " " + ones[conNum2]);
			}
			//And this
			else if (enseTalaga <= 999)
			{
				//i set them to 3 different integers
				int conNum = Integer.parseInt(Integer.toString(enseTalaga).substring(0,1));
				int conNum2 = Integer.parseInt(Integer.toString(enseTalaga).substring(1,2));
				int conNum3 = Integer.parseInt(Integer.toString(enseTalaga).substring(2,3));
				
				//Since i don't know how to declare hundred i put him here
				System.out.print(ones[conNum] + "Hundred" + tens[conNum2] + " " + ones[conNum3]);
			}
			//And this, they will determine they're own digit positions
			else if(enseTalaga <= 1000)
			{
				int conNum = Integer.parseInt(Integer.toString(enseTalaga).substring(0,1));
				
				//also thousand
				System.out.print(ones[conNum] + "Thousand");
			}
		}
		
	}
}