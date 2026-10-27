import java.util.Scanner;

public class Scrabble {
	public static boolean canSpell(String str, String letters) {
		String check = "";
		for (int i = 0; i < str.length(); i++) {
			int index = letters.indexOf(str.charAt(i));
			if (index != -1) {
				check += letters.substring(index, index+1);
				if (index == letters.length() - 1) {
					letters = letters.substring(0, index);
				} else {
					letters = letters.substring(0, index) + letters.substring(index + 1);
				}
			}
		}
		if (check.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String letters = "abldacenmjhrg";
		
		System.out.print("Enter the word you would like to test: ");
		String str = in.nextLine();
		
		System.out.println(canSpell(str, letters));	
	}
}
