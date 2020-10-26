
package Buoi5_Bai5;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSv;
    private String nganh;
    private int khoa;
    
    public SinhVien(){
        
    }
    
    public SinhVien(String maSv, String nganh, int khoa) {
        this.maSv = maSv;
        this.nganh = nganh;
        this.khoa = khoa;
    }

    public SinhVien(String maSv, String nganh, int khoa, String hoTen, String date, String dc) {
        super(hoTen, date, dc);
        this.maSv = maSv;
        this.nganh = nganh;
        this.khoa = khoa;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Ma sinh vien : ");
        maSv = sc.nextLine();
        System.out.print("Nganh :  ");
        nganh = sc.nextLine();
        System.out.print("Khoa : ");
        khoa = sc.nextInt();
    }
    public void XUAT(){
        super.Xuat();
        System.out.printf("%15s %15s %15d",maSv,nganh,khoa);
    }
}
