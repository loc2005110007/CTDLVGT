package com.locnv2005110007.Tuan5;
import java.util.ArrayList;
import java.util.List;

import vn.giadinh.edu.tuan04.Dog;
import vn.giadinh.edu.tuan04.SinhVien;
public class CTMinhHoaArrayList {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        a.add("Cuong");
        a.add(true);
        a.add(1);
        a.add(2.5);
        
        a.add(new Dog(16, "Đen", "Phong Xinh"));

        Dog dog = (Dog)a.get(4); //(Dog) ép kiểu . lấy phần tử thứ 5 của a
    
        System.out.println("Size : "+ dog.name+". Color : "+dog.color+". Name : "+dog.name);
        a.add(1.5);
        System.out.println(a.get(0));

        List bienTCArraylist = new ArrayList();

        bienTCArraylist.add(new SinhVien("2005"," Phong Đũy", 19, "Long an ")) ;
        SinhVien sinhVien =(SinhVien)bienTCArraylist.get(0); // lấy 1 phần tử list
        System.out.println(bienTCArraylist);

        ArrayList<SinhVien> SV = new ArrayList<>();
        SV.add(new SinhVien());

        ArrayList<String> b = new ArrayList<>();
        b.add("Phong");
        b.add("Tin");
        System.out.println(b);
        String s = b.get(1);
        System.out.println(s);
    }
}
