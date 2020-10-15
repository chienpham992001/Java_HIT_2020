
package Bai4;

import java.util.Scanner;

public class MAY {
    private String maMay;
    private String km;
    private String tt;
    
    public MAY(){
    }
    
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMa may : ");
        maMay = sc.nextLine();
        System.out.print("Kieu may : ");
        km = sc.nextLine();
        System.out.print("Tinh trang : ");
        tt = sc.nextLine();
    }
    public void XUAT(){
        System.out.print("Ma may : "+maMay);
        System.out.print("\tKieu may : "+km);
        System.out.println("\tTinh trang : "+tt);
    }

    public MAY(String maMay, String km, String tt) {
        this.maMay = maMay;
        this.km = km;
        this.tt = tt;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }
    
}
