import java.util.Scanner;

public class Doubloon {
	public static int countLetters(String str, int n) {
		int count = 0;
		String character = str.substring(n, n+1);
		for (int i = n; i < str.length(); i++) {
			if (str.substring(i, i+1) == character) {
				count += 1;
			}
		}
		return count;
	}
	public static boolean isDoubloon(String str) {
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
