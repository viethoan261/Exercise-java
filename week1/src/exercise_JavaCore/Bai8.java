package exercise_JavaCore;
import java.util.Scanner;
public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		str = str.toUpperCase();
		System.out.println(str);
	}
}
