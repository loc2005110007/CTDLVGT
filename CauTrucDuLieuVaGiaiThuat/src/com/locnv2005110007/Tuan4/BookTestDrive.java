package com.locnv2005110007.Tuan4;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class BookTestDrive {
    public static void main(String[] args) {
        // tạo danh sách Book
        Book []Booklist = new Book[2] ;
        // nhập vào từ bàn phím
        Scanner input =  new Scanner(System.in);
        // sủ dụng vòng lặp for để nhập 
        for(int i=0 ; i < Booklist.length ; i++){
            System.out.println("Enter the book "+(i+1));
            System.out.print("Suggested Price : ");
            double suggestedPrice = input.nextDouble();
            input.nextLine();
            System.out.print("Publishing Company : ");
            String publishingComoany = input.nextLine();
            System.out.print("Publishing Year : ");
            int publishingYear = input.nextInt();
            input.nextLine();
            System.out.print("Price : ");
            double price = input.nextDouble();
            input.nextLine();
            System.out.print("Quatity : ");
            int quatity = input.nextInt();
            input.nextLine();
            System.out.print("Type : ");
            int type = input.nextInt();
            input.nextLine();
            Booklist[i]= new Book(suggestedPrice,publishingComoany,publishingYear,price,quatity,type);

        }
        // xuất danh sách mảng bằng for-each
        System.out.println(">>>>>>Xuất Mảng Sách<<<<<<");
        for (Book book : Booklist) {
            System.out.println();
            book.inThongTin();
        }

        // chuyển mảng sang list 
        List list = Arrays.asList(Booklist) ;
        
    }
}
