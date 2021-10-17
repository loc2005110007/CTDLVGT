package com.locnv2005110007.Tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanPhamTestDrive {

    
    static ArrayList<SanPham> listSp = new ArrayList<>();
    
    static void nhap(){
        System.out.println("Nhập danh sách sản phẩm: ");
               Scanner sc = new Scanner(System.in);
               int i = 1;
           do{
               System.out.printf("Tên sản phẩm thứ %d: ", i);
               String sp=sc.nextLine();
               
               if( sp==null || sp.equals("")){
                   break;
               }
               System.out.printf("Giá sản phẩm: ");
               double gia=sc.nextDouble();
               System.out.print("Giảm giá : ");
               double giam = sc.nextDouble();
               

               listSp.add(new SanPham(sp, gia, giam));
               sc.nextLine();
               i++;
           } while (true);
    }
    static void xuat(){
        System.out.println();
        System.out.println("Danh sách sản phẩm: ");
        for (SanPham sanPham : listSp) {
            sanPham.inThongTin();
            System.out.println(" ");
    }
}
    static void timKiem(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên của sản phẩm cần tìm và xóa: ");
        String ten=sc.nextLine();
        SanPham found = null;
        
        for(SanPham sanPham : listSp) {
            if (sanPham.equals(ten)){
                found = sanPham;
                break;
            }
        }
        if (found != null){
            listSp.remove(found);
            System.out.println("Sản phẩm đã được xóa khỏi danh sách ^_^");
        } else{
            System.out.println("Sản phẩm không có trong danh sách ^.^");
        }
    }
    static void menu(){
        System.out.println("MENU CHƯƠNG TRÌNH"); 
        System.out.println("1. Nhập danh sách sản phẩm"); 
        System.out.println("2. Xuất danh sách sản phẩm"); 
        System.out.println("3. Sắp xếp danh sách sản phẩm"); 
        System.out.println("4. Tìm và xóa sản phẩm"); 
        System.out.println("5. Tính giá trung bình của các sản phẩm"); 
        System.out.println("6. Thoát chương trình"); 
    }
    static void giaTrungBinh(){
        double tb=0, tong=0;
         
        for(SanPham sanPham:listSp){
            tong += sanPham.donGia;
        }
        tb = tong/listSp.size();
        System.out.println("Giá trung bình của các sản phẩm: " +tb);
    }
    static void sapXep(){
        Collections.sort(listSp, (a,b) -> (int) (a.donGia-b.donGia ));
         System.out.println("Danh sách sản phẩm sau khi đã sắp xếp: ");
         xuat();
    }
    public static void main(String[] args) {
        int chose ;
        Scanner sc=new Scanner(System.in);
        do{
        menu();

        System.out.print("Mời bạn chọn chương trình: "); 
        chose = sc.nextInt();

        switch (chose) {
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break ;
            case 3:
                sapXep();
                break;

            case 4: 
                timKiem();
                break ;
            case 5: 
                giaTrungBinh();
                break;
            default:
                System.out.println("Nhập sai vui lòng nhập lại");
                break;
        }


        } while(true);
    }
}

