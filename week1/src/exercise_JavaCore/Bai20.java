package exercise_JavaCore;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhập vào các phần tử của mảng: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 == 0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		System.out.print("Các số chẵn trong mảng là: ");
		for(int i = 0; i < even.size(); i++) {
			System.out.print(even.get(i) + " ");
		}
		System.out.println();
		System.out.print("Các số lẻ trong mảng là: ");
		for(int i = 0; i < odd.size(); i++) {
			System.out.print(odd.get(i) + " ");
		}
	}
}
