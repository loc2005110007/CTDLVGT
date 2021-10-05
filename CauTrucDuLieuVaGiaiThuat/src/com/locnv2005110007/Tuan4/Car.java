package com.locnv2005110007.Tuan4;

public class Car {
    String name ;
    String manufacturer ; // hãng sản xuất
    String line ;
    String license ;
    int capacity ;

    Car(){}

    Car(String n , String m , String lin , String l , int c){
        name = n ;
        manufacturer = m ;
        line = lin ;
        capacity = c ;
    }

    void inThongTin(){
        System.out.println("Full Name : "+name);
        System.out.println("Manufacturer : "+manufacturer);
        System.out.println("Line of cars : "+line);
        System.out.println("License : "+license);// giấy phép
        System.out.println("Capacity : "+capacity);// dung tích
    }
}
