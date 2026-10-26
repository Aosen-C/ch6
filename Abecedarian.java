import java.util.Scanner;
public class Abecedarian {
	public static boolean isAbecedarian(String str) {
		for (int i = 1; i < str.length(); i++) {
			if ((int) str.charAt(i) < (int) str.charAt(i-1)) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String str = in.nextLine();
		
		System.out.println(isAbecedarian(str));
	}
}
