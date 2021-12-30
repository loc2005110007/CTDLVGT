package ThiCuoiHocKi;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class DoDaDung {
    int id  ;
    String name  ;
    float price ;
    Date date ;
    int inventory ;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); 

    DoDaDung next ;

    DoDaDung(){}

    DoDaDung(int _id , String _name , float _price ,int _inventory , Date _date){
        id = _id ;
        name = _name ;
        price = _price ;
        inventory = _inventory ;
        date = _date;
    }

    DoDaDung(int _id , String _name , float _price , int _inventory, String ngay){
        id = _id ;
        name = _name ;
        price = _price ;
        inventory=_inventory ;
        try {
            date = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date a = date;
    }

    public void inThongTin(){
        System.out.println("===");
        System.out.println("Hang Hoa: DoDaDung"+". Ten San Pham : "+name+". ID : "+id+". Gia : "+price+". Hang Ton Kho: "+inventory+". Ngay Nhap : "+date);
    }

    public void nhapThongTin(Scanner input){
        input.nextLine();
        System.out.print("Hay nhap ten san pham : ");
        name = input.nextLine();
        System.out.print("hay nhap gia san pham : ");
        price = input.nextFloat();
        System.out.println("Hay nhap so luong vao kho");
        inventory = input.nextInt();
        date = new Date();
        
    }

    public String GetName() {
		System.out.println(name);
		return name;
	}

    
}

