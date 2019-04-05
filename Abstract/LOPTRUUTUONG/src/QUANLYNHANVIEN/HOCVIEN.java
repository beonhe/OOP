package QUANLYNHANVIEN;
import java.util.*;
class HOCVIEN extends NGUOI {
	float d1;
	float d2;
	float d3;
	public HOCVIEN() {
		
	}
	public HOCVIEN(String t, DATE n, float a, float b, float c) {
		super(t,n);
		d1=a;
		d2=b;
		d3=c;
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		super.Input();
		System.out.println("Nhap diem 1: ");
		d1=nhap.nextFloat();
		System.out.println("Nhap diem 2: ");
		d2=nhap.nextFloat();
		System.out.println("Nhap diem 3: ");
		d3=nhap.nextFloat();
	}
	public void Output() {
		super.Output();
		System.out.println("Diem 1: "+d1+"\nDiem 2: "+d2+"\nDiem 3: "+d3);
	}
}
