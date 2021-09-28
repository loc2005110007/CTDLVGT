package com.loc2005110007.Tuan03;

public class ExcerciseTestDrive {
    public static void main(String[] args) {
        // SÁCH
        System.out.println();
        System.out.println("************Sách************");
        Exercise book = new Exercise(150.000, "Kim Đồng", 2021, 100.000 , 2, 1) ;
        book.inThongTin();
        //NHÂN VIÊN 
        System.out.println();
        System.out.println("************Nhân Viên************");
        Exercise nhanVien = new Exercise("Nguyễn Văn Lộc", 25000000, "TP Hồ Chí Minh", "Bảo Vệ", "14/11/2002");
        nhanVien.thongTinNhanVien();
        //XE
        System.out.println();
        System.out.println("************XE************");
        Exercise xe = new Exercise("Nguyễn Văn Lộc", "Honda", "Nhập Khẩu", "CA TP Hồ Chí Minh", 555);
        xe.thongTinXe(); 
        //MÁY TÍNH
        System.out.println();
        System.out.println("************Máy Tính************");
        Exercise mayTinh = new Exercise("Acer Nitro 5", 2019, "Window 10 Home SL", "16 GBLPDDR4X (On board)4266 MHz", "ryzen5 3750h", 22000000, 2019);
        mayTinh.thongTinMayTinh();
        //TÀI KHOẢN NGÂN HÀNG
        //MÁY TÍNH
        System.out.println();
        System.out.println("************Tài Khoản Ngân Hàng************");
        Exercise nganHang = new Exercise("Nguyễn Văn Lộc", 2005110007, 1548764316 ) ;
        nganHang.thongTinNganHang();
        System.out.println();
    
}
}
