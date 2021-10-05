package com.locnv2005110007.Tuan3;

public class ExcerciseTestDrive {
    public static void main(String[] args) {
        
    // SÁCH
        System.out.println();
        System.out.println(">>>>>>>>--Sách--<<<<<<<<");
        Exercise book = new Exercise(42.500, "Kim Đồng", 2004, 45.250 , 2, 1) ;
        book.inThongTin();
        //NHÂN VIÊN 
        System.out.println();
        System.out.println(">>>>>>>>--Nhân Viên--<<<<<<<<");
        Exercise nhanVien = new Exercise("Nguyễn văn Lộc", 25000000, "Tân Hồ Chí Minh", "Kĩ Thuật", "14/11/2002");
        nhanVien.thongTinNhanVien();
        //XE
        System.out.println();
        System.out.println(">>>>>>>>--XE--<<<<<<<<");
        Exercise xe = new Exercise("Nguyễn văn Lộc", "Honda", "Nhập Khẩu", "CA Hồ Chí Minh", 110);
        xe.thongTinXe(); 
        //MÁY TÍNH
        System.out.println();   
        System.out.println(">>>>>>>>--Máy Tính--<<<<<<<<");
        Exercise mayTinh = new Exercise("Acer nitro 5", 2019, "Window 10 Home SL", "16 GBLPDDR4X (On board)4266 MHz", "i51135G7 2.4GHz", 22000000, 2021);
        mayTinh.thongTinMayTinh();
        //TÀI KHOẢN NGÂN HÀNG
        System.out.println();
        System.out.println(">>>>>>>>--Tài Khoản Ngân Hàng--<<<<<<<<");
        Exercise nganHang = new Exercise("Nguyễn văn Lộc", 2005110008, 51000 ) ;
        nganHang.thongTinNganHang();
        System.out.println();
    }}

