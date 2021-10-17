package com.locnv2005110007.Tuan5;
import java.util.ArrayList;
import java.util.Scanner;
public class Bai1 {
    ArrayList<Double> list = new ArrayList<>();

    public void nhap(){
        System.out.println("Nhập danh sách các số thực : ");
        Scanner input = new Scanner(System.in);
        int yes = 1 ;
        do {
            System.out.print("Nhập số : ");
            double num = input.nextDouble(); // đọc số nhập lưu vào num

            list.add(num); // ép số mới nhập vào trong list
            System.out.print("Bạn có muốn nhập tiếp (1: tiếp , 0: thoát ) : ");
            yes = input.nextInt();

        }while(yes == 1);
    }
    public void hienThi(){
        System.out.println(">>>>>>>>>>Danh Sách Nhập>>>>>>>>>>>");
        for (Double double1 : list) {
            System.out.println("   "+double1);
        }
    }
    public void tinhTong (){
        double sum = 0 ;
        for (Double double1 : list) {
            sum += double1 ;
        }
         System.out.println("Tổng : "+sum);
    }
}
