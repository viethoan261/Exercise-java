package exercise_JavaCore;
import java.util.Scanner;
public class Bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("divisor: ");
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
