package buoi4;
import java.util.*;
class HANGDM extends HANGHOA {
    private int tgbh;
    private int dienap;
    private int congsuat;
    public HANGDM(){
    }
    public HANGDM(String m, String t, long g, int tg, int da, int cs){
        super(m,t,g);
        tgbh=tg;
        dienap=da;
        congsuat=cs;
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        super.Input();
        System.out.println("Nhap thoi gian bao hanh (so nam): ");
        tgbh=nhap.nextInt();
        System.out.println("Nhap dien ap: ");
        dienap=nhap.nextInt();
        System.out.println("Nhap cong suat: ");
        congsuat=nhap.nextInt();
    }
    public void Output(){
        super.Output();
        System.out.println("Thoi gian bao hanh: "+tgbh+" nam.");
        System.out.println("Dien ap: "+dienap);
        System.out.println("Cong suat: "+congsuat);
    }
}
