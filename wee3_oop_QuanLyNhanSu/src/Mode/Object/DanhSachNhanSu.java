package Mode.Object;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanSu {
	private ArrayList<NhanSu> listNhanSu;

	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

	public DanhSachNhanSu() {
		this.listNhanSu = new ArrayList<NhanSu>();
	}

	public void inMenu() {
		System.out.println("1. Thêm nhân viên thường");
		System.out.println("2. Thêm trưởng phòng");
		System.out.println("3. Thêm giám đốc");
		System.out.println("0. Thoát");
	}
	
	public void themNhanSu(Scanner scan) {
		boolean flag = true;
		NhanSu nhanSu = null;
		do {
			inMenu();
			System.out.print("Nhập lựa chọn của bạn: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				nhanSu = new NhanVien();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.them(nhanSu);
				break;
			case 2:
				nhanSu = new TruongPhong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.them(nhanSu);
				break;
			case 3:
				nhanSu = new GiamDoc();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.them(nhanSu);
				break;
			}
		} while (flag);
	}
	public ArrayList<TruongPhong> listTruongPhong() {
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : this.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong)ns);
			}
		}
		return list;
	}
	
	public void xuat() {
		for(NhanSu ns: this.listNhanSu) {
			ns.xuat();
		}
	}
	public void tinhLuong() {
		for(NhanSu ns: this.listNhanSu) {
			ns.tinhLuong();
		}
	}
	public void them(NhanSu ns) {
		this.listNhanSu.add(ns);
	}
}

