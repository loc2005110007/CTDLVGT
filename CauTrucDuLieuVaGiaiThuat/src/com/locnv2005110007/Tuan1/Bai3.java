package com.locnv2005110007.Tuan1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bai3 {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.###");    // làm tròn đến 3 chữ số thập phân
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter the edge of the cube : ");
        double edge = scanner.nextDouble();
        System.out.println("Entered edge is "+edge+"");

        double volume = Math.pow(edge,3);

        System.out.println("Volume of the cube : "+decimalFormat.format(volume));
    }
}
