import java.util.Scanner;

public class Counter {
	public static int countA(String str) {
		int numA = 0; 
		for (int i = 0; i < str.length(); i++) {
			String character = str.substring(i, i + 1);
			if (character.equals("a")) {
				numA += 1;
			}
		}
		return numA;
	}
	
	public static boolean isolatedA(String str) {
		boolean isIsolated = true;
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'a') {
				if (str.charAt(i - 1) == 'a' || str.charAt(i + 1) == 'a') {
					isIsolated = false;
				}
			}
		}
		return isIsolated;		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your sentence: ");
		String str = in.nextLine();
		
		System.out.printf("There are %d \"a\"s\n", countA(str));
		System.out.printf("The \"a\"s are isolated: %s", isolatedA(str));
	}
}
