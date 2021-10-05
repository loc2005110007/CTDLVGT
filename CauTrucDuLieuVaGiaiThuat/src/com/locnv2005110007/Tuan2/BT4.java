package com.locnv2005110007.Tuan2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BT4 {
    public static void main(String[] args) {
        int choose ;
        do{
        menu();
        Scanner input = new Scanner(System.in);
        System.out.println("Which function do you choose? : ");
        choose = input.nextInt();
     // thực hiện chọn chức năng.
     switch(choose){
         case 1 : giaiPt1(); break ;
         case 2 : giaiPt2(); break ;
         case 3 : tienDien(); break ;
         case 4 : break ;

     default : 
         System.out.println("You chose the wrong one. Please choose again!!!");
     }
      }while(choose >=1 && choose<=3) ;
         
     }   
     // thực đơn
     public static void menu() {

        System.out.println("---------------MENU---------------");
        System.out.println("1.>>> First order equation. "); // bậc 1
        System.out.println("2.>>> Quadratic equation."); // bậc 2
        System.out.println("3.>>> Money electricity."); // tiền điện
        System.out.println("4.>>> Exit.");
        System.out.println("///////////////////////////////////"); 

     }
     // giải phương trình bậc 1
     public static void giaiPt1(){

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
     // giải phương trình bậc 2
     public static void giaiPt2(){

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
       Scanner scanner = new Scanner(System.in) ;
       System.out.println("Enter the number system of quadratic equations : ");
       System.out.print("Number A : ");
       int a  = scanner.nextInt();
       System.out.print("Number B : ");
       int b = scanner.nextInt();
       System.out.print("Number C : ");
       int c = scanner.nextInt();
       System.out.println("Equacation : "+a+"x^2 + "+b+"x + "+c+" = 0.");
       
       if (a == 0) {
          if (b == 0) {
            System.out.println("The equation has no solution.");// VSN
          }else {
            double solution = (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("The equation with a solution : "+ decimalFormat.format(solution)+ ".");
        }
        }  else {
            double delta = Math.pow(b,2)-4*a*c ;
            if(delta>0){
              double   x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
              double   x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
              System.out.println("The equation has 2 distinct solutions : X1 = "+ decimalFormat.format(x1) + ";  X2 = "+ decimalFormat.format(x2) );
            }else if(delta == 0){
               double x = (double) -b/(2*a); // nghiệm kép
               System.out.println("Equation with double solutions : "+ decimalFormat.format(x)+".");
            }else  
               System.out.println("The equation has no solution."); // VN
          
         }
    }
     // tính tiền điện
     public static void tienDien(){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        System.out.print("Electricity used in the month (kWh) : ");//Số điện SD
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
