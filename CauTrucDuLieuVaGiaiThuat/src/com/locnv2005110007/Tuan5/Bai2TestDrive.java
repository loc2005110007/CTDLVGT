package com.locnv2005110007.Tuan5;
import java.util.Scanner;

public class Bai2TestDrive {
    public static void main(String[] args) {
        Bai2 bai2 = new Bai2();
        int chose ;
        Scanner input = new Scanner(System.in);
        do{
        bai2.menu();
        System.out.println("Nhập vào chức năng bạn chọn :");
        chose = input.nextInt();
        switch(chose){
            case 1 : bai2.nhap(); break ;
            case 2 : bai2.xuat(); break ;
            case 3 : bai2.sapXep(); break ;
            case 4 : bai2.xuatNgauNhien(); break ;
            case 5 : bai2.timVaXoa(); break ;
            case 6 : break ;
        default :
         System.out.println("Bạn chọn sai rồi. Vui lòng chọn lại!!!");
        }

        }while (chose >= 1 && chose <= 5);

    }
    }

