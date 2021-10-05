package com.locnv2005110007.Tuan4;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // nhập số lương
        System.out.print("Nhập số sinh viên: ");
        int n = input.nextInt();
         // tạo 2 mảng tên và điểm 
        String []ten = new String[n];
        double []diem = new double[n];
        System.out.println("Mời nhập thông tin");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên: ");
            ten[i] = input.next();
            System.out.print("Nhập điểm sinh viên: ");
            diem[i] = input.nextDouble();
            System.out.println("");
        }
        // Xuất thông tin theo thứ tự điểm tăng dần
        for (int i = 0; i < diem.length - 1; i++) {
            for (int j = i + 1; j < diem.length; j++) {
                if (diem[i] > diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Họ Tên Sinh viên: " + ten[i] + ", Điểm của sinh viên: " + diem[i]);
            if (diem[i] < 5) {
                System.out.println("Xếp loại yếu");
            } else if (diem[i] < 6.5) {
                System.out.println("Xếp loại trung bình");
            } else if (diem[i] < 7.5) {
                System.out.println("Xếp loại khá");
            } else if (diem[i] < 9) {
                System.out.println("Xếp loại giỏi");
            } else if (diem[i] >= 9 && diem[i] <= 10) {
                System.out.println("Xếp loại xuất sắc");
            }
        }

    }
}
