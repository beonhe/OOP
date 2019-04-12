package NHANSU;
import java.util.*;
class QUANLYNHANSU {
	ArrayList<NGUOI> dsns = new ArrayList<NGUOI>();
	ArrayList<NGUOI> dsnv = new ArrayList<NGUOI>();
	ArrayList<NGUOI> dsct = new ArrayList<NGUOI>();
	NGUOI n;
	int Menu() {
		int n;
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap:\n1.Nhap thong tin 1 cau thu.\n2.Nhap thong tin 1 nhan vien.\n3.Xuat ds cau thu.\n4.Xuat ds nhan vien.\n5.Xuat toan bo nhan su.\n6.Ket thuc");
		n=nhap.nextInt();
		return n;
	}
	public QUANLYNHANSU() {
		while(true) {
			switch(Menu()) {
			case 1:
				n = new CAUTHU();
				n.Input();
				dsns.add(n);
				dsct.add(n);
				break;
			case 2:
				n = new NHANVIEN();
				n.Input();
				dsns.add(n);
				dsnv.add(n);
				break;
			case 3:
				System.out.print("\n--------------------------------\nDANH SACH CAU THU:\n");
				for(NGUOI ds:dsct) {
					ds.Output();
				}
				break;
			case 4:
				System.out.print("\n--------------------------------\nDANH SACH NHANVIEN:\n");
				for(NGUOI ds:dsnv) {
					ds.Output();
				}
				break;
			case 5:
				System.out.print("\n--------------------------------\nDANH SACH NHAN SU:\n");
				for(NGUOI ds:dsns) {
					ds.Output();
				}
				break;
			case 6:
				System.out.println("CHUONG TRINH KET THUC!!!");
				System.exit(0);
			default:
				System.out.println("Yeu cau khong hop le, moi chon lai!!");
			}
		}
	}
}
