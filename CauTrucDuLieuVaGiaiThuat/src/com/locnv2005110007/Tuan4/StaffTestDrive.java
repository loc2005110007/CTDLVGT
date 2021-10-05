package com.locnv2005110007.Tuan4;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class StaffTestDrive {
    public static void main(String[] args) {
        
        // tạo danh sach Staff
        Staff []StaffList = new Staff[2];
        // nhập vào từ bàn phím
        Scanner input = new Scanner(System.in);
        // dùng for đẻ lập
        for(int i = 0 ; i < StaffList.length;i++){
            System.out.println("Enter Employee "+(i+1));
            System.out.print("Full Name : ");
            String name = input.nextLine() ;
            System.out.print("Wage : ");
            Double wage = input.nextDouble();
            input.nextLine();
            System.out.print("Address : ");
            String address = input.nextLine();
            System.out.print("Position : ");
            String position = input.nextLine();
            System.out.print("Date of birth : ");
            String date = input.nextLine();
            StaffList[i]= new Staff(name,wage,address,position,date);

        }

        // dùng for-each duyệt mảng
        System.out.println(">>>>>>IN DANH SÁCH NHÂN VIÊN<<<<<<");
        for (Staff staff : StaffList) {
            System.out.println();
            staff.inThongTin();
        }
        // chuyển mảng sang list 
        List list = Arrays.asList(StaffList);
    }
}
