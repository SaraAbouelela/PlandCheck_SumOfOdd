package Task1;

import java.util.*;

public class PlandromeCheck {

	public static void main(String[] args) {
		boolean cont = true; 
		String contChecking;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.print("Please enter string to be checked  ");
		String WordToBeChecked = sc.next();
		System.out.println(CheckPalindrome(WordToBeChecked));
		System.out.print("do you want continue checking another word , y/n  ");
		contChecking = sc.next();
		if (contChecking.equalsIgnoreCase("y"))
			cont=true;
		else 
			cont = false;
		
		}
		while (cont);

	}

	static boolean CheckPalindrome(String W) {
		int i =0 , j = W.length() / 2;
		for ( i = 0; i <= j ; i++) {
			if (W.charAt(i) == W.charAt(W.length() - 1)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
