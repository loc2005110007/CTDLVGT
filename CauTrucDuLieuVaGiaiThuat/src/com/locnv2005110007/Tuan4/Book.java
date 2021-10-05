package com.locnv2005110007.Tuan4;

public class Book {
    double price ; // giá bán 
    String publishingCompany ; // nhà xuất bản 
    int publishingYear ; // năm xuất bản 
    double suggestedPrice ; // giá đề xuất
    int quantity ; // số lượng
    int type ; // loại 
    Book(){

    }
    Book(double s ,String company , int year , double pr , int q , int t){
        price = pr ;
        publishingCompany = company ;
        publishingYear = year;
        suggestedPrice =s ;
        quantity = q ;
        type = t ;
    }
    void inThongTin(){
        System.out.println("Suggested Price : "+suggestedPrice);
        System.out.println("Publishing Company : "+publishingCompany);
        System.out.println("Publishing Year : "+publishingYear);
        System.out.println("Price : "+price);
        System.out.println("Quatity : "+quantity);
        System.out.println("Type : "+type);
    }

}
