
package Buoi5_Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maP;
    private String tenP;
    private DateTime a;
    private ArrayList<SanPham> x = new ArrayList<>();
    private int n;
    
    public Phieu(){
    }
    public Phieu(String maP, String tenP, DateTime a, int n) {
        this.maP = maP;
        this.tenP = tenP;
        this.a = a;
        this.n = n;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getTenP() {
        return tenP;
    }

    public void setTenP(String tenP) {
        this.tenP = tenP;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<SanPham> getX() {
        return x;
    }

    public void setX(ArrayList<SanPham> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void InputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phieu : ");
        maP= sc.nextLine();
        System.out.print("Nhap ten phieu : ");
        tenP=sc.nextLine();
        a= new DateTime();
        a.InputDate();
        System.out.print("So luong sp :");
        n= sc.nextInt();
        for(int i =0;i<n;i++){
            SanPham sp = new SanPham();
            sp.InputSp();
            x.add(sp);
        }
    }
    public void OutputPhieu(){
        System.out.println("Ma phieu : "+maP);
        System.out.println("Ten phieu : "+tenP);
        a.OutputDate();
        System.out.println(String.format("%10s %20s %15s %15s %15s","Ma san pham","Ten san pham","So luong","Don gia","Thanh tien"));
        for(SanPham sp:x){
            sp.OutputSp();
        }
    }
}
