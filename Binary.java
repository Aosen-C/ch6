import java.util.Scanner;

public class Binary {
	public static String convertToBinary(int num) {
		int remainder;
		String binary = "";
		while (num > 0) {
			remainder = num % 2;
			binary = remainder + binary;
			num = num / 2;
		}
		return binary;
	}
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	int num = in.nextInt();
	in.nextLine();
	
	System.out.println("This is the number as binary: " + convertToBinary(num));
	}
}
