package com.locnv2005110007.Tuan1;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.print("Họ và tên: "); 
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: "); 
        double diemTB = scanner.nextDouble(); 
        System.out.printf(" %s : %f điểm ",hoTen,diemTB);   }
        finally{scanner.close();} 
}
}
