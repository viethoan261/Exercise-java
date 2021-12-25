package Mode.Object;

import java.util.Scanner;

public class NhanVien extends NhanSu {
	final int LUONG_NGAY = 100;
	private TruongPhong truongPhong;
	
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	public NhanVien() {
		this.truongPhong = null; 
	}

	public NhanVien(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);	
	}

	@Override
	public void xuat() {
		super.xuat();
		if(this.truongPhong != null) {
			System.out.println("\tLuong: " + this.luong + "\tMa TP: " + this.truongPhong.getMaSo()
			+ "\tTen TP: " + this.truongPhong.getHoTen());
		} else {
			System.out.println("\tLuong: " + this.luong + "\t Chua phan bo");
		}
				
	}
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("-----------Kết thúc-----------");
	}
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY;
	}
}

