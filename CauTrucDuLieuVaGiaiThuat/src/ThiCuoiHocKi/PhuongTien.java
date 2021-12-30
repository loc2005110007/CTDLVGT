package ThiCuoiHocKi;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class PhuongTien {
    int id  ;
    String ten  ;
    float gia ; 
    Date date ; 
    int HangTonKho;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); 

    PhuongTien next ;
    

    PhuongTien(){}

    PhuongTien(int _id , String _ten , float _gia , int _HangTonKho ,Date _date){
        id = _id ;
        ten = _ten ;
        gia = _gia ;
        HangTonKho = _HangTonKho ;
        date = _date;
    }
    PhuongTien(int _id , String _ten , float _gia , int _HangTonKho, String ngay){
        id = _id ;
        ten = _ten ;
        gia = _gia ;
        HangTonKho =_HangTonKho ;
        try {
            date = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date a = date;
    }
    public void inThongTin(){
        System.out.println("---");
        System.out.println("Hang Hoa : PhuongTien"+". Ten San Pham : "+ten+". ID : "+id+". Gia : "+gia+". Hang Ton Kho: "+HangTonKho+". Ngay Nhap : "+date);
    }

    public void nhapThongTin(Scanner input){
        input.nextLine();
        System.out.print("Nhap Ten San Pham : ");
        ten = input.nextLine();
        System.out.print("Nhap Gia San Pham: ");
        gia = input.nextFloat();
        System.out.println("Nhap so luong kho :");
        HangTonKho = input.nextInt();
        date = new Date();
        
    }

    public String Getten() {
		System.out.println(ten);
		return ten;
	}
}


    


    

