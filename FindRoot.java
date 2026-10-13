import java.util.Scanner;

public class FindRoot {
	
	public static double squareRoot(double a) {
		double x = a/2.0;
		double difference = 1.0;
		
		while (difference >= 0.0001) {
			x = (x + a/x)/2.0;
			difference = a - x;
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		double a = in.nextInt();
		in.nextLine();
		
		System.out.println(squareRoot(a));
		}
	
	}
