package NHANSU;
import java.util.*;
class NHANVIEN extends NGUOI{
	protected String chucdanh;
	public NHANVIEN() {
		
	}
	public NHANVIEN(int m, String t, String ns, long l, String cd) {
		super(m,t,ns,l);
		chucdanh=cd;
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		super.Input();
		System.out.println("Nhap chuc danh: ");
		chucdanh=nhap.nextLine();
	}
	public void Output() {
		super.Output();
		System.out.println("Chuc danh: "+chucdanh);
		System.out.println("Tong luong: "+TinhLuong());
	}
	long TinhLuong() {
		
		if(chucdanh.indexOf("HLV")==0||chucdanh.indexOf("hlv")==0||chucdanh.indexOf("Hlv")==0||chucdanh.indexOf("Huan luyen vien")==0)
			return luong+((long) (luong*0.3));
		else
			return luong+((long) (luong*0.15));
	}
}
