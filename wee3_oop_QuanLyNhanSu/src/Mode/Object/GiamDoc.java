package Mode.Object;

import java.util.Scanner;

public class GiamDoc extends NhanSu {
	final int LUONG_NGAY = 300;
	
	private float coPhan;
	
	public float getCoPhan() {
		return coPhan;
	}
	public void setCoPhan(float coPhan) {
		this.coPhan = coPhan;
	}

	public GiamDoc() {
		
	}
	public GiamDoc(String maSo, String hoTen, String soDienThoai, float soNgayLamViec, float coPhan) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.coPhan = coPhan;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập số cổ phần: ");
		this.coPhan = Float.parseFloat(scan.nextLine());
		System.out.println("------------Kết thúc------------");
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.print("\tLương: " + this.luong);
		System.out.println("\tCổ phần: " + this.coPhan);
	}
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY;
	}
	
}
