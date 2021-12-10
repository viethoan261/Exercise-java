package exercise_JavaCore;
import java.util.Scanner;
public class Bai19 {
	public static void solveDegree1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn đang giải phương trình bậc 1");
		System.out.println("Nhập a: ");
		double a = sc.nextDouble();
		System.out.println("Nhập b: ");
		double b = sc.nextDouble();
		if(a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if(b != 0 && a == 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			System.out.println("Phương trình có nghiệm duy nhất x = " + -b/a);
		}
		System.out.println();
	}
	public static void solveDegree2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn đang giải phương trình bậc 2");
		System.out.println("Nhập a: ");
		double a = sc.nextDouble();
		System.out.println("Nhập b: ");
		double b = sc.nextDouble();
		System.out.println("Nhập c: ");
		double c = sc.nextDouble();
		if(a == 0 && b == 0 && c == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		}else {
			double delta = b * b - 4 * a * c;
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if(delta == 0) {
				System.out.println("Phương trình có nghiệm duy nhất x = " + -b/(2*a));
			} else {
				System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + (-b - Math.sqrt(delta))/(2*a) +" và x2 = " + (-b + Math.sqrt(delta))/(2*a));
			}
		}
		System.out.println();
	}
	public static void display() {
		System.out.println("Bạn hãy lựa chọn dạng phương trình để giải");
		System.out.println("1.Giải phương trình bậc 1");
		System.out.println("2.Giải phương trình bậc 2");
		System.out.println("0.Thoát");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			display();
			 choice = sc.nextInt();
			switch(choice) {
			case 1:
				solveDegree1();
				break;
			case 2:
				solveDegree2();
				break;
			default:
				System.out.println("See you again.");	
		}
	} while(choice != 0);
}
}
