package QUANLYNHANVIEN;

public class MAIN {
	public static void main(String[] agrs) {
		NGUOI n1 = new HOCVIEN();
		NGUOI n2 = new NHANVIEN();
		n1.Input();
		n1.Output();
		NHANVIENCLC n3 = new NVQUANLY();
		n3.Input();
		n3.Output();
	}
}
