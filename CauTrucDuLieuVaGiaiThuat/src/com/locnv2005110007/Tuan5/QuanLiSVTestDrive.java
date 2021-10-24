package com.locnv2005110007.Tuan5;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSVTestDrive {
    static ArrayList<QuanLiSV> listSV = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do{
            System.out.println("==========MENU==========");
            System.out.println(">>1. Nhập thông tin sinh viên.");
            System.out.println(">>2. Xuất danh sách đã nhập.");
            System.out.println(">>3. Xuất danh sách theo khoảng điểm.");
            System.out.println(">>4. Tìm sinh viên.");
            System.out.println(">>5. Tìm và sửa thông tin.");
            System.out.println(">>6. Tìm và xóa thông tin.");
            System.out.println(">>7. Kết thúc.");
            System.out.print("Nhập vào sự lựa chọn: ");
            chon = input.nextInt();
            switch(chon){
                case 1: 
                        nhap();
                        break;
                case 2: 
                        xuatDS();
                        break;
                case 3:
                        xuatTheoDiem();
                        break;
                case 4: 
                        tim();
                        break;
                case 5: 
                        timVaSua();
                        break;
                case 6: 
                        timVaXoa();
                        break;
                case 7:
                        System.out.println("KẾT THÚC!");
                        break;
                default: 
                        System.out.println("- Lựa chọn không hợp lệ!");

            }
            System.out.print("- Quay lại MENU(1:yes/0:no): ");
            chon = input.nextInt();
        }while(chon == 1);

    }
    static void nhap(){
        int chon;
        do{
                System.out.println("- Nhập thông tin của sinh viên: ");
                QuanLiSV sv = new QuanLiSV();
                sv.nhapThongTin();
                listSV.add(sv);
                System.out.println("- Nhập thêm(1:yes/0:no): ");
                chon = input.nextInt();
                input.nextLine();
        }while(chon == 1);
    }
    static void xuatDS(){
        for(QuanLiSV x : listSV){
            x.inThongTin();
        }
    }
    static void xuatTheoDiem(){
        System.out.print("- Nhập điểm min: ");
        double min = input.nextDouble();
        System.out.print("- Nhập điểm max: ");
        double max = input.nextDouble();
        System.out.println("-Danh sách sinh viên trong khoảng " +min+ "đến" +max+ "là: ");
        for(QuanLiSV x : listSV){
                if(x.diem >= min && x.diem <= max){
                        x.inThongTin();
                }
        }
    }
    static void tim(){
        System.out.println("- Nhập họ tên sinh viên cần tìm: ");
        input.nextLine();
        String hoTen = input.nextLine();
        for(QuanLiSV x : listSV){
                if(x.hoTen.contains(hoTen)){
                        System.out.println("-----Thông tin sinh viên cần tìm-----");
                        x.inThongTin();
                }
        }  
    }
    static void timVaSua(){
        System.out.print("- Nhập tên sinh viên cần sửa điểm: ");
        input.nextLine();
        String hvt = input.nextLine();
        for(QuanLiSV x : listSV){
                if(x.hoTen.contains(hvt)){
                        System.out.println("  + Nhập điểm mới: ");
                        x.diem = input.nextDouble();
                        System.out.println("-----Sau khi sửa-----");
                        x.inThongTin();
                }
        }
    }
    static void timVaXoa(){
            System.out.println("- Nhập tên sinh viên cần xóa: ");
            input.nextLine();
            String ht = input.nextLine();
            for(QuanLiSV x : listSV){
                    if(x.hoTen.equals(ht)){
                        listSV.remove(x);
                        System.out.println("- Xóa thành công!");
                        break;
                    }
            }
    }
}
