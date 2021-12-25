package Mode.Object;

import java.util.Scanner;

public class NhanSu {
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;
	
	

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}



	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuong() {
		return luong;
	}

	public NhanSu() {
	
	}
	
	public NhanSu(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public void nhap(Scanner scan) {
		System.out.println("----------Thêm nhân sự---------");
		System.out.print("Nhập mã NV: ");
		this.maSo = scan.nextLine();
		System.out.print("Nhập họ tên: ");
		this.hoTen = scan.nextLine();
		System.out.print("Nhập số điện thoại: ");
		this.soDienThoai = scan.nextLine();
		System.out.print("Nhập số ngày làm việc ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		
	}
	public void xuat() {
		System.out.print("Mã NV: " + this.maSo + "\tHọ tên: "
						+ this.hoTen + "\tSố điện thoại: " +
						this.soDienThoai + "\tSố ngày làm việc: " + this.soNgayLamViec);
	}
	
	public void xuatMaVaTen() {
		System.out.println("mã: " + this.maSo + "\tTên: " + this.hoTen);
	}
	public void tinhLuong() {
		this.luong = 0;
	}
}

