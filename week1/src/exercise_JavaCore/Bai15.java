package exercise_JavaCore;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scanner.next();
		System.out.println("Enter a pos: ");
		int pos = scanner.nextInt();
		System.out.println("Size of String: " + str.length());
		System.out.println("Char at index " + pos + " is: " + str.charAt(pos-1));
		System.out.println("Have 'abcdef'? : " + str.contains("abcdef"));
	}
}
