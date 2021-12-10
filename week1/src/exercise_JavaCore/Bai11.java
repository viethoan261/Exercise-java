package exercise_JavaCore;
import java.util.Scanner;
public class Bai11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		double res = (double)(Math.log(number)/Math.log(2));
		System.out.println("log2(" + number + ") is: " + (int)res);
	}
}
