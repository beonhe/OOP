package QUANLYNHANVIEN;
import java.util.*;
abstract class NHANVIENCLC extends NHANVIEN{
	String trinhdo;
	String nganh;
	String noidaotao;
	public NHANVIENCLC() {
		
	}
	public void Input() {
		Scanner nhap = new Scanner(System.in);
		super.Input();
		System.out.println("Nhap trinh do: ");
		trinhdo=nhap.nextLine();
		System.out.println("Nhap nganh: ");
		nganh=nhap.nextLine();
		System.out.println("Nhap noi dao tao: ");
		noidaotao=nhap.nextLine();
	}
	public void Output() {
		super.Output();
		System.out.println("Trinh do: "+trinhdo+"\nNganh: "+nganh+"\nNoi dao tao: "+noidaotao);
	}
	
	abstract long TinhLuong();
}
