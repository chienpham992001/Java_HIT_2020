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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("n = ");
        n = sc.nextInt();
        int []a=new int[n];
        nhap(a,n);
        MIN_MAX(a,n);
        SX(a,n);
    }
    public static void nhap(int []a,int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang : ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }
    public static void MIN_MAX(int []a,int n){
        int min=a[0] , max=a[1];
        for(int i =0;i<n-1;i++){
            if(min>a[i+1]) min = a[i+1];
            if(max<a[i+1]) max = a[i+1];
        }
        System.out.println("Min = "+min+"  Max = "+max);
    }
    public static void SX(int []a,int n){
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){ 
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        System.out.println("Mang sx : ");
        for(int i =0;i<n;i++){
            System.out.print(a[i] + "  ");
        }
    }
}
