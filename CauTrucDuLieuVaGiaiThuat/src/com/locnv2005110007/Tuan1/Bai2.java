package com.locnv2005110007.Tuan1;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       try{
        System.out.print("nhap chieu dai : ");// nhập chiều dài
        double chieuDai = scanner.nextDouble();
        System.out.print("nhap chieu rong : ");// nhập chiều rộng
        double chieuRong = scanner.nextDouble();
        // hình chữ nhật
        double chuVi = (chieuDai+chieuRong)*2 ; // chu vi
        double dienTich = chieuDai*chieuRong;   // diện tích
        double canhNhoNhat = Math.min(chieuDai,chieuRong) ; // cạnh nhỏ nhất
        // xuất CV.DT.CNN hình chữ nhật
        System.out.println("Perimeter of  rectangle : "+chuVi);
        System.out.println("Rectangular area : "+dienTich);
        System.out.println("Edge smallest : "+canhNhoNhat);}
        finally{scanner.close();}
       
    }
}
