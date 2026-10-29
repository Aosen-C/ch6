import java.util.Scanner;

public class PigLatin {
	public static String changeToPigLatin(String str) {
		String chgStr = "";
		if (str.length() > 2) {
			chgStr = str.substring(1) + str.charAt(0) + "ay";
		} else {
			chgStr = str;
		}
		return chgStr;
	}
	
	public static String pigLatin(String msg) {
		int n = msg.indexOf(" ");
		String chgmsg = "";
		String word = "";
		if (msg.charAt(0) != ' ') {
			word = msg.substring(0, msg.indexOf(" "));
			chgmsg = changeToPigLatin(word) + " ";
		}

		while (n != -1) {
			if (msg.indexOf(" ", n + 1) != -1) {
				word = msg.substring(n + 1, msg.indexOf(" ", n + 1));
			} else {
				word = msg.substring(n + 1);
			}
			chgmsg = chgmsg + changeToPigLatin(word) + " ";
				
			n = msg.indexOf(" ", n+1);
		}
		return chgmsg;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the sentence: ");
		String msg = in.nextLine();
		
		System.out.println("Your sentence in pig latin is: " + pigLatin(msg));
	}
}
