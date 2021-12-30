package ThiCuoiKI;

import java.util.Scanner;
public class  KhoTestDrive{
    static Scanner input = new Scanner(System.in);
    public static Kho Kho = new Kho();
    
    static void menuchinhsua(){
        int key ;
        do{
        System.out.println();
        System.out.println("------ ----- GOODS UPDATE  ----------- ");
        System.out.println("|   1.>> xoa                  |");
        System.out.println("|   2.>> sua              |");
        System.out.println("|   3.>> them                   |"); // chưa làm
        System.out.println("|   4.>> in.          |");
        System.out.println("|   0.>> Back to menu                 |");
        System.out.println("---------------------------------------");
        System.out.print("- Enter the selection : ");
        key = input.nextInt();

        switch (key) {
            case 1:
                System.out.println("1.>> xoa.");
                Kho.delecte(input);;
                break;
            case 2:
                System.out.println("2.>> sua.");
                Kho.fixByType(input);
                break ;
            case 3: 
                System.out.println("3.>> them."); // chưa làm
                Kho.add(input);
                break ;
            case 4:
                System.out.println("4.>> in.");
                Kho.inThongTin();
                break ;
            case 0: 
                break;
            default:
                System.out.println("Looks like you made the wrong choice.");
                System.out.println("Please choose again.");
                break;
        }
        }while( key != 0);

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void menuSreach(){
        int key ;
        do{
            System.out.println();
            System.out.println("-----------   SEARCH MENU  ----------- ");
            System.out.println("|   1.>> Theo ngay.          |");
            System.out.println("|   2.>> Theo loai           |");
            System.out.println("|   3.>> Theo gia             |");
            System.out.println("|   0.>> Quay về menu                 |");
            System.out.println("---------------------------------------");
            System.out.print("- Enter the selection : ");
            key = input.nextInt();
            System.out.println();

            switch (key) {
                case 1:
                    System.out.println("1.> theo ngayu.");
                    Kho.timHangtheoNgay(input);
                    break;
                case 2:
                    System.out.println("2.>>theo loai.");
                    Kho.timHangTheoLoai(input);
                    break;
                case 3:
                    System.out.println("3.>>Stheo gia.");
                    Kho.timHangTheoGia(input);
                case 0:
                    break ;
                default:
                    System.out.println("Looks like you made the wrong choice.");
                    System.out.println("Please choose again.");
                    break;
            }
        }while ( key != 0);
    }

    static void menuThongKe(){
        Kho.thongKe(input);
    }
   
    static void menuSort(){

    }
    public static void main(String[] args) {

        
        PhuongTien headE = new PhuongTien(1,"Fridge", 5300, 9, "12/01/2019") ; 
         DoDaDung headCS = new DoDaDung(2, "Plate", 250, 15, "01/02/2020"); 
         ThucPham headF = new ThucPham(3, "Apple", 45,500, "02/09/2021") ; 
 
        PhuongTien PhuongTien1 = new PhuongTien(4, "Televison", 5999,120,"13/07/2020"); 
         headE.next =PhuongTien1;
         DoDaDung DoDaDung1 = new DoDaDung(5, "Bowl", 220, 23, "02/03/2019") ;
         headCS.next = DoDaDung1 ;
         ThucPham ThucPham1 = new ThucPham(6, "Crab", 3500,30, "14/07/2020");
         headF.next = ThucPham1 ;
 
         
        PhuongTien PhuongTien2 = new PhuongTien(7, "Laptop", 1290, 6 , "15/07/2019");
        PhuongTien1.next =PhuongTien2;
         DoDaDung DoDaDung2 = new DoDaDung(8, "Pots", 180 ,58, "03/04/2021") ;
         DoDaDung1.next = DoDaDung2 ;
         ThucPham ThucPham2 = new ThucPham(9, "Pizza", 80, 123 , "16/07/2020");
         ThucPham1.next = ThucPham2 ;
 
        PhuongTien PhuongTien3 = new PhuongTien(10, "Earphone", 100, 13, "16/07/2021");
        PhuongTien2.next =PhuongTien3;
         DoDaDung DoDaDung3 = new DoDaDung(11, "Teapot", 780 , 31 , "10/11/2021") ;
         DoDaDung2.next = DoDaDung3 ;
         ThucPham ThucPham3 = new ThucPham(12, "Loster", 237 , 32, "29/12/2021");
         ThucPham2.next = ThucPham3 ;
 
        PhuongTien PhuongTien4 = new PhuongTien(13 , "Pin", 10, 80, "14/06/2020");
        PhuongTien3.next =PhuongTien4;
         DoDaDung DoDaDung4 = new DoDaDung(14, "Glass", 340, 10 , "22/08/2020") ;
         DoDaDung3.next = DoDaDung4 ;
         ThucPham ThucPham4 = new ThucPham(15, "Fish", 50, 13 ,"30/12/2021");
         ThucPham3.next = ThucPham4 ;
 
 
         Kho.headDoDaDung = headCS ;
         Kho.headPhuongTien = headE ;
         Kho.headThucPham = headF ;
         clearScreen();
         int key ;
         do{
         System.out.println("--------------- MENU ---------------");
         System.out.println("|  1.>> Update Goods.              |");
         System.out.println("|  2.>> Search Goods.              |");
         System.out.println("|  3,>> Sắp xếp hàng hóa           |"); // chưa làm
         System.out.println("|  4.>> Statistical Goods.         |");
         System.out.println("|  5.>> Print product list.        |");
         System.out.println("|  0.>> Exit the program.          |");
         System.out.println("------------------------------------");
         System.err.print("- Enter the selection : ");
         key = input.nextInt();
         System.out.println();
 
         switch (key) {
             case 1:
                 menuchinhsua();
                 break;
             case 2:
                 menuSreach();;
                 break;
             case 3:
                 menuSort();
                 break;
             case 4:
                 menuThongKe();
                 break ;
             case 5:
                 Kho.inThongTin();
                 break; 
             case 0 :
                 System.out.println("Exit the program.");
                 System.out.println("Thank you for using the program!!");
                 break ;
             default:
                 System.out.println("Looks like you made the wrong choice.");
                 System.out.println("Please choose again.");
                 break;
         }
         }while( key != 0);
     }
     
}

    


    
