package week2_exercise;

import java.util.Scanner;

public class XuLy {
	public static void main(String[] args) {
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		chonMenu(dssv);
	}
	public static void thongBao() {
		System.out.println("Đưa ra lựa chọn của bạn: ");
		System.out.println("    1.Thêm sinh viên");
		System.out.println("    2.Xuất sinh viên");
		System.out.println("    0.Thoát");
	}
	public static void chonMenu(DanhSachSinhVien dssv) {
		Scanner sc =  new Scanner(System.in);
		int n;
		boolean thoat = false;
		do {
			thongBao();
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhapSV();
				sv.diemTrungBinh();
				sv.xepLoai();
				dssv.themSinhVien(sv);
				break;
			case 2:
				dssv.xuatTatCaSinhVien();
				break;
			case 0:
				thoat = true;
			default:
				break;
			}
		} while(!thoat);
	}
}
