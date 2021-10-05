package com.locnv2005110007.Tuan2;

public class BaiTapThemTestDrive {
    public static void main(String[] args) {

        
        
        BaiTapThem sach ; // khai báo biến tên là sach tham chiếu đối tượng kiểu Sach
        sach = new BaiTapThem(); // Tạo đối tượng sach trong vùng nhớ Heap 
        // hóa đơn sách
        System.out.println("Hóa Đơn Bán Sách");
        sach.gia = 22000 ;
        sach.nhaXuatBan = "Nhà Xuất Bản Kim Đồng" ;
        sach.namXuatBan = 1998;
        sach.giaBan = 23000 ;
        sach.soLuong = 12 ;
        sach.loai = 1 ;
        sach.inHoaDonSach();
        System.out.println("////////////////////////////////////////////////");
        
        // thông tin nhân viên 
            
        System.out.println("Thông Tin Nhân Viên ");
        BaiTapThem nhanVien ;
        nhanVien = new BaiTapThem();
        nhanVien.tenNhanVien = "Nguyễn Văn Lộc" ;
        nhanVien.luong = "23000000" ;
        nhanVien.diaChi = "TP Hồ Chí Minh ";
        nhanVien.boPhanLamViec = "Kĩ Thuật" ;
        nhanVien.ngaySinh = "14/11/2002" ;
        nhanVien.inThongTinNhanVien();
        System.out.println("////////////////////////////////////////////////");

        // Thông tin về Xe 

        System.out.println("Thông Tin về Xe");
        BaiTapThem xe ;
        xe = new BaiTapThem();
        xe.tenChuXe = "Nguyễn Văn Lộc " ;
        xe.nhanHieu = "HonDa";
        xe.mauSon = "Trắng";
        xe.diaChi ="TP Hồ Chí Minh" ;
        xe.dungTich = 110 ;
        xe.inThongTinXe();
        System.out.println("////////////////////////////////////////////////");

        // thông tin ngân hàng
        System.out.println("Thông Tin Ngân Hàng");
        BaiTapThem nganHang ;
        nganHang = new BaiTapThem();
        nganHang.soTaiKhoan = "2005110007" ;
        nganHang.tenChuTaiKhoan = "Nguyễn Văn Lộc ";
        nganHang.soDu = "50.000 VND";
        nganHang.inNganHang();
        System.out.println("////////////////////////////////////////////////");
    }
}
