
package buoi3;
import java.awt.BorderLayout;
import java.util.*;
public class Buoi3 {
    public static void main(String[] args) {
        PHANSO ps = new PHANSO();
        ps.Input();
        System.out.print("Phan so vua nhap la: ");
        ps.Output();
        System.out.println("");
        System.out.println("UCLN cua tu va mau la:" +ps.UCLN());
        ps.Rutgon();
        System.out.println("Phan so sau khi rut gon: "+ps.tu+"/"+ps.mau);
        System.out.println("Nhap phan so can tinh toan: ");
        PHANSO ps2 = new PHANSO();
        ps2.Input();
        int pheptoan;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap phep toan can tinh (1:+, 2:-, 3:x, 4::)");
        pheptoan=nhap.nextInt();
        PHANSO kq = new PHANSO();
        switch(pheptoan)
        {
            case 1:
                kq = ps.Cong(ps2);
                System.out.println("Phan so sau khi cong: "+kq.tu+"/"+kq.mau);
                break;
            case 2:
                kq = ps.Tru(ps2);
                System.out.println("Phan so sau khi cong: "+kq.tu+"/"+kq.mau);
                if(kq.tu>0){
                    System.out.print("Phan so "); ps.Output();
                    System.out.print(" lon hon phan so "); ps2.Output();
                }
                else if(kq.tu<0){
                    System.out.print("Phan so "); ps.Output();
                    System.out.print(" be hon phan so "); ps2.Output();
                }
                else
                    System.out.println("2 phan so bang nhau");
                break;
            case 3:
                break;
            case 4: 
                break;
        }
        /* DSHOCSINH ds = new DSHOCSINH();
        ds.Input();
        ds.SX();
        System.out.println("Danh sach hoc sinh duoc sap xep theo dtb giam dan: ");
        ds.Output();
        HOCSINH hs1 = new HOCSINH();
        HOCSINH hs2 = new HOCSINH("123","Thuan",7.5f);  
        hs1.Input();
        hs1.Output();
        hs1.Rank();
        String nTen = "";
        System.out.println("Nhap ten can doi: ");
        Scanner nhap=new Scanner(System.in);
        nTen = nhap.nextLine();
        hs1.setTen(nTen);
        System.out.println("Ten vua thay doi : "+hs1.ten); 
        if(hs1.dtb>hs2.dtb)
            System.out.println("Hoc sinh co diem trung binh lon hon la: "+hs1.ten);
        else if(hs2.dtb>hs1.dtb)
            System.out.println("Hoc sinh co diem trung binh lon hon la: "+hs2.ten);
        else
            System.out.println("Ca hai co diem bang nhau");
       
       MANG m = new MANG();  
       m.Input();
       MANG m2 = new MANG(m);
       m2.Output();
       System.out.println("Tb so le: "+m.TbLe());
        System.out.println("Phan tu lon nhat "+m.Max());
        m.SX();
        System.out.println("Sau khi sap xep");
        m.Output();*/
    }
    
}
