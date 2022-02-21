
import java.util.ArrayList;
public class KhoSieuThiTestDrive {
    
    static ArrayList<KhoSieuThi> list = new ArrayList<>(3);
    public static void main(String[] args) {

        KhoSieuThi KhoSieuThi = new KhoSieuThi();
        KhoSieuThi KhoSieuThi2 = new KhoSieuThi();
        KhoSieuThi KhoSieuThi3 = new KhoSieuThi("Tao", 5000, 3000) ;
        list.add(new KhoSieuThi("Ga", 3000, 200));
        list.add(new KhoSieuThi("Ca", 990, 90));
        list.add(new KhoSieuThi("Muc ", 15000, 0)) ;


        KhoSieuThi.input();
        KhoSieuThi2.input();

        KhoSieuThi.outPut();
        System.out.println();
        KhoSieuThi2.outPut();
        System.out.println();
        KhoSieuThi3.outPut();
        inThongTin();
    }

    static void inThongTin(){
        for (KhoSieuThi KhoSieuThi : list) {
            KhoSieuThi.outPut();
            System.out.println();
        }
    }
}

