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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j=0,sum=0;
        System.out.println("n = ");
        n = sc.nextInt();
        int []a = new int [n];
        int []prime = new int [n];
        System.out.println("Nhap mang : ");
        for(int i =0;i<n;i++){
            do{
                a[i] = sc.nextInt();
            }while (a[i] < 0);
        }
        for(int i=2;i<n;i++){
            if(isPrime(i)) prime[j++]=i;
        }
        for(int i =0;i<n;i++){
            sum +=(isPrime(a[i]) ? a[i]+prime[i]-i : a[i]);
        }
        System.out.println("S = "+sum);
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }   
}
