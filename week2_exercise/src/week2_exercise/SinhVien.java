package week2_exercise;

import java.util.Scanner;

public class SinhVien {
	private int maSV;
	private String tenSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	public String xepLoai = "Chua xếp loại";

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public String getXepLoai() {
		return xepLoai;
	}
	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}
	public SinhVien() {
		
	}
	public SinhVien(int maSV, String tenSV, float diemToan, float diemLy, float diemHoa) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemTB = diemTB;
	}
	public void diemTrungBinh() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}
	public void xepLoai() {
		if(this.diemTB <= 10 && this.diemTB >= 9) {
			this.xepLoai = "Xuất sắc";
		} else if(this.diemTB < 9 && this.diemTB >= 8) {
			this.xepLoai = "Giỏi";
		} else if(this.diemTB < 8 && this.diemTB >= 6.5) {
			this.xepLoai = "Khá";
		} else if(this.diemTB < 6.5 && this.diemTB >= 5) {
			this.xepLoai = "Trung bình";
		} else {
			this.xepLoai = "Yếu";
		}
	}
	public void nhapSV() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào mã sinh viên: ");
		this.maSV = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào tên sinh viên: ");
		this.tenSV = sc.nextLine();
		System.out.print("Nhập vào điểm toán: ");
		this.diemToan = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào điểm lý: ");
		this.diemLy = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào điểm hóa: ");
		this.diemHoa = Integer.parseInt(sc.nextLine());
	}
	public void xuatSV(int stt) {
		System.out.print(stt + "   |");
		System.out.print(this.maSV + "            |");
		System.out.print(this.tenSV + "          |");
		System.out.print(this.diemToan + "       |");
		System.out.print(this.diemLy + "     |");
		System.out.print(this.diemHoa + "      |");
		System.out.print(this.diemTB + "             |");
		System.out.println(this.xepLoai + "  |");
	}
}
