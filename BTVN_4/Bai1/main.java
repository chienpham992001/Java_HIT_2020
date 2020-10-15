
package Bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("So cuon sach n = ");
        n = sc.nextInt();
        SACH [] x = new SACH[n];
        for(int i =0;i<n;i++){
            x[i] = new SACH();
            x[i].NHAP();
        }
        for(SACH sach:x){
            sach.XUAT();
        }
    }
}
