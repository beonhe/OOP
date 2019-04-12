package NHANSU;
import java.util.*;
abstract class NGUOI {
	protected int ma;
	protected String ten;
	protected String ngaysinh;
	long luong;
	public NGUOI() {
		
	}
	public NGUOI(int m, String t, String ns, long l) {
		ma=m;
		ten=t;
		ngaysinh=ns;
		luong=l;
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap ma: ");
		ma=nhap.nextInt();
		System.out.println("Nhap ten: ");
		ten=nhap.nextLine();
		ten=nhap.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaysinh=nhap.nextLine();
		System.out.println("Nhap muc luong: ");
		luong=nhap.nextLong();
	}
	public void Output() {
		System.out.println("Ma: "+ma+"\nTen: "+ten);
		System.out.println("Ngay sinh: "+ngaysinh);
	}
	abstract long TinhLuong(); 
}
