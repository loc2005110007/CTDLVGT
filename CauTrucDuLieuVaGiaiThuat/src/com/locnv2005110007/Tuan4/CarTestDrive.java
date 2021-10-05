package com.locnv2005110007.Tuan4;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class CarTestDrive {
    public static void main(String[] args) {
        
        // tạo danh sách xe
        Car []CarList = new Car[2];
        // nhập dữ liệu
        Scanner input = new Scanner(System.in);
        // dùng for đẻe lập lệnh nhập
        for(int i = 0 ; i < CarList.length;i++){
            System.out.println("Entẻ the car"+(i+1));
            System.out.println("Full Name : ");
            String name = input.nextLine();
            System.out.println("Manufacturer : ");
            String manufacturer = input.nextLine();
            System.out.println("Line of cars : ");
            String line = input.nextLine();
            System.out.println("License : ");// giấy phép
            String license = input.nextLine();
            System.out.println("Capacity : ");// dung tích
            int capacity = input.nextInt();
            input.nextLine();
            CarList[i]= new Car(name,manufacturer,line,license,capacity);
        }

        // sủ dụng for-each để duyệt mảng 
        System.out.println(">>>>>>Duyệt mảng Car<<<<<<");
        for (Car car : CarList) {
            System.out.println();
            car.inThongTin();
        }

        // chuyển mảng về list
        List list = Arrays.asList(CarList);
    }
}
