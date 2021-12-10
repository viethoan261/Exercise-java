package exercise_JavaCore;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		ArrayList<Integer> array  = new ArrayList<Integer>();
		while(number > 0) {
			array.add(number % 2);
			number = number/2;
		}
		System.out.println("Convert dec to binary: ");
		for(int i = array.size() - 1; i >= 0; i--) {
			System.out.print(array.get(i));
		}
	}
}
