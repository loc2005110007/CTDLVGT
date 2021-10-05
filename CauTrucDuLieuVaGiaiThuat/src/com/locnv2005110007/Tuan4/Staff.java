package com.locnv2005110007.Tuan4;
import java.text.DecimalFormat;
public class Staff {
    DecimalFormat decimalFormat= new DecimalFormat("#.###");
    String name ;
    Double wage ; // lương
    String address ;
    String position ; // chức vụ
    String date ;

    Staff(){}

    Staff(String n , Double w , String a , String p ,String d){
        name  = n ;
        wage = w ;
        address = a;
        position = p ;
        date = d;
        
    }

    void inThongTin(){
        System.out.println("Full Name : "+name);
        System.out.println("Wage : "+decimalFormat.format(wage)+" VND");
        System.out.println("Address : "+address);
        System.out.println("Position : "+position);
        System.out.println("Date of birth : "+date);
    }
}
