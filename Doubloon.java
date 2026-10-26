import java.util.Scanner;
public class Doubloon {
	public static boolean isDoubloon(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i), i+1) == -1 && str.indexOf(str.charAt(i)) == i) {
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
