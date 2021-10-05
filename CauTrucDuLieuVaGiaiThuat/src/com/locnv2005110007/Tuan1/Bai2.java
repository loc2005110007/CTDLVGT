package com.locnv2005110007.Tuan1;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       try{
        System.out.print("Enter length of rectangle : ");// nhập chiều dài
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle : ");// nhập chiều rộng
        double width = scanner.nextDouble();
        // hình chữ nhật
        double perimeter = (length+width)*2 ; // chu vi
        double area = length*width;   // diện tích
        double edgeSmallest = Math.min(length,width) ; // cạnh nhỏ nhất
        // xuất CV.DT.CNN hình chữ nhật
        System.out.println("Perimeter of  rectangle : "+perimeter);
        System.out.println("Rectangular area : "+area);
        System.out.println("Edge smallest : "+edgeSmallest);}
        finally{scanner.close();}
       
    }
}
