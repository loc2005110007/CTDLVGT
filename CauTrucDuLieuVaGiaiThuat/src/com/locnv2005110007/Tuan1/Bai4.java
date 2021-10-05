package com.locnv2005110007.Tuan1;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number system of quadratic equations : ");
        System.out.print("Number A : ");
        int a  = scanner.nextInt();
        System.out.print("Number B : ");
        int b = scanner.nextInt();
        System.out.print("Number C : ");
        int c = scanner.nextInt();
        System.out.println("Equacation : "+a+"x^2 + "+b+"x + "+c+"=0.");
 
        double delta = Math.pow(b,2)-4*a*c ; 
        System.out.println("Delta : " +delta);
        System.out.println("Square root delta : "+Math.sqrt(delta)); // căn bậc 2 delta
 
     }
}
