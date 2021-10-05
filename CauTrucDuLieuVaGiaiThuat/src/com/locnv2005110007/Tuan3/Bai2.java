package com.locnv2005110007.Tuan3;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số cần xem bảng cửu chương : ");
        int x = input.nextInt() ;
          
        for  (int i = 1 ; i <= 10 ; i ++){
            System.out.printf("%d x %d = %d",x,i,x*i);
            System.out.println();
        }
      
    }  
}
