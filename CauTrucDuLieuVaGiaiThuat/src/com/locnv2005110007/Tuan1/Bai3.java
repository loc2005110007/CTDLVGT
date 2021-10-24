package com.locnv2005110007.Tuan1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bai3 {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.###");    // làm tròn đến 3 chữ số thập phân
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("nhap canh cua khoi lap phuong : ");
        double canh = scanner.nextDouble();
        System.out.println("canh da nhap la "+canh+"");

        double theTich = Math.pow(canh,3);

        System.out.println("the tich khoi lap phuong : "+decimalFormat.format(theTich));
    }
}
