package QUANLYNHANVIEN;
import java.util.*;
class NHANVIEN extends NGUOI {
	long luong;
	DATE nnv = new DATE();
	PHONGBANKHOA pbk = new PHONGBANKHOA();
	public NHANVIEN() {
		
	}
	public NHANVIEN(String t, DATE ns, long l, DATE n, PHONGBANKHOA p) {
		super(t,ns);
		luong = l;
		nnv=n;
		pbk=p;
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		super.Input();
		System.out.println("Nhap luong co ban: ");
		luong=nhap.nextLong();
		nnv.Input();
		pbk.Input();
	}
	public void Output() {
		super.Output();
		nnv.Output();
		pbk.Output();
	}
}
