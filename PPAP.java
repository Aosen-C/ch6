import java.util.Scanner;

public class PPAP {
	public static String ppap(String str) {
		int indexOfComma = str.indexOf(',');
		String object1 = str.substring(9, indexOfComma);
		
		int startOfSecond = indexOfComma + 11;
		String object2 = str.substring(startOfSecond);
		
		String finalString = String.format("Uh! %s %s", object2, object1);
		return finalString;
	}
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the line: ");
	String str = in.nextLine();
	
	System.out.println(ppap(str));
	}
}
