
package Buoi5_Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    private String maL;
    private String tenL;
    private String ngayM;
    private ArrayList<SinhVien> list;
    private int n;
    private String giaoV;
    
    public LopHoc(){
        
    }

    public LopHoc(String maL, String tenL, String ngayM, ArrayList<SinhVien> list, int n, String giaoV) {
        this.maL = maL;
        this.tenL = tenL;
        this.ngayM = ngayM;
        this.list = list;
        this.n = n;
        this.giaoV = giaoV;
    }

    public String getMaL() {
        return maL;
    }

    public void setMaL(String maL) {
        this.maL = maL;
    }

    public String getTenL() {
        return tenL;
    }

    public void setTenL(String tenL) {
        this.tenL = tenL;
    }

    public String getNgayM() {
        return ngayM;
    }

    public void setNgayM(String ngayM) {
        this.ngayM = ngayM;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoV() {
        return giaoV;
    }

    public void setGiaoV(String giaoV) {
        this.giaoV = giaoV;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma lop: ");
        maL = sc.nextLine();
        System.out.print("Ten lop: ");
        tenL = sc.nextLine();
        System.out.print("Ngay mo: ");
        ngayM = sc.nextLine();
        System.out.print("Giao vien: ");
        giaoV = sc.nextLine();
        System.out.print("So sv: ");
        n = sc.nextInt();
        list = new ArrayList<>();
        for(int i =0;i<n;i++){
            SinhVien sv = new SinhVien();
            sv.NHAP();
            list.add(sv);
        }
    }
    public void Xuat(){
        System.out.println("Ma lop : "+maL);
        System.out.println("Ten lop : "+tenL);
        System.out.println("Ngay mo : "+ngayM);
        for(int i =0;i<n;i++){
            list.get(i).XUAT();
            System.out.println("");
        }
        System.out.println("Giao vien : "+giaoV);
    }
}
