package QUANLYNHANVIEN;
import java.util.*;
class NVQUANLY extends NHANVIENCLC {
	long phucapcv;
	public NVQUANLY() {
		
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		super.Input();
		System.out.println("Nhap phu cap chuc vu: ");
		phucapcv=nhap.nextLong();
	}
	long TinhLuong() {
		return super.luong + phucapcv;
	}
	public void Output() {
		super.Output();
		System.out.println("Luong: "+TinhLuong());
	}
}
