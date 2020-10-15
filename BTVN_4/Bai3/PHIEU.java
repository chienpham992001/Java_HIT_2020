
package Bai3;

import java.util.Scanner;

public class PHIEU {
    private String maPhieu;
    int n;
    private HANG x[];
    
    public void NHAP(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap ma phieu : ");
        maPhieu = sc.nextLine();
        System.out.println("n = ");
        n = sc.nextInt();
        x = new HANG[n];
        for(int i =0;i<n;i++){
            x[i]=new HANG();
            x[i].NHAP();
        }
    }
    public void XUAT(){
        int T=0;
        System.out.println("Nhap ma phieu : "+maPhieu);
        for(int i =0;i<n;i++){
            T+=x[i].getDonGia();
            x[i].XUAT();
        }
        System.out.println("Tong tien = "+T);
    }

    public PHIEU(){
    }
    
    public PHIEU(String maPhieu, int n, HANG[] x) {
        this.maPhieu = maPhieu;
        this.n = n;
        this.x = x;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public HANG[] getX() {
        return x;
    }

    public void setX(HANG[] x) {
        this.x = x;
    }
    
    
}
