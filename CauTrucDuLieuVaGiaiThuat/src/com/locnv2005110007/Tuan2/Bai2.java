package com.locnv2005110007.Tuan2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        System.out.print("Electricity used in the month (kWh): ");//Số điện SD
        double electricity = input.nextDouble();
    
        if(electricity<50){
            double money = (double) electricity*1000 ;
            System.out.println("The money have to pay : " + decimalFormat.format(money)+ " VND");
        }else{
            double money = (double) 50*1000 + (electricity-50)*1200 ;
            System.out.println("The money have to pay : " + decimalFormat.format(money)+ " VNd");
        }

    }
}
