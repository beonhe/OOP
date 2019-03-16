package buoi3;
import java.util.*;
public class MANG {
    int n;
    int m[];
    public MANG(){
        setMang(null);
        setN(0);
    }
    public MANG(int mm[], int nn){
        m=mm;
        n=nn;
    }
    public MANG(MANG mang){
        m=mang.m;
        n=mang.n;
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang");
        n=nhap.nextInt();
        m=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap phan tu thu "+(i+1)+":");
            m[i]=nhap.nextInt();
        }
    }
    public void Output(){
        for (int i = 0; i < n; i++) {
            System.out.print("\n"+m[i]+" ");
        }
    }
    public int TbLe(){
        int t=0;
        int dem=0;
        for (int i = 0; i < n; i++) {
            if(m[i]%2!=0){
                t=t+m[i];
                dem++;
            }
        }
        return t/dem;
    }
    public int Max(){
        int max=m[0];
        for (int i = 1; i < n; i++) {
            if(m[i]>max){
                max=m[i];
            }
        }
        return max;
    }
    public void SX(){
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1;j<n;j++){
                if(m[i]>m[j]){
                    int temp = m[i];
                    m[i]=m[j];
                    m[j]=temp;
                }
            }
        }
    }
    public int getN(){ return n; }
    public void setN(int nn){ n=nn; }
    public int[] getMang(){ return m; }
    public void setMang(int mang[]){ m=mang; }
}
