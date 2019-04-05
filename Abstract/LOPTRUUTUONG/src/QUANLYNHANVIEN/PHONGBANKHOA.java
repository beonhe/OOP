package QUANLYNHANVIEN;
import java.util.*;
class PHONGBANKHOA {
	String ma;
	String ten;
	public PHONGBANKHOA() {
		
	}
	public PHONGBANKHOA(String a, String b) {
		ma=a;
		ten=b;
	}
	public void Input() {
		Scanner nhap= new Scanner(System.in);
		System.out.println("Nhap ma phong ban khoa: ");
		ma=nhap.nextLine();
		System.out.println("Nhap ten phong ban khoa: ");
		ten=nhap.nextLine();
	}
	public void Output() {
		System.out.println("Ma PBK: "+ma+"\nTen PBK: "+ten);
	}
}
