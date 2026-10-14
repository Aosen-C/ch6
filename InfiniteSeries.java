import java.util.Scanner;

public class InfiniteSeries {
	public static double gauss(int n, double x) {
		double sum = 1;
		double d0 = 1;
		double n0 = 1;
		
		if (n != 0) {
			for (int i = 1; i <=n; i += 1) {
				double add = (-1.0 * x * x * n0) / (d0 * i);
				sum = sum + add;
				d0 = d0 * i;
				n0 = -1.0 * x * x * n0;
			}
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Choose the number of terms in the series: ");
		int n = in.nextInt();
		in.nextLine();
		
		System.out.print("Choose the x term: ");
		double x = in.nextInt();
		in.nextLine();
		
		System.out.printf("The sum of the series is: %f\n", gauss(n, x));
		}
	}
