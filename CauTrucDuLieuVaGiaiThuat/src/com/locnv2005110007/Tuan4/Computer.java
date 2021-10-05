package com.locnv2005110007.Tuan4;

public class Computer {
    String publishCompany ;
    String publishYear ;
    String operatingSystem ; //HDH
    String ram ;
    String cpu ;
    double price ;
    int warranty ; // bảo hành 

    Computer(){}

    Computer(String Company , String Year , String System , String r , String c , double p ,int  w){
        publishCompany = Company ;
        publishYear = Year ;
        operatingSystem = System ;
        ram = r ;
        cpu = c ;
        price = p ;
        warranty = w ;
    }

    void inThongTin(){

        System.out.println("Publish Company : "+publishCompany);
        System.out.println("Publish Year : "+publishYear);
        System.out.println("Operating System : "+operatingSystem);
        System.out.println("Ram : "+ram);
        System.out.println("CPU : "+cpu);
        System.out.println("Price : "+price);
        System.out.println("Warranty Year : "+warranty);

    }
}
