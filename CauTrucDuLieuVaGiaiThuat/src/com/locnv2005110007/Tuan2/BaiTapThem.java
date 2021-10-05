package com.locnv2005110007.Tuan2;

public class BaiTapThem {
    // Hóa Đơn Sách 

     // 1 thuộc tính 
     float gia ;
     String nhaXuatBan ;
     int namXuatBan ;
     float giaBan ;
     int soLuong ;
     int loai ;
    // 2 phương thức
    void inHoaDonSach(){
        System.out.println("Giá tại đại lí : "+gia);
        System.out.println("Nhà Xuất Bản : "+nhaXuatBan);
        System.out.println("Năm Xuất Bản : "+namXuatBan);
        System.out.println("Giá bán tại cửa hàng : "+giaBan);
        System.out.println("Số lượng : "+soLuong);
        System.out.println("Loại : "+loai);
    }
     
    // Thông Tin Nhân Viên 
     // 1 thuộc tính
     String tenNhanVien ;  
     String luong ;
     String diaChi ;
     String boPhanLamViec ;
     String ngaySinh ;
     // 2 phương thức 
     void inThongTinNhanVien(){
         System.out.println("Tên nhân vien : "+tenNhanVien);
         System.out.println("Bản lương : "+luong);
         System.out.println("Địa Chỉ : "+diaChi);
         System.out.println("Bộ phận làm việc : "+boPhanLamViec);
         System.out.println("Ngày Sinh : "+ngaySinh);
     }

     // Thông Tin về Xe 

     // 1 thuộc tính 
     String tenChuXe ;
     String nhanHieu ;
     String mauSon ;
     int dungTich ;
     // 2 phương thức 
     void inThongTinXe(){
         System.out.println("Tên Chủ Xe : "+tenChuXe);
         System.out.println("Địa Chỉ : "+diaChi);
         System.out.println("Nhãn Hiệu : "+nhanHieu);
         System.out.println("Màu Sơn : "+mauSon);
         System.out.println("Dung tích xilanh : "+dungTich);    
     }
     // Tài khoản ngân hang

     String soTaiKhoan ;
     String tenChuTaiKhoan ;
     String soDu ;

     void inNganHang(){
         System.out.println("Số tài khoản : "+soTaiKhoan);
         System.out.println("Chủ tài khoản : "+tenChuTaiKhoan);
         System.out.println("Số dư : "+soDu);
     }

}
