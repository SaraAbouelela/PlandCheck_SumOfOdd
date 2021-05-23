package Task1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class sumOfOddsNum {

	public static void main(String[] args) {
	
		boolean moreNums= true;
		int iteration, sum=0;
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (moreNums) 
		{
			// Accept numbers from the user 
			// Accept the first number 
			System.out.print("Please enter number ");
			
			// Case to void the case the user enter not a number value  
			try 
				{
					numbers.add(Integer.parseInt(sc.next()));
				}
			catch (Exception e)
				{
					System.out.println("Please enter Numbers only ");
				}
			// Check if the user want to continue adding more numbers 
			System.out.print("Please enter y if you want to add more numbers");
		
			if(sc.next().equalsIgnoreCase("y"))
				{
					moreNums= true;
				}
			else
				{
					moreNums= false;
				}
		}	
		
			// Loop to sum the odd number , note odd number is the number which when divided by 2, leave a remainder of 1
		for (iteration=0 ; iteration < numbers.size() ; iteration++ )
			{
				if (numbers.get(iteration)%2!=0) 
					{
						sum+= numbers.get(iteration);
					}
			}
		System.out.println("The sum of your odd numbers equal to :  " + sum);
	}
}
