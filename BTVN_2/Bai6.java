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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap chuoi : ");
        str = sc.nextLine();
        System.out.println("Chuoi chuan hoa :" + viethoa(str));
    }
    public static String xoa_khoang_trang(String str){
        str = str.trim();
        while (str.indexOf("  ") != -1) str = str.replace("  "," ");
        return str;
    }
    public static String viethoa(String str){
        str = xoa_khoang_trang(str);
        String a[] = str.split(" ");
        str = "";
        for(int i=0;i<a.length;i++){
            str += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if(i<a.length-1 ){
                str += " ";
            }
        }
        return str;
    }
}
