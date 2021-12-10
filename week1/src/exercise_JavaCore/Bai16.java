package exercise_JavaCore;
import java.util.Scanner;
public class Bai16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		System.out.println("Is a leap year? ");
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
