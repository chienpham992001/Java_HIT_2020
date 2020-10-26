
package Buoi5_Bai1;

import java.util.Scanner;

public class SanPham {
    private String maSp;
    private String tenSp;
    private String tenH;
    private String date;
    
    public SanPham(){
    }

    public SanPham(String maSp, String tenSp, String tenH, String date) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.tenH = tenH;
        this.date = date;
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

    public String getTenH() {
        return tenH;
    }

    public void setTenH(String tenH) {
        this.tenH = tenH;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", tenH=" + tenH + ", date=" + date + '}';
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sp : ");
        maSp = sc.nextLine();
        System.out.print("Nhap ten sp : ");
        tenSp = sc.nextLine();
        System.out.print("Nhap hang sx : ");
        tenH = sc.nextLine();
        System.out.print("Ngay sx : ");
        date = sc.nextLine();
    }
    public void Output(){
        System.out.print("Ma sp : "+maSp);
        System.out.print("\nTen sp : "+tenSp);
        System.out.print("\nHang sx : "+tenH);
        System.out.print("\nNgay sx : "+date);
    }
}
