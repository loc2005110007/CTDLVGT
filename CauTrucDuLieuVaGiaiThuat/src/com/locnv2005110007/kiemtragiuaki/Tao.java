package com.locnv2005110007.kiemtragiuaki;

public class Tao {
    String ma;
    double khoiLuong;
    String mauSac;

    Tao(){}

    
    Tao(String maTao,double khoiLuongTao,String mauSacTao){
        ma = maTao;
        khoiLuong = khoiLuongTao;
        mauSac = mauSacTao;
    }

    void inDanhSachTao(){
        System.out.println("Mã Táo: "+ma);
        System.out.println("khối lượng táo: "+khoiLuong);
        System.out.println("Màu sắc: "+mauSac);
    }
}

