package buoi4;
import java.util.*;
import java.io.*;
class DSHANGHOA {
    ArrayList <HANGDM> dsdm = new ArrayList<HANGDM>();
    ArrayList <HANGTP> dstp = new ArrayList<HANGTP>();
    int Menu(){
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Chon:\n1.Nhap 1 loai hang dien may.\n2.Nhap 1 loai hang thuc pham.\n3.Xuat hang dien may.\n4.Xuat hang thuc pham.\nKET THUC NHAP SO BAT KY.");
        n = nhap.nextInt();
        return n;
    }
    public DSHANGHOA(){
        while(true){
            switch(Menu()){
                case 1:
                    HANGDM dm= new HANGDM();
                    dm.Input();
                    dsdm.add(dm);
                    break;
                case 2:
                    HANGTP tp= new HANGTP();
                    tp.Input();
                    dstp.add(tp);
                    break;
                case 3:
                    System.out.println("DANH SACH HANG DIEN MAY:");
                    for(HANGDM hdm: dsdm )
                    {
                        hdm.Output();
                    }
                    break;
                case 4:
                    System.out.println("DANH SACH HANG THUC PHAM: ");
                    for(HANGTP htp: dstp)
                        htp.Output();
                    break;
                default:
                    System.out.println("KET THUC!");
                    System.exit(0);
            }
        }
    }
}
