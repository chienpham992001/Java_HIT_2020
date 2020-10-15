
package Bai3;

import java.util.Scanner;

public class HANG {
    private String maHang;
    private String tenHang;
    private int donGia;
    
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang : ");
        maHang = sc.nextLine();
        System.out.print("Ten hang : ");
        tenHang = sc.nextLine();
        System.out.print("Don gia : ");
        donGia = sc.nextInt();
    }
    public void XUAT(){
        System.out.print("Ma hang : "+maHang);
        System.out.print("\tTen hang : "+tenHang);
        System.out.println("\tDon gia : "+donGia);
    }

    public HANG(){
    }
    public HANG(String maHang, String tenHang, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
}
