package com.locnv2005110007.Tuan3;

public class Exercise {
    double price ; // giá bán 
    String publishingCompany ; // nhà xuất bản 
    int publishingYear ; // năm xuất bản 
    double suggestedPrice ; // giá đề xuất
    int quantity ; // số lượng
    int type ; // loại 
    Exercise(){

    }
    Exercise(double s ,String company , int year , double pr , int q , int t){
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
    //// NHÂN VIÊN 
    String tenNv ;
    double luong ;
    String diaChi ;
    String boPhan ;
    String ngaySinh ;
    Exercise(String t , double l , String d , String b ,String n){
          tenNv = t;
          luong = l ;
          diaChi = d ;
          boPhan = b ;
          ngaySinh = n ;
    }
    void thongTinNhanVien(){
        System.out.println("Tên Nhân Viên : "+tenNv);
        System.out.println("Lương tháng : "+luong);
        System.out.println("Địa Chỉ : "+diaChi);
        System.out.println("Bộ Phận Làm Việc : "+boPhan);
        System.out.println("Ngày Sinh :"+ngaySinh);
    }
    //XE
     String hangSX ;
     String dong ;
     String giayPhep ;
     int dungTich ;
    Exercise(String t , String h , String d , String g , int dt ){
        tenNv = t ;
        hangSX = h ;
        dong = d ;
        giayPhep = g ;
        dungTich = dt ;
    }
    void thongTinXe(){
        System.out.println("Tên chủ xe : "+tenNv);
        System.out.println("Hãng sản xuất : "+hangSX);
        System.out.println("Dòng xe : "+dong);
        System.out.println("Giấy Phép : "+giayPhep);
        System.out.println("Dung Tích : "+dungTich);
    }
    //Máy Tính 
    String heDieuHanh ;
    String ram ;
    String CPU ;
    int namBH ;
    Exercise(String Company , int Year , String HDH , String r , String c , double gia , int n ){
       publishingCompany = Company ;
       publishingYear = Year ;
       heDieuHanh = HDH;
       ram = r ;
       CPU = c ;
       namBH = n ;
    }
    void thongTinMayTinh(){
        System.out.println("Nhà sản xuất : "+publishingCompany);
        System.out.println("Năm Sản Xuất : "+publishingYear);
        System.out.println("Hệ Điều Hành : "+heDieuHanh);
        System.out.println("Ram : "+ram);
        System.out.println("CPU : "+CPU);
        System.out.println("Năm Bảo Hành : "+namBH);
    }
    int soTk ;
    double soDuTK ;
    Exercise(String ten , int stk , double sdtk){
        tenNv = ten ;
        soTk = stk  ;
        soDuTK = sdtk ;
    }
    void thongTinNganHang(){
        System.out.println("Tên chủ tài khoản : "+tenNv);
        System.out.println("Số tài khoản : "+soTk);
        System.out.println("Số dư tài khoản : "+soDuTK);
    }
}
