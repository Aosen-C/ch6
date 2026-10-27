import java.util.Scanner;

public class Doubloon {
	public static int countLetters(String str, int n) {
		int count = 0;
		char character = str.charAt(n);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == character) {
				count += 1;
			}
		}
		return count;
	}
	public static boolean isDoubloon(String str) {
		if (str.length() <= 1) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (countLetters(str, i) != 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String str = in.nextLine();
		
		System.out.println(isDoubloon(str));
	}
}
