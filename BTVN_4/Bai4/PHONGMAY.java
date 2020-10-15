
package Bai4;

import java.util.Scanner;

public class PHONGMAY {
    private String maP;
    private String tenP;
    private Float dt;
    private QUANLY x;
    private MAY y[];
    int n;
            
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma phong : ");
        maP = sc.nextLine();
        System.out.print("Ten phong : ");
        tenP = sc.nextLine();
        System.out.print("Dien tich : ");
        dt=sc.nextFloat();
        x = new QUANLY();
        x.NHAP();
        System.out.print("So luong may , n = ");
        n=sc.nextInt();
        y = new MAY[n];
        for(int i =0;i<n;i++){
            y[i] = new MAY();
            y[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.print("Ma phong : "+maP);
        System.out.print("\tTen phong : "+tenP);
        System.out.print("\tDien tich : "+dt+" m2");
        x.XUAT();
        for(MAY may:y){
            may.XUAT();
        }
    }
    public PHONGMAY(){
    }

    public PHONGMAY(String maP, String tenP, Float dt, QUANLY x, MAY[] y, int n) {
        this.maP = maP;
        this.tenP = tenP;
        this.dt = dt;
        this.x = x;
        this.y = y;
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

    public Float getDt() {
        return dt;
    }

    public void setDt(Float dt) {
        this.dt = dt;
    }

    public QUANLY getX() {
        return x;
    }

    public void setX(QUANLY x) {
        this.x = x;
    }

    public MAY[] getY() {
        return y;
    }

    public void setY(MAY[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}
