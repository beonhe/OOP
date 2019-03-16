package buoi3;
import java.util.*;
public class DSHOCSINH {
    HOCSINH ds[];
    int sl;
    public DSHOCSINH(){
        setMang(null);
        setSl(0);
    }
    public DSHOCSINH(HOCSINH hs[], int n){
        setMang(hs);
        setSl(n);
    }
    public DSHOCSINH(DSHOCSINH danhsach){
        setMang(danhsach.ds);
        setSl(danhsach.sl);
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh: ");
        sl=nhap.nextInt();
        ds=new HOCSINH[sl];
        for (int i = 0; i < sl; i++) {
            System.out.print("\nHoc sinh thu: "+(i+1));
            ds[i]= new HOCSINH();
            ds[i].Input();
        }
    }
    public void Output(){
        System.out.println("Danh sach hoc sinh: ");
        for (int i = 0; i < sl; i++) {
            System.out.print("\nHoc sinh thu: "+(i+1));
            ds[i].Output();
        }
    }
    public void SX(){
        for(int i=0; i<sl-1; i++)
            for(int j=i+1; j<sl; j++){
                if(ds[i].dtb<ds[j].dtb){
                    HOCSINH temp;
                    temp=ds[i];
                    ds[i]=ds[j];
                    ds[j]=temp;
                }
            }
    }
    public int getSl(){ return sl; }
    public void setSl(int s){ sl=s; }
    public HOCSINH[] getMang(){ return ds; }
    public void setMang(HOCSINH mang[]){ ds=mang; }
}
