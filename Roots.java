import java.util.Scanner;

public class FindRoot {
	
	public static double squareRoot(double a) {
		double x = a / 2.0;
		double difference = 1.0;
		
		while (difference >= 0.0001) {
			double x0 = x;
			x = (x + a/x) / 2.0;
			difference = Math.abs(x - x0);
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		double a = in.nextDouble();
		in.nextLine();
		
		System.out.printf("The square root is: %f\n", squareRoot(a));
		}
	}
