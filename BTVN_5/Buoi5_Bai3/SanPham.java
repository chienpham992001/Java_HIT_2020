
package Buoi5_Bai3;

import java.util.Scanner;

public class SanPham {
    private String maSp;
    private String tenSp;
    private int sl;
    private int gia;
    
    public SanPham(){
    }

    public SanPham(String maSp, String tenSp, int sl, int gia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.sl = sl;
        this.gia = gia;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void InputSp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sp : ");
        maSp = sc.nextLine();
        System.out.print("Nhap ten sp : ");
        tenSp = sc.nextLine();
        System.out.print("Nhap so luong : ");
        sl = sc.nextInt();
        System.out.print("Nhap gia : ");
        gia = sc.nextInt();
    }
    public void OutputSp(){
        System.out.println(String.format("%10s %20s %15d %15d %15d",maSp,tenSp,sl,gia,sl*gia));
    }
}
