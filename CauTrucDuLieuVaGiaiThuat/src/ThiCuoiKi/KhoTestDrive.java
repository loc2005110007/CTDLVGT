package ThiCuoiKi;

import java.util.Scanner;
public class  KhoTestDrive{
    static Scanner input = new Scanner(System.in);
    public static Kho Kho = new Kho();
    
    static void menuchinhsua(){
        int key ;
        do{
        System.out.println();
        System.out.println("===========CAP NHAP HANG HOA============");
        System.out.println("*   1.>> xoa                           *");
        System.out.println("*   2.>> sua                           *");
        System.out.println("*   3.>> them                          *"); // chưa làm
        System.out.println("*   4.>> in.                           *");
        System.out.println("*   0.>> Back to menu                  *");
        System.out.println("========================================");
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
                System.out.println("Ban da chon sai..");
                System.out.println("Vui long chon lai.");
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
            System.out.println("================== TIM KIEM =================");
            System.out.println("*   1.>> Theo ngay.                         *");
            System.out.println("*   2.>> Theo loai                          *");
            System.out.println("*   3.>> Theo gia                           *");
            System.out.println("*   0.>> Quay ve menu                       *");
            System.out.println("=============================================");
            System.out.print("- Nhap Lua chon: ");
            key = input.nextInt();
            System.out.println();

            switch (key) {
                case 1:
                    System.out.println("1.>> theo ngay.");
                    Kho.timHangtheoNgay(input);
                    break;
                case 2:
                    System.out.println("2.>>theo loai.");
                    Kho.timHangTheoLoai(input);
                    break;
                case 3:
                    System.out.println("3.>>theo gia.");
                    Kho.timHangTheoGia(input);
                case 0:
                    break ;
                default:
                    System.out.println("ban da chon sai!!!");
                    System.out.println("vui long chon lai");
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

        
        PhuongTien headE = new PhuongTien(1,"Xe May", 1234, 10000000, "22/8/2020") ; 
         DoDaDung headCS = new DoDaDung(2, "lo vi song", 123, 1500000, "15/6/2019"); 
         ThucPham headF = new ThucPham(3, "thit hop", 12,50000, "20/12/2021") ; 
 
        PhuongTien PhuongTien1 = new PhuongTien(4, "Xe Dap", 1235,5000000,"20/12/2021"); 
         headE.next =PhuongTien1;
         DoDaDung DoDaDung1 = new DoDaDung(5, "May Hut Bui", 124, 55000000, "2/7/2021") ;
         headCS.next = DoDaDung1 ;
         ThucPham ThucPham1 = new ThucPham(6, "Ca Hop", 13,45000, "20/12/2021");
         headF.next = ThucPham1 ;
 
         
        PhuongTien PhuongTien2 = new PhuongTien(7, "Xe Tai", 1236, 1250000000 , "20/11/2021");
        PhuongTien1.next =PhuongTien2;
         DoDaDung DoDaDung2 = new DoDaDung(8, "May lanh", 125 ,110000000, "03/04/2021") ;
         DoDaDung1.next = DoDaDung2 ;
         ThucPham ThucPham2 = new ThucPham(9, "Banh", 14, 15000 , "16/07/2020");
         ThucPham1.next = ThucPham2 ;
 
        PhuongTien PhuongTien3 = new PhuongTien(10, "Xe oto hang A", 1237, 500000000, "15/4/2021");
        PhuongTien2.next =PhuongTien3;
         DoDaDung DoDaDung3 = new DoDaDung(11, "May giat", 126 , 12500000 , "10/11/2021") ;
         DoDaDung2.next = DoDaDung3 ;
         ThucPham ThucPham3 = new ThucPham(12, "Keo", 15 , 20000, "29/12/2021");
         ThucPham2.next = ThucPham3 ;
 
        PhuongTien PhuongTien4 = new PhuongTien(13 , "Xe oto hang c", 10, 600000000, "19/7/2021");
        PhuongTien3.next =PhuongTien4;
         DoDaDung DoDaDung4 = new DoDaDung(14, "Noi com", 127, 2000000 , "22/08/2020") ;
         DoDaDung3.next = DoDaDung4 ;
         ThucPham ThucPham4 = new ThucPham(15, "Rau Cu Dong Lanh", 16, 23600 ,"30/12/2021");
         ThucPham3.next = ThucPham4 ;
 
 
         Kho.headDoDaDung = headCS ;
         Kho.headPhuongTien = headE ;
         Kho.headThucPham = headF ;
         clearScreen();
         int key ;
         do{
         System.out.println("===============MENU=================");
         System.out.println("*  1.>> Cap Nhat Hang Hoa          *");
         System.out.println("*  2.>> Tim Hang Hoa               *");
         System.out.println("*  3,>> sap xep hang hoa           *"); // chưa làm
         System.out.println("*  4.>> In Danh Sach Hang Hoa      *");
         System.out.println("*  5.>> Thong Ke Hang Hoa          *");
         System.out.println("*  0.>> Thoat Khoi Chuong Trinh    *");
         System.out.println("====================================");
         System.err.print("Nhap lua chon : ");
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
                 System.out.println("Thoat khoi chuong trinh");
                 System.out.println("cam on vi da su dung chuong trinh");
                 break ;
             default:
                 System.out.println("ban da chon sai");
                 System.out.println("Vui long chon lai");
                 break;
         }
         }while( key != 0);
     }
     
}

    


    


    



    

