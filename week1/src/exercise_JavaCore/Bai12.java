package exercise_JavaCore;
import java.util.Scanner;
public class Bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= number; j++) {
				if(i >= j) System.out.print(j);
			}
			System.out.println();
		}
	}
}
