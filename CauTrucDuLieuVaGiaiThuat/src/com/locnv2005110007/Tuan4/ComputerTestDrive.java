package com.locnv2005110007.Tuan4;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ComputerTestDrive {
    public static void main(String[] args) {
        


        // tạo danh sách mảng máy tính 
    
        Computer []ComputerLish = new Computer[2] ;
    
        // nhập từ bàn phím vào 
        Scanner input =  new Scanner(System.in) ;
        // sử dụng vòng lập for để nhập 
        for (int i = 0 ; i < ComputerLish.length;i++){
            System.out.println("Enter the Computer "+(i+1));
            System.out.print("Publish Company : ");
            String publishCompany = input.nextLine() ;
            System.out.print("Publish Year : ");
            String publishYear = input.nextLine();
            System.out.print("Operating System : ");
            String operatingSystem = input.nextLine();
            System.out.print("Ram : ");
            String ram = input.nextLine();
            System.out.print("CPU : ");
            String cpu = input.nextLine();
            System.out.print("Price : ");
            double price = input.nextDouble() ;
            input.nextLine();
            System.out.print("Warranty Year : ");
            int warrantyYear = input.nextInt();
            input.nextLine();
            ComputerLish[i]= new Computer(publishCompany,publishYear,operatingSystem,ram,cpu,price,warrantyYear);
    
        }
          // Duyệt mảng 
          System.out.println(">>>>>>Duyệt mảng Computer<<<<<<");
          for (Computer computer : ComputerLish) {
              System.out.println();
              computer.inThongTin();
          }
    
          // Chuyển mảng sang dạng list
          List list = Arrays.asList(ComputerLish);
    }     
}
