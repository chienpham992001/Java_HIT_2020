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
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();
        System.out.println("c = ");
        c = sc.nextInt();
        if(a>=b && a>=c)
            System.out.println("Max = "+a);
        else if(b>=c)
            System.out.println("Max = "+b);
        else 
            System.out.println("Max = "+c);
    }
}
