package exercise_JavaCore;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		while(number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println(sum);
	}
}
