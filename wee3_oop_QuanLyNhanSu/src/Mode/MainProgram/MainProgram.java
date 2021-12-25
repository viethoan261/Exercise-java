package Mode.MainProgram;

import Mode.Object.*;
import java.util.ArrayList;
import java.util.Scanner;
public class MainProgram {
	public static void inMenu() {
		System.out.println("1. Nhập thông tin công ty");
		System.out.println("2. Phân bổ nhân viên vào trưởng phòng");
		System.out.println(
				"3.Thêm, xóa thông tin một nhân sự(có thể là nhân viên, trưởng phong hoặc giám đốc). Lưu ý khi xóa"
						+ " trưởng phòng phải ngắt liên kết với các nhân viên đang tham chiếu tới.=");
		System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty");
		System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
		System.out.println("6. Tìm nhân viên thường có lương cao nhất");
		System.out.println("7. Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
		System.out.println("8. Sắp xếp nhân viên toàn bộ công ty theo thứ tự abc");
		System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
		System.out.println("10. Tìm giám đốc có số lượng cổ phần nhiều nhất");
		System.out.println("11. Tính và xuất tổng thu nhập của từng giám đốc");
		System.out.println("0. Thoat chuong trinh!");
	}
// dummyData test
	
	 /* public static void doMenu(Scanner scan) {
		boolean flag = true;;
		CongTy cty = new CongTy();
		cty.dummyDataCongTy();
		cty.dummyDataNhanSu();
		do {
			inMenu();
			System.out.print("Nhập lựa chọn của bạn: ");
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				choice1(scan, cty);
				break;
			case 2:
				choice2(cty);
				break;
			case 3:
				choice3(cty);
				break;
			case 4:
				choice4(cty);
				break;
			case 5:
				choice5(cty);
				break;
			case 6:
				choice6(cty);
				break;
			case 7:
				choice7(cty);
				break;
			case 8:
				choice8(cty);
				break;
			case 9:
				choice9(cty);
				break;
			case 10:
				choice10(cty);
				break;
			case 11:
				choice11(cty);
				break;
			case 0:
				System.out.println("------------------------ Thoát chương trình, hẹn gặp lại --------------------------------");
				flag = false;
				break;
			default:
				System.out.println();
				System.out.println("----------- Lựa chọn không chính xác! --------------");
				System.out.println();
				break;
			}
		}  while(flag);
	}
	*/
	public static void doMenu(Scanner scan) {
		boolean flag = true;;
		CongTy cty = new CongTy();
		do {
			inMenu();
			System.out.print("Nhập lựa chọn của bạn: ");
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				choice1(scan, cty);
				break;
			case 2:
				choice2(cty);
				break;
			case 3:
				choice3(cty);
				break;
			case 4:
				choice4(cty);
				break;
			case 5:
				choice5(cty);
				break;
			case 6:
				choice6(cty);
				break;
			case 7:
				choice7(cty);
				break;
			case 8:
				choice8(cty);
				break;
			case 9:
				choice9(cty);
				break;
			case 10:
				choice10(cty);
				break;
			case 11:
				choice11(cty);
				break;
			case 0:
				System.out.println("------------------------ Thoát chương trình, hẹn gặp lại --------------------------------");
				flag = false;
				break;
			default:
				System.out.println();
				System.out.println("----------- Lựa chọn không chính xác! --------------");
				System.out.println();
				break;
			}
		}  while(flag);
	}
	private static void choice1(Scanner scan, CongTy cty) {
		cty.nhap(scan);
	}
    private static void choice2(CongTy cty) {
		cty.chonCachPhanBo();
	}
    private static void choice3(CongTy cty) {
		cty.doThemHoacXoa();
	}
    private static void choice4(CongTy cty) {
		cty.tinhLuong();
		cty.xuat();
	}
    private static void choice5(CongTy cty) {
		float sum = cty.xuatTongLuongToanCongTy();
		System.out.println("Tong luong toan cong ty: " + sum);
	}	
    private static void choice6(CongTy cty) {
		cty.tinhLuong();
		cty.lietKeDanhSachNVTCoLuongCaoNhat();
	}
    private static void choice7(CongTy cty) {
		cty.lietKeTruongPhongCoNhieuNVDuoiQuyen();
	}
    private static void choice8(CongTy cty) {
		cty.sortName();
		cty.xuat();
	}
    private static void choice9(CongTy cty) {
		cty.tinhLuong();
		cty.sortSalary();
		cty.xuat();
		}
    private static void choice10(CongTy cty) {
		cty.lietKeGiamDocNhieuCoPhan();
	}
    private static void choice11(CongTy cty) {
		cty.xuatThuNhapGiamDoc();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}
}
