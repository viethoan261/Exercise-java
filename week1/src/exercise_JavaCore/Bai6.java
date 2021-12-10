package exercise_JavaCore;
import java.util.Scanner;
public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.next();
		System.out.println("Reverse: ");
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
