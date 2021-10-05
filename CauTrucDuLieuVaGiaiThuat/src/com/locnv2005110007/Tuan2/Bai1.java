package com.locnv2005110007.Tuan2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Bai1 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");    // làm tròn đến 3 chữ số thập phân
        Scanner input = new Scanner(System.in);
 
        System.out.print("Input Number A : ");
        int a = input.nextInt();
        System.out.print("Input Number B: ");
        int b = input.nextInt();
        System.out.println("Equation : " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");// VSN
            } else {
                System.out.println("The equation has no solution.");// VN
            }
        } else {
            double solution = (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Equation with solution x = " + decimalFormat.format(solution) + ".");
        }
    }
}
