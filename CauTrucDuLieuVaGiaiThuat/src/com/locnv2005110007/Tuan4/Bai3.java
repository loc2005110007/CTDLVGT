package com.locnv2005110007.Tuan4;
import java.util.Arrays;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {

        // chưong trình nhập mảng số nguyên từ bàn phím
        int []mangSoNguyen = new int[5] ;
        
        Scanner input = new Scanner(System.in) ;

        for (int i = 0 ; i < mangSoNguyen.length ; i++){
            System.out.printf("Nhập phần tử thứ %d : ",(i+1));
            mangSoNguyen[i] = input.nextInt() ; 
            
        }
        // in ra các phần tử mảng bằng Arrays.toString
        System.out.println("Phần tử mảng "+Arrays.toString(mangSoNguyen));
        // Sắp xếp các phần tử mảng theo thứ tự tăng dần bằng Arrays.Sort
        Arrays.sort(mangSoNguyen);
        // in sau khi sắp xếp 
        System.out.println("Phần tử mảng theo thứ tự tăng dần : "+Arrays.toString(mangSoNguyen));
        //Xuất phần tử có giá trị nhỏ nhất ra màn hình 
        int min = mangSoNguyen[0] ;
        for (int i = 0 ; i < mangSoNguyen.length; i++){
           if (min > mangSoNguyen[i]){
               min = mangSoNguyen[i];
           }
           min = Math.min(min,mangSoNguyen[i]);
        }
        System.out.println("Phần tử  nhỏ nhất của mảng là : "+min);

        // duyệt mảng và kiểm tra từng phần tử
        int sum = 0 , count = 0 ;
        for (int i : mangSoNguyen) {
            if (i % 3 == 0){
                sum += mangSoNguyen[i];
                count ++ ;
            }
        }
        float  trungBinh = (float) sum / count ; // ép kiểu 
        System.out.println("Giá trị trung bình : "+trungBinh);
        
    }
}
