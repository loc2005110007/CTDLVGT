package com.locnv2005110007.kiemtragiuaki;

import java.util.ArrayList;
import java.util.Scanner;
public class TaoTestDriver {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Tao> appleList = new ArrayList<Tao>(3);

    static void themTao(){
            scanner.nextLine();
            while(true){
            Tao apple = new Tao();
            System.out.print("Nhập mã táo: ");
            apple.ma = scanner.nextLine();
            System.out.print("Nhập khối lượng táo: ");
            apple.khoiLuong = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Nhập màu táo: ");
            apple.mauSac = scanner.nextLine();
            appleList.add(apple);
            System.out.print("Nhập thêm (y/n)?: ");
            if(scanner.nextLine().equals("n"))
                break;
        }
    }

    static void timTaoTheoMau(){
        
        System.out.print("Nhập màu cần tìm: ");
        
        for (Tao apple : appleList) {
            if(scanner.nextLine().equals(apple.mauSac))
                apple.inDanhSachTao();
            }
        }
        
    
    static void inThongTin(){
        scanner.nextLine();
        for (Tao apple : appleList) {
            apple.inDanhSachTao();
        }
    }
    public static void main(String[] args) {
        int suLuaChon;
        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. Thêm táo vào kho.");
            System.out.println("2. Tìm táo theo màu.");
            System.out.println("3. In danh sách táo.");
            System.out.print("Chọn chức năng: ");
            System.out.println("------------------MENU------------------");
            suLuaChon = scanner.nextInt();
            switch(suLuaChon){
                case 1:themTao();break;
                case 2:timTaoTheoMau(); break;
                case 3:inThongTin();break;
                default: System.out.println("kết thúc chương trình");
            }}while(suLuaChon >= 1 && suLuaChon <= 3);
    }
}
