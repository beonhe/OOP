
package buoi3;
import java.util.*;
public class HOCSINH {
    String ma;
    String ten;
    float dtb;
    public HOCSINH(){
        setMa("");
        setTen("");
        setDtb(0f);
    }
    public HOCSINH(String m, String t, float d){
        setMa(m);
        setTen(t);
        setDtb(d);
    }
    public HOCSINH(HOCSINH hs){
        ma=hs.ma;
        ten=hs.ten;
        dtb=hs.dtb;
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("\nNhap ma so:");
        ma=nhap.nextLine();
        System.out.println("Nhap ten:");
        ten=nhap.nextLine();
        System.out.println("Nhap diem trung binh:");
        dtb=nhap.nextFloat();
    }
    public void Output(){
        System.out.println("\nMa so: "+ma);
        System.out.println("Ten : "+ten);
        System.out.println("Diem trung binh: "+dtb);
    }
    public void Rank(){
        if(dtb<5)
            System.out.println("Xep loai yeu");
        else if(dtb>=5 && dtb<7)
                System.out.println("Xep loai trung binh");
        else if(dtb>=7 && dtb<8)
                System.out.println("Xep loai kha");
        else if(dtb>=8 && dtb<=10)
                System.out.println("Xep loai gioi");
    }
    public String getMa(){ return ma; }
    public void setMa(String m){ ma=m; }
    public String getTen(){ return ten; }
    public void setTen(String t){ ten=t; }
    public float getDtb(){ return dtb; }
    public void setDtb(float d){ dtb=d; }
}
