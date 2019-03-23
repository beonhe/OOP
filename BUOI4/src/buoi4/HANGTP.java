package buoi4;
import java.util.*;
class HANGTP extends HANGHOA {
    private int ngaysx;
    private int ngayhh;
    public HANGTP(){
    }
    public HANGTP(String m, String t, long g, int nsx, int nhh){
        super(m,t,g);
        ngaysx=nsx;
        ngayhh=nhh;
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        super.Input();
        System.out.println("Nhap ngay sx: ");
        ngaysx=nhap.nextInt();
        System.out.println("Nhap ngay hh: ");
        ngayhh=nhap.nextInt();
    }
    public void Output(){
        super.Output();
        System.out.println("Ngay san xuat: "+ngaysx);
        System.out.println("Ngay het han: "+ngayhh);
    }
}
