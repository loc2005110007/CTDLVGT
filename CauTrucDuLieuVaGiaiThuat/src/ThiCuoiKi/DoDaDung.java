package ThiCuoiKi;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class DoDaDung {
    int id  ;
    String ten  ;
    float gia ;
    Date date ;
    int HangTonKho ;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); 

    DoDaDung next ;

    DoDaDung(){}

    DoDaDung(int _id , String _ten , float _gia ,int _HangTonKho , Date _date){
        id = _id ;
        ten = _ten ;
        gia = _gia ;
        HangTonKho = _HangTonKho ;
        date = _date;
    }

    DoDaDung(int _id , String _ten , float _gia , int _HangTonKho, String ngay){
        id = _id ;
        ten = _ten ;
        gia = _gia ;
        HangTonKho=_HangTonKho ;
        try {
            date = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date aDate = date;
    }

    public void inThongTin(){
        System.out.println("===");
        System.out.println("Hang Hoa: DoDaDung"+". Ten San Pham : "+ten+". ID : "+id+". Gia : "+gia+". Hang Ton Kho: "+HangTonKho+". Ngay Nhap : "+date);
    }

    public void nhapThongTin(Scanner input){
        input.nextLine();
        System.out.print("Hay nhap ten san pham : ");
        ten = input.nextLine();
        System.out.print("hay nhap gia san pham : ");
        gia = input.nextFloat();
        System.out.println("Hay nhap so luong vao kho");
        HangTonKho = input.nextInt();
        date = new Date();
        
    }

    public String Getten() {
		System.out.println(ten);
		return ten;
	}

    
}

