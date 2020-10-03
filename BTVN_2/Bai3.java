/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN_Buoi2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("n = ");
        n = sc.nextInt();
        int []a= new int [n];
        nhap(a,n);
        do{
            System.out.println("1. Hiển thị mảng.");
            System.out.println("2. Thêm 1 phần tử vào vị trí k.");
            System.out.println("3. Xóa 1 phần tử ở vị trí k.");
            System.out.println("4. Đảo ngược mảng.");
            System.out.println("5. Hiển thị a[1] và các số chia hết cho a[1]");
            System.out.println("6. Thoát.");
            System.out.print("Nhap muc muon chon : ");
            m = sc.nextInt();
            switch(m){
            case 1: 
                xuat(a,n);
                break;
            case 2:
                them(a,n);
                break;
            case 3:
                xoa(a,n);
                break;
            case 4:
                dao(a,n);
                break;
            case 5:
                yc5(a,n);
                break;
            case 6:
                System.out.println("Thoát!");
                break;
            default:
                System.out.println("Không hợp lệ");
            }
        }while(m!=6);
    }
    public static void nhap(int []a ,int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang : ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }
    public static void xuat(int []a,int n){
        System.out.println("Hien thi mang");
        for(int i =0;i<n;i++){
            System.out.print(a[i] + "  ");
        }
    }
    public static void them(int []a,int n){
        int k,x,d=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap vi tri muon chen pt : ");
        k = sc.nextInt();
        System.out.println("Nhap pt : ");
        x = sc.nextInt();
        int[] arr = new int [n+1];
        for (int i=0;i<n;i++){
            if(d == k-1){
                arr[d++] = x;
                i--;
            }else arr[d++] = a[i];
        }
        n++;
        xuat(arr,n);
    }
    public static void xoa(int []a,int n){
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap vi tri muon xoa : ");
        k = sc.nextInt();
        for(int i =k;i<n;i++){
            a[i-1]=a[i];
        }
        n--;
        xuat(a,n);
    }
    public static void dao(int []a,int n){
        for(int i =0;i<n/2;i++){
            int tg = a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=tg;
        }
        xuat(a,n);
    }
    public static void yc5(int []a,int n){
        System.out.println("a[1] = "+a[1]);
        System.out.print("Cac phan tu chia het cho a[1] : ");
        for(int i=0;i<n;i++){
            if(a[i]%a[1]==0) System.out.print(a[i]+ "  ");
        }
    }
}
