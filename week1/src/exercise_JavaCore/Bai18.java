package exercise_JavaCore;
import java.util.Scanner;
public class Bai18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số tiền gửi: ");
		double tienGui = Double.parseDouble(sc.next());
		System.out.print("Nhập số tiền muốn có: ");
		double tienRut = Double.parseDouble(sc.next());
		System.out.print("Nhập lãi suất: ");
		double laiSuat = Double.parseDouble(sc.next());
		double A = Math.log(tienRut/tienGui);
		double B  = Math.log(1 + laiSuat);
		int nam = (int)( A/B) + 1;
		System.out.println("Số năm tối thiểu để có số tiền trên là: " + nam +" năm");
	}
}
