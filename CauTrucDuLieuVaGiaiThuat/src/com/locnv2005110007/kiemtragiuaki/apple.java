package com.locnv2005110007.kiemtragiuaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class apple {
    int ID;
    float canNang;
    String mauSac;
    Scanner sc = new Scanner(System.in);
    static list<apple> Iapple = new ArrayList<>();
    public apple(int iD, float canNang,String mauSac){
        ID = iD;
        this.canNang = canNang;
        this.mauSac = mauSac;

    }
    apple(){
    }
    public void menu(){
        System.out.println("********MENU********");
        System.out.println("1********kHO CHUA TAO********");
        System.out.println("2********THEM TAO********");
        System.out.println("3********TIM TAO********");
        System.out.println("4********IN DANH SACH TAO********");
        System.out.println("********THOAT********");
    }
    public void input()
    {
        System.out.println("ID tao");
        ID = sc.nextInt();
        System.out.println("can nang tao");
        canNang = sc.nextFloat();
        sc.nextLine();
        System.out.println("mau trai tao");
        mauSac = sc.nextLine();
    }
    public void displayapple(){
        System.out.println("***********apple***********");
        System.out.println("%-20S %-20S %-20S\n","Id tao","can nang tao","mau sac tao");
    }
    public void display()
    {
        for(apple Apple : Iapple ){
            apple.displayapple();
            System.out.println("%-20d %-20.2f %-20S\n",ID,canNang,mauSac);
        }
    }
    public void addapple(
    {
        System.out.println("them so tao");
        int n = sc.nextint();
        for(int i = 0;i < n; i++)
        {
            Apple apple = new Apple();
            input();
            Iapple.add(apple);
        }
    }
    public void find()
    {
        System.out.println("mau muon tim");
        String name = sc.nextInt();
        for (Apple apple : Iapple){
            if(name.equals(apple.mau)){
                apple.displayapple();
            }
        }
    }
}
