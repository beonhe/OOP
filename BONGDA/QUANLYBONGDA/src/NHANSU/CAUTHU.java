package NHANSU;
import java.util.*;
class CAUTHU extends NGUOI {
	protected String nguyenquan;
	protected String vitri;
	public CAUTHU() {
		
	}
	public CAUTHU(int m, String t, String ns, long l, String nq, String vt) {
		super(m,t,ns,l);
		nguyenquan=nq;
		vitri=vt;
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		super.Input();
		System.out.println("Nhap nguyen quan: ");
		nguyenquan=nhap.nextLine();
		System.out.println("Nhap vi tri thi dau: ");
		vitri=nhap.nextLine();
	}
	public void Output() {
		super.Output();
		System.out.println("Nguyen quan: "+nguyenquan);
		System.out.println("Vi tri thi dau: "+vitri);
		System.out.println("Tong luong: "+TinhLuong());
	}
	long TinhLuong() {
		if(vitri.indexOf("Tien dao")==0||vitri.indexOf("tien dao")==0)
			return luong+((long) (luong*0.2));
		else
			return luong;
	}
}
