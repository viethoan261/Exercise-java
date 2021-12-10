package exercise_JavaCore;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr.add(x);
		}
		int[] tmp = new int[100];
		for(int i = 0; i < arr.size(); i++) {
			tmp[arr.get(i)] ++;
		}
		for(int i = 0; i < 100; i++) {
			if(tmp[i] > 0) {
				System.out.print(i + " ");
			}
		}
	}
}
