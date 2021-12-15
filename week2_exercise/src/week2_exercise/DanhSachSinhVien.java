package week2_exercise;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
	private List<SinhVien> danhSachSV;
	public DanhSachSinhVien() {
		this.danhSachSV = new ArrayList<SinhVien>();
	}
	public void themSinhVien(SinhVien sv) {
		this.danhSachSV.add(sv);
	}
	public void xuatTatCaSinhVien() {
		int stt = 0;
		header();
		for(SinhVien sv: this.danhSachSV) {
			stt++;
			sv.xuatSV(stt);
		}
	}
	public void header() {
		System.out.print("STT |");
		System.out.print("Ma sinh vien |");
		System.out.print("Ten sinh vien |");
		System.out.print("Diem Toan |");
		System.out.print("Diem Ly |");
		System.out.print("Diem Hoa |");
		System.out.print("Diem trung binh |");
		System.out.println("Xep loai       |");
	}
}
