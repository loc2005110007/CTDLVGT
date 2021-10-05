package com.locnv2005110007.Tuan4;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class BankTestDrive {
    public static void main(String[] args) {
        // tạo mảng 
        Bank []BankList = new Bank[2];
        // nhập dữ liệu từ bàn phím 
        Scanner input = new Scanner(System.in);
        // sử dụng vòng lặp for
        for(int i = 0 ; i < BankList.length; i++ ){
            System.out.println("Enter a Bank account "+(i+1));
            System.out.print("Account holder : ");
            String name = input.nextLine();
            System.out.print("Account Number : ");
            int accountNumber = input.nextInt() ;
            System.out.print("Account Balance : ");
            input.nextLine();
            double accountBalance = input.nextDouble();
            input.nextLine();
            BankList[i]= new Bank(name , accountNumber,accountBalance);
        }
        // duyệt mảng 
        for (Bank bank : BankList) {
            System.out.println();
            bank.inThongTin();
        }
        // chuyển mảng sang dạng List 
        List list = Arrays.asList(BankList);
    }
}
