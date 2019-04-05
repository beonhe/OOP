package QUANLYNHANVIEN;
import java.util.*;
class DATE{
	int ngay;
	int thang;
	int nam;
	public DATE() {
	}
	public void Input() {
		Scanner nhap= new Scanner(System.in);
		System.out.println("Nhap ngay: ");
		ngay=nhap.nextInt();
		System.out.println("Nhap thang: ");
		thang=nhap.nextInt();
		System.out.println("Nhap nam: ");
		nam=nhap.nextInt();
	}
	public void Output() {
		System.out.println(ngay+"-"+thang+"-"+nam);
	}
}
class NGUOI {
	String ten;
	DATE namsinh = new DATE();
	public NGUOI() {
		
	}
	public NGUOI(String t, DATE n){
		ten=t;
		namsinh=n;
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		ten=nhap.nextLine();
		namsinh.Input();
	}
	public void Output() {
		System.out.println("Ten: "+ten);
		namsinh.Output();
	}
}
