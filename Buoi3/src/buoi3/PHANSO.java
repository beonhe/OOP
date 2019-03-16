
package buoi3;
import java.util.*;
public class PHANSO {
    protected int tu;
    protected int mau;
    public PHANSO(){
        setTu(0);
        setMau(0);
    }
    public PHANSO(int t, int m){
        setTu(t);
        setMau(m);
    }
    public PHANSO(PHANSO ps){
        setTu(ps.tu);
        setMau(ps.mau);
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tu= nhap.nextInt();
        do{
            System.out.println("Nhap mau so: ");
            mau=nhap.nextInt();
            if(mau==0)
                System.out.println("Phan so khong hop le, nhap lai mau so");
        }while(mau==0);
    }
    public void Output(){
        System.out.print(tu+"/"+mau);
    }
    public int UCLN(){
        int a=tu;
        int b=mau;
        while(a!=b){
            if(a>b)
                a-=b;
            else if(b>a)
                b-=a;
        }
        return a;
    }
    public void Rutgon(){
        int UC=UCLN();
        tu/=UC;
        mau=mau/UC;
    }
    public PHANSO Cong(PHANSO b){
        PHANSO kq=new PHANSO();
        kq.mau=this.mau*b.mau;
        kq.tu=this.mau*b.tu+this.tu*b.mau;
        kq.Rutgon();
        return kq;
    }
    public PHANSO Tru(PHANSO b){
        PHANSO kq=new PHANSO();
        int temp=0;
        kq.mau=this.mau*b.mau;
        kq.tu=this.tu*b.mau-this.mau*b.tu;
        if(kq.tu<0)
        {
            temp = kq.tu;
            kq.tu*=-1;
        }
        kq.Rutgon();
        kq.tu*=-1;
        return kq;
    }
    public int getTu(){ return tu; }
    public void setTu(int t){ tu=t; }
    public int getMau(){ return mau; }
    public void setMau(int m){ mau=m; }
}
