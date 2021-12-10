package exercise_JavaCore;
import java.util.Scanner;
public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2;
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		 System.out.println((double) Math.round(distance * 100) / 100);
	}
}
