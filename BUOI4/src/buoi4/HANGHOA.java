package buoi4;
import java.awt.BorderLayout;
import java.util.*;
class HANGHOA {
    protected String ma;
    protected String ten;
    protected long gia;
    public HANGHOA(){    
    }
    public HANGHOA(String m, String t, long g){
        ma=m;
        ten=t;
        gia=g;
    }
    public HANGHOA(HANGHOA hh){
        this.ma=hh.ma;
        this.ten=hh.ten;
        this.gia=hh.gia;
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("\nNhap ma: ");
        ma=nhap.nextLine();
        System.out.println("Nhap ten: ");
        ten = nhap.nextLine();
        System.out.println("Nhap don gia: ");
        gia=nhap.nextLong();
    }
    public void Output(){
        System.out.println("Ma: "+ma);
        System.out.println("Ten: "+ten);
        System.out.println("Don gia: "+gia);
    }
}
