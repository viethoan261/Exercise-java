package exercise_JavaCore;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
        while(num1 > 0) {
        	arr1.add(num1 % 10);
        	num1 = num1 / 10;
        }
        while(num2 > 0) {
        	arr2.add(num2 % 10);
        	num2 = num2 / 10;
        }
        int[] a = new int[10];
        int[] b = new int[10];
        for(int i = 0; i < arr1.size(); i++) {
        	a[i] = 0;
        	a[arr1.get(i)] ++;
        	b[i] = 0;
        	b[arr2.get(i)] ++;
        }
        boolean check = false;
        for(int i = 0; i < 10; i++) {
        	if(a[i] > 0 && b[i] > 0) check = true;
        }
		System.out.println(check);
	}
}
