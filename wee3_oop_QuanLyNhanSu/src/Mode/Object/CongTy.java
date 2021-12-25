package Mode.Object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CongTy {
	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private DanhSachNhanSu objListNhanSu;

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	public DanhSachNhanSu getObjListNhanSu() {
		return objListNhanSu;
	}

	public void setObjListNhanSu(DanhSachNhanSu objListNhanSu) {
		this.objListNhanSu = objListNhanSu;
	}

	public CongTy() {
		this.objListNhanSu = new DanhSachNhanSu();
	}

	public void nhap(Scanner scan) {
		System.out.println(
				"-------------------------------- Nhập thông tin công ty -------------------------------");
		System.out.print("Nhập tên công ty: ");
		this.tenCongTy = scan.nextLine();
		System.out.print("Mã số thuế:  ");
		this.maSoThue = scan.nextLine();
		System.out.print("Doanh thu: ");
		this.doanhThuThang = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println(
				"--------------------------- Thông tin công ty ---------------------------");
		System.out.println("Tên công ty: " + this.tenCongTy + "\tMã số thuế: " + this.maSoThue + "\tDoanh thu tháng: "
				+ this.doanhThuThang);
		this.objListNhanSu.xuat();
	}

	public void tinhLuong() {
		this.objListNhanSu.tinhLuong();
	}

	public void dummyDataCongTy() {
		this.tenCongTy = "Trách nhiệm hữu hạn một thành viên ABC";
		this.maSoThue = "12345678";
		this.doanhThuThang = 100000f;
	}

	public void dummyDataNhanSu() {
		NhanSu ns = new NhanSu();
		ns = new NhanVien("1", "A", "3453454", 20);
		objListNhanSu.them(ns);
		ns = new NhanVien("2", "B", "234234234", 23);
		objListNhanSu.them(ns);
		ns = new NhanVien("3", "C", "1231232", 31);
		objListNhanSu.them(ns);
		ns = new NhanVien("4", "D", "02398372", 25);
		objListNhanSu.them(ns);
		ns = new NhanVien("5", "E", "111332", 23);
		objListNhanSu.them(ns);
		ns = new NhanVien("6", "F", "987654", 31);
		objListNhanSu.them(ns);
		ns = new TruongPhong("8", "TP G", "02398372", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong("9", "TP H", "023298372", 21);
		objListNhanSu.them(ns);
		ns = new TruongPhong("10", "TP K", "023928372", 23);
		objListNhanSu.them(ns);

		ns = new GiamDoc("11", "GD Tien", "023938372", 19, 80);
		objListNhanSu.them(ns);
		ns = new GiamDoc("12", "GD Hue", "023938372", 21, 20);
		objListNhanSu.them(ns);
		ns = new TruongPhong("13", "Trưởng phòng bổ sung 1", "023982372", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong("14", "Trưởng phòng bổ sung 2", "0232983424372", 21);
		objListNhanSu.them(ns);
	}
	
	public void chonCachPhanBo() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Chon 1: Phân bổ cho lần lượt từng nhân viên");
			System.out.println("Chon 2: Phân bổ nhân viên theo mã số");
			System.out.println("Chon 0: Thoát");
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				phanBoNhanVienThuong();
				break;
			case 2:
				phanBoNhanVienThuongTheoMaSo();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhập không hợp lệ");
				break;
			}

		} while (flag);
	}

	public void phanBoNhanVienThuong() {
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVien) {
				System.out.println("Phân bổ nhân viên: ");
				ns.xuatMaVaTen();
				phanBoChoMotNhanSu(scan, ns);
			}
		}
	}

	public void phanBoNhanVienThuongTheoMaSo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập mã số nhân viên cần phân bổ: ");
		String maSo = scan.nextLine();

		NhanSu nhanSuTimDuoc = timNhanSuTheoMa(maSo);

		if (nhanSuTimDuoc != null) {
			if (nhanSuTimDuoc instanceof TruongPhong || nhanSuTimDuoc instanceof GiamDoc)
				System.out.println("Nhân viên phân bổ không hợp lệ");
			else
				phanBoChoMotNhanSu(scan, nhanSuTimDuoc);
		} else {
			System.out.println("Không có nhân viên này!");
		}
	}

	private void phanBoChoMotNhanSu(Scanner scan, NhanSu ns) {
		showMaVaTenTPhong();
		boolean flag = true;
		do {
			System.out.println("Chọn 1 để phân bổ, chọn 2 để tiếp tục.");
			int chon = Integer.parseInt(scan.nextLine());
			if (chon == 1 || chon == 2) {
				if (chon == 1) { 
					TruongPhong tp = chonTruongPhong(scan);
					((NhanVien) ns).setTruongPhong(tp);
					tp.tangNhanVien();
				}
				flag = false; 
			} else {
				System.out.println("Lựa chọn không hợp lệ");
				flag = true;
			}
		} while (flag);
	}
	private TruongPhong chonTruongPhong(Scanner scan) {
		TruongPhong tp = null;
		do {
			System.out.println("Chọn mã trưởng phòng");
			String chonMa = scan.nextLine();
			tp = timTruongPhongTheoMa(chonMa);
		} while (tp == null);
		return tp;
	}

	private void showMaVaTenTPhong() {
		System.out.println("----------Danh sách trưởng phòng----------");
		ArrayList<TruongPhong> list = layDSTruongPhong();
		for (TruongPhong tp : list) {
			tp.xuatMaVaTen();
		}
	}

	public void lietKeDSTruongPhong() {
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				ns.xuatMaVaTen(); 
			}
		}
	}

	public TruongPhong timTruongPhongTheoMa(String ma) {
		TruongPhong tphong = null; 
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaSo().compareTo(ma) == 0) {
					tphong = (TruongPhong) ns;
				}
			}
		}
		return tphong;
	}

	public ArrayList<TruongPhong> layDSTruongPhong() { 
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong) ns);
			}
		}
		return list;
	}

	public void doThemHoacXoa() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Chon 1: Xóa nhân sự");
			System.out.println("Chon 2: Thêm nhân sự");
			System.out.println("Chon 0: Thoát");
			int choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				xoaNhanSu(scan);
				break;
			case 2:
				themNhanSu(scan);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ");
				break;
			}

		} while (flag);
	}

	public void themNhanSu(Scanner scan) {
		System.out.println("--------- Thêm nhân sự ---------------");
		this.objListNhanSu.themNhanSu(scan);
	}

	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false;
		System.out.println("--------- Xóa nhân sự ---------------");
		System.out.println("Nhập mã nhân sự cần xóa");
		String maXoa = scan.nextLine();
		NhanSu nhanSu = timNhanSuTheoMa(maXoa);
		if (nhanSu != null) {
			if (nhanSu instanceof TruongPhong) {
				deleted = xoaTruongPhong((TruongPhong) nhanSu);
			}
			else if (nhanSu instanceof NhanVien) {
				deleted = xoaNhanVienThuong((NhanVien) nhanSu);
			}
			else {
				this.objListNhanSu.getListNhanSu().remove((GiamDoc) nhanSu);
			}
		} else {
			System.out.println("Mã nhân sự không tồn tại");
		}
		return deleted;
	}

	public NhanSu timNhanSuTheoMa(String ma) {
		NhanSu nhanSu = null; 
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns.getMaSo().equalsIgnoreCase(ma)) {
				nhanSu = ns;
				break;
			}
		}
		return nhanSu;
	}

	public boolean xoaTruongPhong(TruongPhong tp) {
		boolean deleted = false; 
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVien) {
				TruongPhong tPhongNVThuong = ((NhanVien) ns).getTruongPhong();
				if (tPhongNVThuong != null) {
					if (tp.getMaSo().equalsIgnoreCase(tPhongNVThuong.getMaSo())) {
						((NhanVien) ns).setTruongPhong(null);
					}
				}
			}
		}
		this.objListNhanSu.getListNhanSu().remove(tp);
		deleted = true; 
		return deleted;
	}


	public boolean xoaNhanVienThuong(NhanVien nvt) {
		boolean deleted = false;
		TruongPhong tp = nvt.getTruongPhong();
		if (tp != null) {
			tp.giamNhanVien();
		}
		this.objListNhanSu.getListNhanSu().remove(nvt);
		deleted = true;
		return deleted;
	}

	public float xuatTongLuongToanCongTy() {
		this.objListNhanSu.tinhLuong();
		float sum = 0;
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			sum += ns.getLuong();
		}
		return sum;
	}

	public ArrayList<NhanVien> listDSNVTLuongCaoNhat() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		
		NhanVien nvt = null; 
		int indexMax = 0;
		int viTri = 0;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			indexMax++;
			if (ns instanceof NhanVien) {
				nvt = (NhanVien) ns;
				break;
			}
		}
		
		if (nvt != null) {
			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVien) {
					if (current.getLuong() > nvt.getLuong()) {
						nvt = (NhanVien) current;
						viTri = indexMax;
					}
				}
				indexMax++;
			}
			for (int i = viTri - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVien) {
					if (current.getLuong() == nvt.getLuong()) {
						list.add((NhanVien) current);
					}
				}
			}
		}

		return list;
	}

	public void lietKeDanhSachNVTCoLuongCaoNhat() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		list = listDSNVTLuongCaoNhat();
		if (list.size() == 0) {
			System.out.println("----- Công ty không có nhân viên thường ------- ");
		} else {
			for (NhanVien nvt : list)
				nvt.xuat();
		}
	}

	public ArrayList<TruongPhong> listTruongPhongCoNhieuNVDuoiQuyen() {
		ArrayList<TruongPhong> listTP = layDSTruongPhong();
		if (listTP.size() != 0) {
			TruongPhong tp = listTP.get(0);
			int indexFirst = 0;
			int index = 0;
			for (TruongPhong tpFirst : listTP) {
				index++;
				if (tpFirst.getSoNhanVienDuoiQuyen() > tp.getSoNhanVienDuoiQuyen()) {
					tp = tpFirst;
					indexFirst = index - 1;
				}
			}
			ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
			for (int i = indexFirst; i < listTP.size(); i++) {
				if (listTP.get(i).getSoNhanVienDuoiQuyen() == listTP.get(indexFirst).getSoNhanVienDuoiQuyen())
					list.add(listTP.get(i));
			}

			return list;
		} else
			return null;
	}

	public void lietKeTruongPhongCoNhieuNVDuoiQuyen() {
		ArrayList<TruongPhong> listTPNhieuNhanVien = new ArrayList<TruongPhong>();
		listTPNhieuNhanVien = listTruongPhongCoNhieuNVDuoiQuyen();

		if (listTPNhieuNhanVien == null)
			System.out.println(
					"---------- Các trưởng phòng không có nhân viên dưới quyền hoặc chưa có trưởng phòng nào trong công ty ---------");
		else {
			System.out.println(
					"---------- Các trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất ------------");
			for (TruongPhong tp : listTPNhieuNhanVien) {
				tp.xuatMaVaTen();
			}
		}
	}

	private void interchangeSort(ArrayList<NhanSu> _list) {
		int i;
		int j;
		for (i = 0; i < _list.size() - 1; i++) {
			for (j = i + 1; j < _list.size(); j++) {
				NhanSu personI = _list.get(i);
				NhanSu personJ = _list.get(j);
				if (personJ.getHoTen().compareToIgnoreCase(personI.getHoTen()) < 0) {
					Collections.swap(_list, i, j);
				}
			}
		}
	}

	public void sortName() {
		interchangeSort(this.objListNhanSu.getListNhanSu());
	}


	private void interChangeSortSalary(ArrayList<NhanSu> listSalary) {
		int i;
		int j;
		for (i = 0; i < listSalary.size(); i++) {
			for (j = i + 1; j < listSalary.size(); j++) {
				NhanSu personI = listSalary.get(i);
				NhanSu personJ = listSalary.get(j);
				if (personI.getLuong() < personJ.getLuong()) {
					Collections.swap(listSalary, i, j);
				}
			}
		}
	}

	public void sortSalary() {
		interChangeSortSalary(this.objListNhanSu.getListNhanSu());
	}

	public ArrayList<GiamDoc> layDSGiamDoc() {
		ArrayList<GiamDoc> list = new ArrayList<GiamDoc>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof GiamDoc) {
				list.add((GiamDoc) ns);
			}
		}
		return list;
	}



	public ArrayList<GiamDoc> listGiamDocCoNhieuCoPhieuNhat() {
		ArrayList<GiamDoc> listGD = layDSGiamDoc();
		if (listGD.size() != 0) {
			GiamDoc gd = listGD.get(0);
			int indexFirst = 0;
			int index = 0;

			for (GiamDoc gdFirst : listGD) {
				index++;
				if (gdFirst.getCoPhan() > gd.getCoPhan()) {
					gd = gdFirst;
					indexFirst = index - 1;
				}
			}

			
			ArrayList<GiamDoc> list = new ArrayList<GiamDoc>();
			for (int i = indexFirst; i < listGD.size(); i++) {
				if (listGD.get(i).getCoPhan() == listGD.get(indexFirst).getCoPhan())
					list.add(listGD.get(i));
			}
			return list;
		}
		else return null;
	}

	public void lietKeGiamDocNhieuCoPhan() {
		ArrayList<GiamDoc> listGDNhieuCoPhan = new ArrayList<GiamDoc>();
		listGDNhieuCoPhan = listGiamDocCoNhieuCoPhieuNhat();

		if (listGDNhieuCoPhan == null)
			System.out.println("Công ty chưa có giám đốc!");
		else {
			System.out.println(
					"-------- Giám đốc có cổng phần nhiều nhất ----------");
			for (GiamDoc gd : listGDNhieuCoPhan) {
				gd.xuatMaVaTen();
			}
		}
	}


	public float tinhLoiNhuanCongTy() {
		float loiNhuan;
		loiNhuan = this.doanhThuThang - xuatTongLuongToanCongTy();
		return loiNhuan;
	}

	public float tinhThuNhapGiamDoc(GiamDoc gd) {
		float thuNhap;
		thuNhap = gd.getLuong() + (float) (gd.getCoPhan() / 100) * tinhLoiNhuanCongTy();
		return thuNhap;
	}

	public void xuatThuNhapGiamDoc() {
		ArrayList<GiamDoc> listGD = layDSGiamDoc();
		if(listGD.size() == 0) System.out.println("Chưa có vị trí giám đốc");
		else {for (GiamDoc gd : listGD) {
			float thuNhap = tinhThuNhapGiamDoc(gd);
			System.out.print("Mã số: " + gd.getMaSo() + "\tTên: " + gd.getHoTen());
			System.out.println("\tCó thu nhập là: " + thuNhap);
		} }
	}
}
