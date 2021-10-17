package com.locnv2005110007.Tuan5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Bai2 {
    ArrayList<String> list = new ArrayList<>();
    // tạo menu

public void menu(){

    System.out.println(">>>>>>Menu<<<<<<");
    System.out.println("1>> Nhập danh sách.");
    System.out.println("2>> Hiển thị danh sách.");
    System.out.println("3>> Sắp Xếp danh sách.");
    System.out.println("4>> Sắp xếp danh sách ngẫu nhiên.");
    System.out.println("5>> Tìm kiếm và xóa họ và tên.");
    System.out.println("0. Thoát chương trình");
    
}
public void nhap(){
    Scanner input = new Scanner(System.in);
    do{
        System.out.print("Nhập họ và tên : ");
        String name = input.nextLine();
        if(name.isEmpty()){// name rỗng thì sẽ thoát khỏi vòng lặp
            break ;
        }
        list.add(name);
    }while(true);
}
public void xuat(){
    System.out.println("Danh sách họ và tên : ");
    for (String string : list) {
       System.out.println("Họ và tên : "+string);
    }
}
public void xuatNgauNhien(){
    System.out.println("-----------------");
    System.out.println(">>>>>Danh Sách Xuất Ngẫu Nghiên<<<<<");
    Collections.shuffle(list);
    xuat();
}
public void sapXep(){
    System.out.println("-----------------");
    System.out.println(">>>>>Danh Sách Săp Xếp<<<<<");
    Collections.sort(list);
    Collections.reverse(list);
    xuat();
}
public void timVaXoa(){
    Scanner input = new Scanner(System.in);
    System.out.println("Nhập họ tên cần tìm để xóa ");
    String name = input.nextLine();

    for (String string : list) {
        if(string.equals(name)){ // tìm tên
            list.remove(string); // xóa
            break ;
        }
    }

}
    
}
