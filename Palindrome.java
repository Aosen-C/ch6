import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		str = str.toLowerCase();
		
		String str2 = "";
		String compare = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (!nonLetters.contains(str.substring(i, i+1))) {
				str2 += str.charAt(i);
			}
		}

		for (int i = str2.length() - 1; i >= 0; i--) {
			compare += str2.charAt(i);
		}
		if (str2.equals(compare)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = in.nextLine();
		
		System.out.println(isPalindrome(str));
	}
}
